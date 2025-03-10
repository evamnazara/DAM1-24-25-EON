

-- 1. muestre el nombre, descripción y observaciones de las zonas urbanas.
SELECT nombrezona, descripción, observaciones FROM ZONAURBANA;


-- 2. devuelva el nombre de la calle, número y número de plantas de las viviendas unifamiliares

SELECT calle, numero, numplantas FROM CASAPARTICULAR;

-- 3. nombre de la calle, número y metros construidos de las viviendas unifamiliares que tienen piscina.

SELECT calle, numero, metrosconstruidos FROM CASAPARTICULAR WHERE  PISCINA ='S';

-- 4. calle, número y metros del solar de las viviendas unifamiliares.  
SELECT calle, numero, METROSSOLAR FROM VIVIENDA where TIPOVIVIENDA = 'Casa';

-- 5. información de los pisos que tienen 3 habitaciones.

SELECT * FROM PISO WHERE NUMHABITACIONES = '3';

-- 6. obtener una relación de viviendas unifamiliares (calle, número y metros de solar) de aquellas viviendas en las que los metros de solar están entre 190 y 300 metros.

SELECT calle, numero, METROSSOLAR FROM VIVIENDA 
	WHERE METROSSOLAR BETWEEN 190 AND 300
	AND TIPOVIVIENDA = 'Casa';

-- 7. relación de bloques de pisos que tienen más de 15 vecinos (pisos) ordenados por calle y número.

	--SELECT * from BLOQUEPISOS where PROPIETARIO > 15 ;  

-- 8. calle, número y metros del solar de las viviendas unifamiliares situadas en la zona centro.
SELECT calle, numero, metrossolar FROM VIVIENDA WHERE NOMBREZONA = 'centro';

-- 9. devuelva DNI, nombre y apellidos de las personas que tienen López como primer apellido ordenadas por apellidos y nombre.

SELECT DNI,NOMBRE,APELLIDO1,APELLIDO2 FROM PROPIETARIO 
	WHERE APELLIDO1 = 'López' ORDER BY APELLIDO1;


-- 10. calle, número y metros del solar de los bloques de pisos situados en la zona Centro o Palomar que tienen mas de 450 metros de solar

SELECT CALLE,NUMERO,METROSSOLAR FROM VIVIENDA 
	WHERE (NOMBREZONA = 'CENTRO' OR NOMBREZONA = 'PALOMAR')
		AND (METROSSOLAR > 450);


-- 11. consulta que muestre los garajes que están sin vender ordenados por calle, número e id_hueco

SELECT * FROM HUECO 
	WHERE TIPO = 'GARAJE' AND DNIPROPIETARIO IS NULL
	ORDER BY CALLE, NUMERO, ID_HUECO;

-- 12. nombre y descripción de las zonas urbanas que tienen más de 1 parque ordenadas por el número de parque descendente y nombre ascendente

SELECT nombrezona, descripción FROM ZONAURBANA 
	WHERE NUMPARQUES > 1 
	ORDER BY NUMPARQUES desc;


-- 13. Mostrar toda la información de las zonas urbanas que tienen algo escrito en el campo de observaciones.
select * from ZONAURBANA where OBSERVACIONES is not null;

-- 14. consulta que devuelva DNI, nombre y apellidos de las personas que tienen un nombre de 3 letras, ordenado por nombre y apellidos 

SELECT DNI, NOMBRE, APELLIDO1, APELLIDO2 FROM PROPIETARIO
 WHERE LEN(NOMBRE) = 3;

 
-- 15. que muestre calle, número, planta, puerta, metros (construidos y útiles) y la diferencia existente entre los metros construidos y los metros útiles ordenados por esta diferencia descendentemente


-- 16.  datos de calle, número, planta, puerta y número de habitaciones de los pisos que tienen 1, 3, 5 ó 6 habitaciones. 


-- 17. toda la información de los pisos que tienen 1, 3, 5 ó 6 habitaciones cuyos metros construídos superen en más de 10 a los metros útiles. 
--Deberás mostrar también la diferencia entre los metros construídos y los metros útiles (llámale a este campo Diferencia)


-- 18. nombres de zona y número de parques de las zonas que poseen menos de 3 parques y en los que el campo de observaciones está vacio.

-- 19. muestre los pisos de dos habitaciones que hay en una calle que empiece por la letra “L” y que tienen menos de 100 metros útiles.


-- 20. Nombres de zona donde hay viviendas unifamiliares construidas ordenadas descendentemente.

