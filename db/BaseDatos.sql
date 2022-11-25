CREATE DATABASE  IF NOT EXISTS cliente /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE cliente;
-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: cliente
-- ------------------------------------------------------
-- Server version	8.0.21



--
-- Table structure for table cliente
--


CREATE TABLE cliente 
(
	id_cliente int primary key not null auto_increment,
    fecha date,
    nombre Varchar (25) not null,
    direccion Varchar (50) not null,
    telefono BIGINT not null,
    contrasenia Boolean
);

Insert into cliente.cliente VALUES ('1', '2022/11/25', 'Armando Juan', 'Las Begonias', '9897898798', '1');
Insert into cliente.cliente VALUES ('2', '2022/11/25', 'Juan Armando', 'Las Acacias', '90897654', '1');

select * from cliente.cliente;




USE cliente;

CREATE database cuentas;

--
-- Table structure for table cuentas
--

CREATE TABLE cuentas 
(
    id_cuenta int primary key not null auto_increment,
    numero_cuenta BIGINT not null,
    tipo Varchar(10),
    saldo_inicial FLOAT not null,
    estado Boolean not null,
    cliente Varchar (50) not null
);

Insert into cliente.cuentas VALUES ('1', '8920221124', 'Corriente', '670.78', '1', 'Armando Juan');
Insert into cliente.cuentas VALUES ('2', '8920221124', 'Ahorro', '400.02', '1', 'Juan Armando');

select * from cliente.cuentas;





USE cliente;

CREATE database movimientos;



USE cliente;


--
-- Table structure for table movimientos
--

CREATE TABLE movimientos
(
    id_movimientos int primary key not null auto_increment,
    numero_cuenta BIGINT not null,
    tipo Varchar(10),
    saldo_inicial FLOAT not null,
    estado Boolean not null,
    movimiento Varchar (50) not null
);

Insert into cliente.movimientos VALUES ('1', '8920221124', 'Corriente', '2000.78', '1', 'Deposito de 400');
Insert into cliente.movimientos VALUES ('2', '8920221124', 'Ahorro', '4000.02', '2', 'Retiro de 1000');


select * from cliente.cuentas;
