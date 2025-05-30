-- 1._ Haz una consulta que muestre las zonas urbanas (nombre y descripción) donde hay algún bloque de pisos sin ascensor.

-- multitabla
SELECT DISTINCT Z.NOMBREZONA, Z.DESCRIPCIÓN
FROM ZONAURBANA Z
    INNER JOIN VIVIENDA V ON Z.NOMBREZONA = V.NOMBREZONA
    INNER JOIN BLOQUEPISOS B ON V.CALLE = B.CALLE AND V.NUMERO = B.NUMERO
WHERE B.ASCENSOR = 'No'

-- subconsulta
SELECT NOMBREZONA, DESCRIPCIÓN
FROM ZONAURBANA

WHERE NOMBREZONA IN (
    SELECT V.NOMBREZONA
    FROM VIVIENDA V
        INNER JOIN BLOQUEPISOS B ON V.CALLE = B.CALLE AND V.NUMERO = B.NUMERO
    WHERE B.ASCENSOR = 'No'
)

-- 2._ Lo mismo que la anterior pero indicando cuantos bloques hay en cada zona, poniendo 0 en el caso de que no haya ningún bloque sin ascensor en esa zona.

-- multitabla
SELECT Z.NOMBREZONA, Z.DESCRIPCIÓN, COUNT(B.NUMERO) AS BloquesSinAscensor
FROM ZONAURBANA Z
    LEFT JOIN VIVIENDA V ON Z.NOMBREZONA = V.NOMBREZONA
    LEFT JOIN BLOQUEPISOS B ON V.CALLE = B.CALLE AND V.NUMERO = B.NUMERO AND B.ASCENSOR = 'N'

GROUP BY Z.NOMBREZONA, Z.DESCRIPCIÓN

-- subconsulta
SELECT Z.NOMBREZONA, Z.DESCRIPCIÓN,
    (
        SELECT COUNT(*)
        FROM VIVIENDA V2
            INNER JOIN BLOQUEPISOS B2 ON V2.CALLE = B2.CALLE AND V2.NUMERO = B2.NUMERO
        WHERE V2.NOMBREZONA = Z.NOMBREZONA AND B2.ASCENSOR = 'N'
    ) AS BloquesSinAscensor
FROM ZONAURBANA Z


-- 3._ Haz una consulta que muestre las zonas urbanas en las que hay más de 2 piscinas.
-- multitabla
SELECT V.NOMBREZONA
FROM CASAPARTICULAR C
    INNER JOIN VIVIENDA V ON C.CALLE = V.CALLE AND C.NUMERO = V.NUMERO
WHERE C.PISCINA = 'Si'

GROUP BY V.NOMBREZONA
    HAVING COUNT(*) > 2

-- subconsulta
SELECT NOMBREZONA
FROM VIVIENDA
WHERE (
        SELECT COUNT(*)
        FROM CASAPARTICULAR C
        WHERE C.CALLE = VIVIENDA.CALLE AND C.NUMERO = VIVIENDA.NUMERO AND C.PISCINA = 'SI') > 0

GROUP BY NOMBREZONA
    HAVING COUNT(*) > 2


-- 4._Haz una consulta que devuelva DNI, y nombre completo de las hombres que no poseen ningún piso y tienen algún garaje en la zona Centro o algún trastero en la zona Palomar.

-- multitabla
SELECT DISTINCT P.DNI, P.NOMBRE + ' ' + P.APELLIDO1 + ' ' + P.APELLIDO2 AS NOMBRE_COMPLETO
FROM PROPIETARIO P
    LEFT JOIN PISO PS ON P.DNI = PS.DNIPROPIETARIO
    INNER JOIN HUECO H ON P.DNI = H.DNIPROPIETARIO
    INNER JOIN VIVIENDA V ON H.CALLE = V.CALLE AND H.NUMERO = V.NUMERO

