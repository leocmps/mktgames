SET @@global.time_zone = '+3:00';

DROP DATABASE IF EXISTS MKTGAMES;
CREATE DATABASE MKTGAMES;
USE MKTGAMES;


create table cliente(
id int primary key auto_increment,
nome varchar(30) not null,
sobrenome varchar(30) not null,
cpf varchar(20) not null,
data_nasc varchar(20) unique not null,
celular varchar(15) null,
endereco varchar(32) not null,
numeroend varchar(10) not null,
cidade varchar(30) not null,
email varchar(50) unique not null,
senha1 varchar(30) not null
);

describe cliente;

insert into CLIENTE(id,nome,sobrenome,data_nasc,cpf,celular,endereco,numeroend,cidade,email,senha1)
values(1,'admin', 'Fazendeiro', '30/08/1969', '111.111.111-10', '15 9999-9999', 'Rua de casa', '222', 'Sorocaba', 'Joaofazenda@email.com', 'admin');

select * from cliente;


create table produtos(
idproduto int primary key auto_increment,
NOME_PRODUTO varchar(30) not null,
MARCA varchar(30) not null,
PRECO varchar(10) not null
);

describe produtos;

insert into produtos(nome_produto,preco,marca)
values ('Notebook', '3500.00', 'Dell');

select * from produtos;

select
C.id,nome,sobrenome,cpf,cidade,endereco,numeroend,celular,
P.nome_produto,preco,marca
from produtos as P
inner join cliente as C;

