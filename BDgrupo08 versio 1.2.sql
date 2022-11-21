drop database lojaGrupo8;
create database lojaGrupo8;

use lojagrupo8;

create table tb_cliente(
idcliente int not null auto_increment,
nomeCliente varchar(50) NOT NULL,
cpfCli VARCHAR(11) NOT NULL,
enderecoCli VARCHAR(60) NOT NULL, 
bairroCli VARCHAR(20)NOT NULL,
cidadeCli VARCHAR(20)NOT NULL,
estadoCli VARCHAR(2) NOT NULL, 
cepCli VARCHAR(8) NOT NULL, 
numeroCli INT NOT NULL, 
telefoneCli VARCHAR(12) NOT NULL,
emailCli VARCHAR(45),
nascCli DATE NULL,
sexoCli INT NOT null,
compleCli VARCHAR (30) NULL,
PRIMARY KEY(idCliente)
);

create table categoria(
idcategoria int not null,
nomeCategoria varchar(15) not null,
descricao varchar(20),
primary key(idcategoria)
);

create table tb_produto(
idproduto int not null auto_increment,
nomeProd varchar(20) not null,
valorProd int not null,
tamanhoProd varchar(5) not null,
corProd varchar(10) not null,
qtdProd int not null,
idcategoria int not null,
primary key(idproduto),
foreign key(idcategoria) references categoria(idcategoria)
);

create table tb_venda(
idvenda int not null auto_increment,
idcliente int not null,
datavenda date not null,
valorVenda numeric(5,2) not null,
idusuario int not null,
primary key(idvenda),
foreign key(idusuario) references tb_usuarios(idusuario) 
);

create table item_vendas(
iditemvenda int not null auto_increment,
idvenda int not null,
idproduto int not null,
qtddavenda int not null,
valorunitario numeric(9,2) not null,
primary key(iditemvenda),
foreign key(idvenda) references tb_venda(idvenda),
foreign key(idproduto) references tb_produto(idproduto)
);

create table tb_usuario(
idusuario int not null auto_increment,
nomeusuario varchar(25) not null,
login varchar(10),
senha varchar(8) not null,
primary key(idusuario)
);


