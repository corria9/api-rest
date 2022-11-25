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

