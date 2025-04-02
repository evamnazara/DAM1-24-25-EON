-- 73._ ¿Quién es el propietario que posee más pisos de más de 2 habitaciones que no están situados en la zona centro?o?

-- multitabla
SELECT TOP 1 
    P.DNI,
    P.NOMBRE + ' ' + P.APELLIDO1 + ' ' + ISNULL(P.APELLIDO2, ' ') AS NombreCompleto, 
    COUNT(*) AS NumPisos
FROM PISO PS
    
    INNER JOIN PROPIETARIO P ON PS.DNIPROPIETARIO = P.DNI
    INNER JOIN VIVIENDA V ON PS.CALLE = V.CALLE AND PS.NUMERO = V.NUMERO

WHERE PS.NUMHABITACIONES > 2 AND V.NOMBREZONA LIKE 'Centro'
    GROUP BY P.DNI
    ORDER BY NumPisos DESC

--subconsulta

SELECT TOP  1 DNI, 
            P.NOMBRE + ' ' + P.APELLIDO1 + ' ' + ISNULL(P.APELLIDO2, ' ') AS NombreCompleto, 
            COUNT(*) AS NumPisos
FROM (
    SELECT P.DNI, P.NOMBRE + ' ' + P.APELLIDO1 + ' ' + ISNULL(P.APELLIDO2, ' ') AS NombreCompleto, 
    FROM PISO PS
        INNER JOIN VIVIENDA V ON PS.CALLE = V.CALLE AND PS.NUMERO = V.NUMERO
        INNER JOIN PROPIETARIO P ON PS.DNIPROPIETARIO = P.DNI
    WHERE PS.NUMHABITACIONES > 2 AND V.NOMBREZONA LIKE 'Centro'
) AS Sub
GROUP BY DNI, NOMBRE, APELLIDO1, APELLIDO2
ORDER BY NumPisos DESC;

-- 74._ Indica para cada bloque de pisos (calle y número) el máximo de metros útiles y máximo de número de habitaciones, pero sólo para aquellos bloques en los que tenemos almacenados más de 3 pisos.

SELECT BP.CALLE, BP.NUMERO,
       MAX(P.METROSUTILES) AS MaxMetrosUtiles,
       MAX(P.NUMHABITACIONES) AS MaxHabitaciones
FROM BLOQUEPISOS BP
    
    INNER JOIN PISO P ON BP.CALLE = P.CALLE AND BP.NUMERO = P.NUMERO
    
    GROUP BY BP.CALLE, BP.NUMERO
HAVING COUNT(*) > 3;

-- 75._ Obtén el DNI, nombre y apellidos de las personas que tenemos en nuestra base de datos. En el caso de que posean una vivienda de cualquier tipo deberá visualizarse la calle y número de la vivienda de la que son propietarios. Deberá ir ordenado por apellidos y nombre ascendentemente

-- subconsulta

SELECT NOMBRE + ' ' + APELLIDO1 + ' ' + ISNULL(APELLIDO2, ' ') AS NombreCompleto,
        DNI, CALLE, NUMERO

FROM (
    SELECT P.DNI, P.NOMBRE, P.APELLIDO1, P.APELLIDO2, V.CALLE, V.NUMERO
        FROM PROPIETARIO P

    INNER JOIN PISO PS ON P.DNI = PS.DNIPROPIETARIO
    INNER JOIN VIVIENDA V ON PS.CALLE = V.CALLE AND PS.NUMERO = V.NUMERO
        UNION
    SELECT P.DNI, P.NOMBRE, P.APELLIDO1, P.APELLIDO2, V.CALLE, V.NUMERO
        FROM PROPIETARIO P

    INNER JOIN CASAPARTICULAR CP ON P.DNI = CP.DNIPROPIETARIO
    INNER JOIN VIVIENDA V ON CP.CALLE = V.CALLE AND CP.NUMERO = V.NUMERO
) AS ViviendasPropietario
ORDER BY APELLIDO1, APELLIDO2, NOMBRE

--union 
SELECT DISTINCT
    P.NOMBRE + ' ' + P.APELLIDO1 + ' ' + ISNULL(P.APELLIDO2, ' ') AS NombreCompleto, 
    P.DNI,
    V.CALLE,
    V.NUMERO
FROM PROPIETARIO P
    INNER JOIN PISO PS ON P.DNI = PS.DNIPROPIETARIO
    INNER JOIN VIVIENDA V ON PS.CALLE = V.CALLE AND PS.NUMERO = V.NUMERO

    UNION

    SELECT DISTINCT
    P.NOMBRE + ' ' + P.APELLIDO1 + ' ' + ISNULL(P.APELLIDO2, ' ') AS NombreCompleto, 
    P.DNI,
    V.CALLE,
    V.NUMERO
        FROM PROPIETARIO P

            INNER JOIN CASAPARTICULAR CP ON P.DNI = CP.DNIPROPIETARIO
            INNER JOIN VIVIENDA V ON CP.CALLE = V.CALLE AND CP.NUMERO = V.NUMERO

ORDER BY APELLIDO1, APELLIDO2, NOMBRE;



