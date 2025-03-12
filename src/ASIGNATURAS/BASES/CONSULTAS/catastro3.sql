--32. Obtén el nombre y apellidos de las personas que poseen una vivienda unifamiliar.
SELECT DISTINCT NOMBRE,APELLIDO1,APELLIDO2 
	FROM PROPIETARIO P,CASAPARTICULAR C
	WHERE P.DNI=C.DNIPROPIETARIO
GO

--33. Haz una consulta que muestre la zona, número de parques, calle, número y metros de solar de las viviendas que se encuentran en una zona que posea más de un parque .

SELECT NUMPARQUES, VIVIENDA.CALLE, VIVIENDA.NUMERO,VIVIENDA.METROSSOLAR FROM ZONAURBANA,VIVIENDA
WHERE VIVIENDA.NOMBREZONA = ZONAURBANA.NOMBREZONA

--34. Haz una consulta que muestre para cada vivienda unifamiliar la calle, número, plantas, metros del solar y metros construidos.

SELECT VIVIENDA.CALLE,VIVIENDA.NUMERO,PISO.PLANTA,METROSSOLAR,METROSCONSTRUIDOS 
	FROM VIVIENDA,PISO,CASAPARTICULAR

--35. Obtén el nombre y descripción de las zonas urbanas que tienen más de 2 parques donde se hayan construido bloques de pisos.



--36. Haz una consulta que muestre para cada piso la calle, número, planta, puerta, número de habitaciones, metros útiles, nombre de zona, número de parques existentes en la zona y nombre y apellidos del propietario.



--37. Haz una consulta que muestre el nombre y apellidos de las mujeres que tienen bodegas de más de 9 metros cuadrados.



--38. Haz una consulta que devuelva DNI, nombre y apellidos de las mujeres que poseen una vivienda unifamiliar.



--39. Haz una consulta que muestre los pisos (toda la información de la tabla piso) y el nombre completo de los propietarios que se encuentran en una zona con dos parques que tienen entre 2 y 4 habitaciones o que se encuentran en la zona Centro, con ascensor y que tienen más de 70 y menos de 110 metros cuadrados útiles.



--40. Haz una consulta que muestre el nombre en minúsculas y las viviendas unifamiliares de una planta, que poseen los hombres de los cuales tenemos teléfono.



--41. Haz una consulta que muestre las viviendas (calle, numero y tipovivienda) y la zona urbana en la que se encuentran (nombrezona y descripción). 