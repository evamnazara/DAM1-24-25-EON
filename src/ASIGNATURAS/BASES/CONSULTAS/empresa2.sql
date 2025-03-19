--17._ ¿Cánto suman os salarios dos empregados fixos? ¿E cal é a media? Fai unha consulta que devolva os dous valores.
select SUM(salario) as salarioTotal
	from EMPREGADOFIXO;

select avg(salario) as mediaSalario
	from EMPREGADOFIXO;

--18._ Fai unha consulta que devolva o número de empregados fixos que ten cada departamento e a media dos salarios.
select COUNT(*)as numEmpleadosfixos
	from EMPREGADOFIXO;  

--19._ Fai unha consulta que nos diga cantos empregados naceron cada ano a partir de 1969.
select COUNT (*) as NacementoDespois1969
	from EMPREGADO
	where DataNacemento > 1969

--20._Fai unha consulta que devolva o número de empregados de cada sexo. Deberá visualizarse o texto do xeito seguinte: O número de homes é 24 (e o mesmo para as mulleres).  
select COUNT(*) 
	from EMPREGADO
	print ''

--21._Fai unha consulta que devolva o número de empregados temporales e fixos de cada sexo. Deberá visualizarse o texto do xeito seguinte: O número de empregados fixos de sexo masculino son 24 (e o mesmo para as mulleres e os empregados temporais). 
select 
from 
where 

--22._Mostra o nome completo dos empregados que teñen máis dun fillo de calquera sexo.
select 
from 
where 

--23._Crea unha consulta que mostre para cada empregado (nome e apelido mostrados nun so campo chamado Nome_completo) as horas totais que traballa cada empregado en todos os proxectos.
select 
from 
where 

--24._ Supoñendo que as horas semanais que debe traballar un empregado son 40, modifica a consulta anterior para que amose os traballadores que teñen sobrecarga, indicando en cantas horas se pasan.
select 
from 
where 