WHERE P.SEXO = 'H'
  AND PS.DNIPROPIETARIO IS NULL
  AND (
      (H.TIPO = 'GARAJE' AND V.NOMBREZONA = 'Centro') 
      OR
      (H.TIPO = 'TRASTERO' AND V.NOMBREZONA = 'Palomar')
    )

-- subconsulta
SELECT NOMBRE + ' ' + APELLIDO1 + ' ' + ISNULL(APELLIDO2, ' ') AS NombreCompleto,
FROM PROPIETARIO

WHERE SEXO = 'H'
    AND DNI NOT IN 
        (SELECT DNIPROPIETARIO FROM PISO)
    AND DNI IN 
    (
    SELECT DNIPROPIETARIO
    FROM HUECO H
        INNER JOIN VIVIENDA V ON H.CALLE = V.CALLE AND H.NUMERO = V.NUMERO
    WHERE 
        (H.TIPO = 'GARAJE' AND V.NOMBREZONA = 'Centro')
        OR 
        (H.TIPO = 'TRASTERO' AND V.NOMBREZONA = 'Palomar')
    )   


-- 5._ ¿Cuántas mujeres tienen una casa con piscina y un piso con ascensor?

-- multitabla
SELECT COUNT(DISTINCT P.DNI) AS DNIMujeres,
        NOMBRE + ' ' + APELLIDO1 + ' ' + ISNULL(APELLIDO2, ' ') AS NombreCompleto

FROM PROPIETARIO P
    INNER JOIN CASAPARTICULAR C ON P.DNI = C.DNIPROPIETARIO AND C.PISCINA = 'S'
    INNER JOIN PISO PS ON P.DNI = PS.DNIPROPIETARIO
    INNER JOIN BLOQUEPISOS B ON PS.CALLE = B.CALLE AND PS.NUMERO = B.NUMERO AND B.ASCENSOR = 'S'
WHERE P.SEXO = 'M';

-- 6._ Para los diferentes propietarios varones, visualiza el DNI, nombre completo y un mensaje que indique si posee alguna vivienda particular o en caso contrario indicando que no posee ninguna. Un ejemplo de salida sería:

-- multitabla
SELECT P.DNI, P.NOMBRE + ' ' + P.APELLIDO1 + ' ' + ISNULL(P.APELLIDO2, ' ') AS NOMBREPROPIETARIO,
       CASE 
            WHEN C.DNIPROPIETARIO IS NOT NULL THEN 'POSEE AL MENOS UNA CASA PARTICULAR'
            ELSE 'NO TIENE NINGUNA CASA PARTICULAR' 
        END AS DESCRIPCION

FROM PROPIETARIO P
    LEFT JOIN CASAPARTICULAR C ON P.DNI = C.DNIPROPIETARIO
WHERE P.SEXO = 'H'
GROUP BY P.DNI, P.NOMBRE, P.APELLIDO1, P.APELLIDO2, C.DNIPROPIETARIO;

-- subconsulta
SELECT DNI, NOMBRE + ' ' + APELLIDO1 + ' ' + ISNULL(APELLIDO2, ' ') AS NombreCompleto
       CASE 
            WHEN DNI IN 
                (SELECT DNIPROPIETARIO FROM CASAPARTICULAR)
                THEN 'POSEE AL MENOS UNA CASA PARTICULAS'
            ELSE 'NO TIENE NINGUNA CASA PARTICULAR' 
        END AS DESCRIPCION
FROM PROPIETARIO
WHERE SEXO = 'H';



-- 7._ Para los diferentes propietarios varones, visualiza el DNI, nombre completo, un mensaje que indique si posee alguna vivienda particular o en caso contrario indicando que no posee ninguna y un mensaje que indique si posee algún piso o en caso contrario indicando que no posee ninguno. Un ejemplo de salida sería:

-- multitabla
SELECT P.DNI, P.NOMBRE + ' ' + P.APELLIDO1 + ' ' + ISNULL(P.APELLIDO2, ' ') AS NombreCompleto,
        CASE 
            WHEN C.DNIPROPIETARIO IS NOT NULL THEN 'POSEE AL MENOS UNA CASA PARTICULAR'
            ELSE 'NO TIENE NINGUNA CASA PARTICULAR' 
        END AS MENSAJE_VIVIENDA,

        CASE 
            WHEN PS.DNIPROPIETARIO IS NOT NULL THEN 'POSEE AL MENOS UN PISO'
            ELSE 'NO TIENE NINGUN PISO' 
        END AS DESCRIPCIONCASA
FROM PROPIETARIO P
    LEFT JOIN CASAPARTICULAR C ON P.DNI = C.DNIPROPIETARIO
    LEFT JOIN PISO PS ON P.DNI = PS.DNIPROPIETARIO
WHERE P.SEXO = 'H'
GROUP BY P.DNI, P.NOMBRE, P.APELLIDO1, P.APELLIDO2, C.DNIPROPIETARIO, PS.DNIPROPIETARIO;

--  subconsulta
SELECT DNI,
       NOMBRE + ' ' + APELLIDO1 + ' ' + APELLIDO2 AS NOMBRE_COMPLETO,

       CASE WHEN DNI IN (SELECT DNIPROPIETARIO FROM CASAPARTICULAR)
            THEN 'POSEE AL MENOS UNA CASA PARTICULAR'            
            ELSE 'NO TIENE NINGUNA CASA PARTICULAR' 
        END AS MENSAJEVIVIENDA,

       CASE WHEN DNI IN (SELECT DNIPROPIETARIO FROM PISO)
            THEN 'POSEE AL MENOS UN PISO'
            ELSE 'NO TIENE NINGUN PISO' 
        END AS DESCRIPCIONPISO

FROM PROPIETARIO
WHERE SEXO = 'H';



-- 8._ Haz una consulta que muestre cuantos propietarios varones hay en cada zona urbana. En el caso de que no haya ninguno debe visualizarse el nombre de la zona y 0 en la columna correspondiente al número de propietarios.

--union 

SELECT Z.NOMBREZONA, COUNT(DISTINCT P.DNI) AS NUM_PROPIETARIOS_HOMBRES
FROM ZONAURBANA Z
LEFT JOIN (
    SELECT DISTINCT C.DNIPROPIETARIO, V.NOMBREZONA
    FROM CASAPARTICULAR C
        INNER JOIN VIVIENDA V ON C.CALLE = V.CALLE AND C.NUMERO = V.NUMERO

    UNION
    SELECT DISTINCT PS.DNIPROPIETARIO, V.NOMBREZONA
    FROM PISO PS
        INNER JOIN VIVIENDA V ON PS.CALLE = V.CALLE AND PS.NUMERO = V.NUMERO
) 
VIV ON Z.NOMBREZONA = VIV.NOMBREZONA
    LEFT JOIN PROPIETARIO P ON VIV.DNIPROPIETARIO = P.DNI AND P.SEXO = 'H'
GROUP BY Z.NOMBREZONA;


-- 9._ Haz una consulta que devuelva los metros del solar, el total de metros útiles y metros construídos en cada bloque ordenados por metros construídos de mayor a menor y dentro de este por metros útiles de mayor a menor.

SELECT V.CALLE, V.NUMERO, V.METROSSOLAR,
       SUM(P.METROSUTILES) AS TOTALMETROUTILES,
       SUM(P.METROSCONSTRUIDOS) AS TOTALMETROSCONSTRUIDOS
FROM VIVIENDA V
JOIN PISO P ON V.CALLE = P.CALLE AND V.NUMERO = P.NUMERO
WHERE V.TIPOVIVIENDA = 'Bloque'

GROUP BY V.CALLE, V.NUMERO, V.METROSSOLAR
ORDER BY TOTALMETROUTILES DESC, 
        TOTALMETROSCONSTRUIDOS DESC;



