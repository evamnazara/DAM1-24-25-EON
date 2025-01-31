CREATE DATABASE Ventas
ON PRIMARY (
NAME = ,
FILENAME = '',
SIZE = ,
FILEGROWTH = %,
MAXSIZE = 
),


FILEGROUP Grupo1DB_Ejemplo (
    NAME = cliente_data1,
    FILENAME = 'C:\Ventas\cliente_data1.ndf',
    SIZE = 10MB,
    FILEGROWTH = 15%,
    MAXSIZE = 50MB
), 

(
    NAME = cliente_data2,
    FILENAME = 'C:\',
    SIZE = 10MB,
    FILEGROWTH = 15%,
    MAXSIZE = 50MB
),

(
    NAME = ,
    FILENAME = 'C:\',
    SIZE = ,
    FILEGROWTH = ,
    MAXSIZE = 
),



FILEGROUP Grupo2DB_Ejemplo (
        NAME = ,
        FILENAME = 'C:\',
        SIZE = ,
        FILEGROWTH = 
    ), 

(
        NAME = producto_data2,
        FILENAME = 'C:\',
        SIZE = 10MB,
        FILEGROWTH = 0
   )

FILEGROUP Grupo3DB_Ejemplo (
        NAME = producto_data1,
        FILENAME = 'C:\',
        SIZE = 10MB,
        FILEGROWTH = 0 --el archivo no crece 
),

LOG ON (
        NAME = log_data1,
        FILENAME = 'C:\',
        SIZE = 5MB,
        FILEGROWTH = 5MB,
        MAXSIZE = 25MB
    );
    