-- 34. Realiza una consulta que devuelva el nombre, apellidos, teléfono y departamento de los empleado y matrícula y modelo del vehículo de los empleados que tienen un vehículo de más de 4 años. Para el teléfono queremos visualizar el teléfono1 en caso de que lo tenga, si no lo tiene miraremos si tiene el teléfono2 y en caso de no tener ninguno visualizará 'Desconocido'.

SELECT 
    E.Nome + ' ' + E.Apelido1 + ' ' + E.Apelido2 AS [Nome completo],
    ISNULL(E.Telefono1, 'Desconocido') AS Telefono1, 
    ISNULL(E.Telefono2, 'Desconocido') AS Telefono2,
    D.NomeDepartamento,
    V.Matricula, V.Modelo
FROM EMPREGADO E
    INNER JOIN DEPARTAMENTO D ON E.NumDepartamentoPertenece = D.NumDepartamento
    INNER JOIN VEHICULO V ON E.NSS = V.NSS
WHERE YEAR(GETDATE()) - YEAR(V.DataCompra) > 4;

-- 35._ Fai unha consulta que devolva información dos cursos que se celebran en Vigo e Pontevedra. Para cada curso queremos saber o nome, número de horas e total de alumnos nas edicións que se teñan celebrado deste curso polo momento. Tamén queremos saber cal foi o número de alumnos máis grande e máis pequeno para cada unha das edicións do curso.



-- 36. ¿Cuántos empleados hay en cada provincia? Se usa los dos primeros caracteres del código postal.Si no tiene código postal, se indicará como 'Desconocida'.

SELECT 
    CASE 
        WHEN SUBSTRING(CP, 1, 2) = '36' THEN 'PONTEVEDRA'
        WHEN SUBSTRING(CP, 1, 2) = '27' THEN 'LUGO'
        WHEN SUBSTRING(CP, 1, 2) = '15' THEN 'SANTIAGO'
        ELSE 'Desconocida'
    END AS Provincia,
    COUNT(*) AS EmpleadosPorProvincia
FROM EMPREGADO

-- 37. Muestra para todos los empleados su nombre completo y si tienen pareja, el nombre de esta indicando si es marido o mujer.

SELECT 
    E.Nome + ' ' + E.Apelido1 + ' ' + E.Apelido2 AS NomeEmpregado,
    ISNULL(F.Nome + ' ' + F.Apelido1 + ' ' + F.Apelido2, 'Sin pareja') AS NomeParella,
    CASE 
        WHEN F.Sexo = 'M' THEN 'Marido'
        WHEN F.Sexo = 'H' THEN 'Mujer'
        ELSE 'Soltero'
    END AS ParejasEmpleados
FROM EMPREGADO E
    LEFT JOIN FAMILIAR F ON E.NSS = F.NSS_empregado 
        AND F.Parentesco IN ('Mujer', 'Marido');

-- 38. ¿Existe algún empleado que trabaje en más de un proyecto en lugares diferentes?
SELECT E.NSS, E.Nome, E.Apelido1, ISNULL(E.Apelido2, ' ') AS Apelido2
FROM EMPREGADO E
    INNER JOIN EMPREGADO_PROXECTO EP ON E.NSS = EP.NSSEmpregado
    INNER JOIN PROXECTO P ON EP.NumProxecto = P.NumProxecto

GROUP BY E.NSS, E.Nome, E.Apelido1, E.Apelido2
    HAVING COUNT(DISTINCT P.Lugar) > 1;

-- 39. Generar un mote para cada empleado con las dos primeras letras de su nombre,  dos segundas de su primer apellido y la primera y última de la localidad donde reside.

--???
SELECT 
    E.NSS,
    SUBSTRING(E.Nome, 1, 2) + SUBSTRING(E.Apelido1, 3, 2) + LEFT(E.Localidade, 1) + RIGHT(E.Localidade, 1) AS MoteEmpleado,
    D.NomeDepartamento
    FROM EMPREGADO E
--??

-- 40. Seleccionar empleados que viven en el mismo lugar donde se desarrolla un proyecto y que no están trabajando en ningún proyecto en la ciudad donde residen.

SELECT P.NomeProxecto, E.NSS, E.Nome, E.Apelido1
FROM EMPREGADO E
    INNER JOIN PROXECTO P ON E.Localidade = P.Lugar
    LEFT JOIN EMPREGADO_PROXECTO EP ON E.NSS = EP.NSSEmpregado
WHERE EP.NumProxecto IS NULL;

-- 41. Lo mismo que la consulta anterior, pero solo para empleados con más de 10 horas disponibles a la semana  (máximo 40 horas semanales).

SELECT P.NomeProxecto, E.NSS, E.Nome, E.Apelido1

FROM EMPREGADO E
    INNER JOIN PROXECTO P ON E.Localidade = P.Lugar
    LEFT JOIN EMPREGADO_PROXECTO EP ON E.NSS = EP.NSSEmpregado
WHERE EP.NumProxecto IS NULL 
    AND (40 - ISNULL(EP.Horas, 0)) > 10;