/*10._ Modifica la consulta anterior para que además de esa información indique cuantas viviendas (pisos) hay en cada bloque (usando la tabla piso) y cuantos propietarios distintos hay en cada bloque. En este caso ordénalos de menor a mayor por el número de viviendas y dentro de este por el número de propietarios distintos.*/

SELECT V.CALLE, V.NUMERO, V.METROSSOLAR,
       COUNT(*) AS NUMPISOS,
       COUNT(DISTINCT P.DNIPROPIETARIO) AS PROPIETARIOS,
       SUM(P.METROSUTILES) AS TOTALMETROUTILES,
       SUM(P.METROSCONSTRUIDOS) AS TOTALMETROSCONSTRUIDOS
FROM VIVIENDA V
JOIN PISO P ON V.CALLE = P.CALLE AND V.NUMERO = P.NUMERO
WHERE V.TIPOVIVIENDA = 'Bloque'

GROUP BY V.CALLE, V.NUMERO, V.METROSSOLAR
ORDER BY NUMPISOS ASC, 
PROPIETARIOS ASC


-- 11._ Haz una consulta que devuelva el/los propietarios (nombre completo) que más metros cuadrados poseen en Trasteros y Bodegas.

WITH MetrosPorPropietario AS (
    SELECT DNIPROPIETARIO, SUM(METROS) AS TOTAL_METROS
    FROM HUECO
    WHERE TIPO IN ('TRASTERO', 'BODEGA') 
        AND DNIPROPIETARIO IS NOT NULL
    GROUP BY DNIPROPIETARIO
),
MaxMetros AS (
    SELECT MAX(TOTAL_METROS) AS MAXMETROS FROM MetrosPorPropietario
)
SELECT P.NOMBRE + ' ' + P.APELLIDO1 + ' ' + ISNULL(P.APELLIDO2, ' ') AS NombreCompleto
FROM MetrosPorPropietario M
    INNER JOIN MAXMETROS MM ON M.TOTAL_METROS = MM.MaxMetros
    INNER JOIN PROPIETARIO P ON P.DNI = M.DNIPROPIETARIO;



-- 12._ ¿Cuántos metros construídos posee cada propietario? 
--Haz una consulta que muestre el total de metros construídos que posee cada uno. En el caso de no tener ningún piso o vivienda unifamiliar debes poner 0 en la columna correspondiente.

SELECT P.NOMBRE + ' ' + P.APELLIDO1 + ' ' + ISNULL(P.APELLIDO2, ' ') AS NombreCompleto,
       ISNULL(PC.METROS, 0) + ISNULL(PP.METROS, 0) AS TOTAL_METROS_CONSTRUIDOS
FROM PROPIETARIO P
    LEFT JOIN (
        SELECT DNIPROPIETARIO, SUM(METROSCONSTRUIDOS) AS METROS
        FROM CASAPARTICULAR
        GROUP BY DNIPROPIETARIO
    ) PC ON P.DNI = PC.DNIPROPIETARIO
    LEFT JOIN (
        SELECT DNIPROPIETARIO, SUM(METROSCONSTRUIDOS) AS METROS
        FROM PISO
        GROUP BY DNIPROPIETARIO
    ) PP ON P.DNI = PP.DNIPROPIETARIO



-- 13._ Haz un listado de las propietarias (DNI, nombre completo y teléfono) que tienen un garaje pero no tienen ningún piso con ascensor.

SELECT DISTINCT P.DNI, P.NOMBRE + ' ' + P.APELLIDO1 + ' ' + P.APELLIDO2 AS NOMBRE_COMPLETO, P.TELEFONO
FROM PROPIETARIO P
JOIN HUECO H ON P.DNI = H.DNIPROPIETARIO AND H.TIPO = 'GARAJE'
WHERE P.SEXO = 'M'
  AND P.DNI NOT IN (
      SELECT DISTINCT PS.DNIPROPIETARIO
      FROM PISO PS
      JOIN BLOQUEPISOS B ON PS.CALLE = B.CALLE AND PS.NUMERO = B.NUMERO
      WHERE B.ASCENSOR = 'S'
  )
