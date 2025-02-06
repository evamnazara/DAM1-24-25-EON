-- ej 1

IF NOT EXISTS (SELECT * FROM sys.databases WHERE name = 'ProyectosdeInvestigacion')
BEGIN
    CREATE DATABASE ProyectosdeInvestigacion;
END;
GO

USE ProyectosdeInvestigacion;
GO


IF OBJECT_ID('Departamento') IS NOT NULL
    DROP TABLE Departamento;
GO

CREATE TABLE Departamento (
    CodigoDpto INT IDENTITY(1,1) PRIMARY KEY,
    NombreDpto VARCHAR(100) UNIQUE NOT NULL,
    Telefono VARCHAR(15) NULL,
    Director CHAR(9) NULL
);
GO

-- ej 2

IF OBJECT_ID('Sedes') IS NOT NULL
    DROP TABLE Sedes;
GO

CREATE TABLE Sedes (
    CodigoSede INT IDENTITY(1,1) PRIMARY KEY,
    NombreSede VARCHAR(100) UNIQUE NOT NULL,
    Campus VARCHAR(100) NULL
);
GO

EXEC sp_helpdb 'Sedes';
GO

-- ej 3

IF EXISTS (SELECT * FROM sys.types WHERE name = 'TipoDNI')
    DROP TYPE TipoDNI;
GO

CREATE TYPE TipoDNI FROM CHAR(9) NOT NULL;
GO

IF OBJECT_ID('Grupos') IS NOT NULL
    DROP TABLE Grupos;
GO

CREATE TABLE Grupos (
    CodigoGrupo INT IDENTITY(1,1) PRIMARY KEY,
    NombreGrupo VARCHAR(100) UNIQUE NOT NULL,
    CodigoDpto int NULL,
    AreaConocimiento VARCHAR(100) NULL,
    Lider TipoDNI NULL,
    FOREIGN KEY (CodigoDpto) REFERENCES Departamento(CodigoDpto)
);
GO

EXEC sp_help 'Grupos';
GO