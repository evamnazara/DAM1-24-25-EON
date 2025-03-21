--1.-   Haz una consulta que muestre la calle, número, planta, puerta, número de habitaciones de los pisos de los propietarios que su letra del DNI sea A, B o H. Además también se visualizará junto a la anterior información, un comentario que dependerá del número de habitaciones. Si el número de habitaciones es 1 0 2 se visualizará 'Ideal Parejas sin o con 1 hijo', si tiene 3: 'Ideal Parejas con dos hijos' y si tiene más de tres: 'Ideal Parejas con más de dos hijos'

SELECT calle, numero, planta, puerta, numhabitaciones,
	CASE 
		WHEN numhabitaciones in (0,1) then 'Ideal Parejas sin o con 1 hijo'
		WHEN numhabitaciones = 2 then 'Ideal Parejas con dos hijos'
		when numhabitaciones > 3 then 'Ideal Parejas con más de dos hijos'
	END AS descripcion
	
	FROM PISO
where RIGHT(DNIPROPIETARIO,1) IN ('A','B','C')

--2.-  Muestra información de los propietarios que tienen un teléfono que empiezan por los números 610 o 565, clasificados de manera que aparezcan primero aquellos cuyos nombres son más cortos y para los que coincidan por el nombre de forma descendente.    Pista( puedes poner en el order by una función)
SELECT * FROM PROPIETARIO 
	WHERE LEFT(TELEFONO,3) IN ('610','565')
	ORDER BY LEN(NOMBRE)DESC, NOMBRE ASC
		
		
--3.-.  Idem del anterior pero ahora se debe crear una tabla llamada PropietariosClasif con la información de los propietarios que tienen un teléfono que empiezan por los números 610 o 565, clasificados de manera que aparezcan primero aquellos cuyos nombres son más cortos y para los que coincidan por el nombre de forma descendente.
SELECT * FROM PROPIETARIO AS PropietariosClasif
	WHERE LEFT(TELEFONO,3) IN ('610','565')
	ORDER BY LEN(NOMBRE) DESC, NOMBRE ASC


--4.-.  Muestra información de las viviendas cuya calle no es compuesta, es decir, formada por una sola palabra. La información se mostrará ordenada por metrossolar de mayor a menor  en el caso de los bloques y para las casas. por los nombres de zonas de más cortos a más. Pista : mira la función  charindex.  En order by también puedes poner un case. 
/*Ej:order by case campo 
	when  expesión1   valore  end desc,
	case campo  when expresion2 then valor2 end*/
	
SELECT * FROM VIVIENDA
	WHERE CHARINDEX(' ',CALLE) = 0
	ORDER BY 
		CASE tipovivienda 
			WHEN 'bloquepisos' THEN METROSSOLAR END DESC,
		
		CASE tipovivienda 
			WHEN 'casaparticular' THEN METROSSOLAR END 


--5.-.  Visualiza las zonas urbanas con más parques.
select top 1 WITH TIES * FROM ZONAURBANA
	order by numparques desc

--estandar
SELECT NOMBREZONA,NUMPARQUES FROM ZONAURBANA
	WHERE NUMPARQUES = (SELECT MAX(NUMPARQUES) FROM ZONAURBANA)
	
--6.-.  De los pisos cuyos metros construídos están comprendidos entre 100 y 200, visualiza los que tienen más habitaciones. El formato de salida será una sola columna que contendrá:  calle, piso plantaº puerta. ,Ejemplo de salida:    
--Pista: el operador + concatena cadenas de caracteres. Para concaternar tb algún valor que no es de este tipo, hay que castear estos  a cadena.
SELECT 



--7.-.  Visualiza la direccion del piso (compuesta por  calle, piso plantaº puerta), metrosconstruidos, metrosutiles  y la diferencia entre metros construidos y metros útilies para los pisos que esta diferencia no supera los 8 metros. Se visualizará ordenado por esta diferencia de metros de

--8-.  Para los pisos cuya diferencia entre metros construídos y metros útiles no supera los 8 metros, visualiza los pisos con menor diferencia. La información que se visualizará será la dirección del piso (compuesta por  calle, piso plantaº puerta), metrosconstruidos, metrosutiles y la diferencia entre metros construídos y metros útiles.

--9.-.  Para las propietarias, visualizar su nombre completo, dni y télefono de la siguiente manera: