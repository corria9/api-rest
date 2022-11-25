CREATE database cliente;

use cliente;

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