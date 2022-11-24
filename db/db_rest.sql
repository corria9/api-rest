CREATE database db_rest;

use db_rest;

CREATE TABLE Cliente 
(
    idCliente int primary key not null auto_increment,
    fecha date,
    nombre Varchar (25) not null,
    direccion Varchar (50) not null,
    telefono integer not null,
    contraseña Boolean
);