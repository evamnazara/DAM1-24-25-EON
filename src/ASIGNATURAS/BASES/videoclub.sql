--TO DO:
-- poner cada tabla en su grupo 


IF EXISTS (SELECT * FROM sys.databases WHERE name = 'videoclub')
    BEGIN
    DROP DATABASE videoclub;
    END 

GO
    
CREATE DATABASE videoclub

ON PRIMARY (
	NAME = 'ArchivoPrincipal',
    FILENAME = 'C:\Videoclub\ArchivoPrincipal.ndf',
    SIZE = 5MB,
    FILEGROWTH = 2MB
),

FILEGROUP Datos_Peliculas (
	NAME = 'datosPeliculas1',
	FILENAME = 'C:\Videoclub\datosPeliculas1.mdf',
	SIZE = 20MB,
	FILEGROWTH = 10%,
	MAXSIZE = 60MB
),
(
	NAME = 'datosPeliculas2',
	FILENAME = 'C:\Videoclub\datosPeliculas2.mdf',
	SIZE = 20MB,
	FILEGROWTH = 10%,
	MAXSIZE = 60MB
)

IF OBJECT_ID('Socios') IS NOT NULL
    DROP TABLE Socios;
GO

-- TABLA SOCIO
CREATE TABLE Socios (
  Numero SMALLINT IDENTITY(1,1) PRIMARY KEY CLUSTERED,
  DNI NVARCHAR(9) UNIQUE,

  
  Nombre VARCHAR(20), 
  Apellidos VARCHAR(20), 
  Direccion VARCHAR(30), 
  Telefono char(9), 
  --solo puede estar compuesto por dígitos;
  
  FechadeAlta DATE NOT NULL DEFAULT DATEADD() 
 
);

--FAMILIAR(DNI, Nombre, Parentesco, Fechanacimiento, NumeroSocio)
 --   • CodCategoria tinyint;
 --   • Precio money;
 --   • Descripcion varchar(30);
 
CREATE TABLE familiares (
	DNI VARCHAR(9) PRIMARY KEY CLUSTERED,
--8 dígitos y una letra (tanto en minúsculas como mayúsculas);
	Nombre varchar(60), 
	Parentesco varchar(15), 
	Fechanacimiento, 
	NumeroSocio
);
--PELICULA(IdPelicula, Titulo, AñoProduccion ,Genero, Duracion,-Nacionalidad*, CodCategoria).
--EJEMPLAR(IdPelicula ,IdEjemplar, Estado, Fechadecompra)

--ALQUILER(IdEjemplar, IdPelicula, FechaAlq, NumeroSocio, FechaEstimadaDev, FechaDev*)
--ACTOR(Nombre, Nacionalidad, Sexo)
--ACTUA(NombreActor, IdPelicula, PrincSec)
--DIRECTOR(Nombre, Nacionalidad)
--DIRIGE(IdPelicula,NombreDirector)

--CATEGORIA(CodCategoria, Precio, Descripcion*)