-- 76._ ¿Quién es el propietario de la bodega más pequeña? Debe visualizarse nombre y apellidos.


SELECT TOP 1 P.NOMBRE, P.APELLIDO1, P.APELLIDO2
    FROM HUECO H
    INNER JOIN PROPIETARIO P ON H.DNIPROPIETARIO = P.DNI
WHERE H.TIPO = 'Bodega'
    ORDER BY H.METROS ASC;

-- etsandar

SELECT P.NOMBRE, P.APELLIDO1, P.APELLIDO2
    FROM HUECO H

INNER JOIN PROPIETARIO P ON H.DNIPROPIETARIO = P.DNI
    WHERE H.TIPO = 'Bodega' AND H.METROS = (
            SELECT MIN(METROS)
            FROM HUECO
            WHERE TIPO = 'Bodega'
        );

-- 77._ Obtén el nombre completo y DNI de las mujeres que tenemos en nuestra base de datos. En el caso de que posean un trastero de más de 10 metros o un garaje de menos de 13 metros deberá visualizarse la calle , número, tipo y metros de la propiedad que poseen.



SELECT P.DNI, P.NOMBRE + ' ' + P.APELLIDO1 + ' ' + P.APELLIDO2 AS NombreCompleto,
       H.CALLE, H.NUMERO, H.TIPO, H.METROS
FROM PROPIETARIO P
INNER JOIN HUECO H ON P.DNI = H.DNIPROPIETARIO
    WHERE P.SEXO = 'M' AND (
        (H.TIPO = 'Trastero' AND H.METROS > 10)
        OR 
        (H.TIPO = 'Garaje' AND H.METROS < 13)
    )

-- 78._ Muestra el nombre de la zona urbana que más “propiedades” posee. Entendiendo como propiedades tanto los pisos, como las viviendas unifamiliares como huecos.

-- Usando TOP 1

SELECT TOP 1 NOMBREZONA, COUNT(*) AS numeroPropiedades
FROM (
    SELECT V.NOMBREZONA FROM VIVIENDA V
        JOIN PISO P ON V.CALLE = P.CALLE AND V.NUMERO = P.NUMERO
    UNION
    SELECT V.NOMBREZONA FROM VIVIENDA V
        JOIN CASAPARTICULAR C ON V.CALLE = C.CALLE AND V.NUMERO = C.NUMERO
    UNION
        SELECT V.NOMBREZONA FROM VIVIENDA V
    JOIN HUECO H ON V.CALLE = H.CALLE AND V.NUMERO = H.NUMERO
) AS Propiedades
    GROUP BY NOMBREZONA
    ORDER BY numeroPropiedades DESC;

--
-- subconsulta
SELECT TOP 1 NOMBREZONA, COUNT(*) AS TotalPropiedades
    FROM (
        SELECT V.NOMBREZONA FROM VIVIENDA V JOIN PISO P ON V.CALLE = P.CALLE AND V.NUMERO = P.NUMERO
            UNION 
        SELECT V.NOMBREZONA FROM VIVIENDA V JOIN CASAPARTICULAR C ON V.CALLE = C.CALLE AND V.NUMERO = C.NUMERO
            UNION 
        SELECT V.NOMBREZONA FROM VIVIENDA V JOIN HUECO H ON V.CALLE = H.CALLE AND V.NUMERO = H.NUMERO
    ) AS numeroPropiedades

    GROUP BY NOMBREZONA
    ORDER BY COUNT(*) DESC
    
-- estandar

SELECT NOMBREZONA, COUNT(*) AS numeroPropiedades
FROM (
    SELECT V.NOMBREZONA FROM VIVIENDA V
        JOIN PISO P ON V.CALLE = P.CALLE AND V.NUMERO = P.NUMERO
    UNION 
    SELECT V.NOMBREZONA FROM VIVIENDA V
        JOIN CASAPARTICULAR C ON V.CALLE = C.CALLE AND V.NUMERO = C.NUMERO
    UNION 
        SELECT V.NOMBREZONA FROM VIVIENDA V
    JOIN HUECO H ON V.CALLE = H.CALLE AND V.NUMERO = H.NUMERO
) AS numeroPropiedades
    GROUP BY NOMBREZONA
    
HAVING COUNT(*) = (
    SELECT MAX(contadorZonas)
    FROM (
        SELECT COUNT(*) AS contadorZonas
        FROM (
            SELECT V.NOMBREZONA FROM VIVIENDA V
                JOIN PISO P ON V.CALLE = P.CALLE AND V.NUMERO = P.NUMERO
            UNION 
            SELECT V.NOMBREZONA FROM VIVIENDA V
                JOIN CASAPARTICULAR C ON V.CALLE = C.CALLE AND V.NUMERO = C.NUMERO
            UNION 
            SELECT V.NOMBREZONA FROM VIVIENDA V
                JOIN HUECO H ON V.CALLE = H.CALLE AND V.NUMERO = H.NUMERO
        ) AS Sub
        GROUP BY NOMBREZONA
    ) AS ZonasconPropiedades
);




