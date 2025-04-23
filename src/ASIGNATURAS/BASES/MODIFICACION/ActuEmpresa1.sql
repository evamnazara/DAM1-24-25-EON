use BDEmpresa
go

--1. El día de ayer el empleado Eligio Rodrigo y Xiao Vecino Vecino trabajaron 3 horas extra cada uno.

insert into horasextras
	select DATEADD(DD,-1,GETDATE(),nss,3) 

update HORASEXTRAS
	/*(SELECT nss from )
	inner join empregado e on e.nss = h.HorasExtras*/
	set HorasExtras = HorasExtras + 3


--2. Se va a impartir un nuevo curso de "Diseño Web" de 30 horas. La primera edición se va a realizar el 15 de abril en Pontevedra y su profesor va a ser el jefe de departamento  Técnico.
insert CURSO(Nome,Horas)
	values('Diseño Web',30)
insert edicion (Data,Lugar,Profesor)
	values(15/04,'Pontevedra')

--3. A esta edición del curso asistirán todos los empleados de este departamento (salvo el jefe).
INSERT EDICIONCURSO_EMPREGADO()
	values

--4. El departamento de contabilidad decide subir un 2% el salario a sus empleados. Realiza una consulta que incremente el sueldo de estos.


--5. Hubo un error en la asignación de proyectos. La empleada con NSS=9900000 está trabajando en el proyecto "Portal"  en lugar de trabajar en el proyecto "Xestión da calidade". Corrígelo.
	update EMPREGADO_PROXECTO
	set 


/*6. Añade el proyecto "Deseño nova WEB" que se levará a cabo en Vigo e estará controlado polo departamento Técnico . De momento consta de dúas tareas:*/
--"Definir o obxectivo da páxina", que dará comezo dentro de 15 días e ten unha duración de 7 días. A súa dificultade é media.
--"Elexir o estilo e crear o mapa do sitio", que comezará dentro de 20 días e ten unha dificultade media.
--Neste proxecto estarán involucrados o xefe do departamento técnico con 8 horas e Felix Barreiro Valiña con 5 horas.

insert Proxecto(nomeProxecto,LUGAR,NumDepartamento)
	values ('Deseño nova WEB','Vigo',)
insert TAREFA (descripcion)