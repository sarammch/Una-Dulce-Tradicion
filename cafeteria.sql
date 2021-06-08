create database cafeteria
use cafeteria
create table identificadores(
	ps int NOT NULL,
	IdentificadorCli int,
	IdentificadorTra int,
	IdentificadorPro int,
	IdentificadoresPd int,
	IdentificadoresVe int,
	IdentificadoresCo int,
	IdentificadoresMP int,
	IdentificadoresRe int,
	IdentificadoresProduc int,
	primary key (ps)
)
create table Proveedores(
	IdPv CHAR (4) NOT NULL,
	NomPv VARCHAR (25),
	APPv VARCHAR (20),
	AMPv VARCHAR (20),
	CasaPv CHAR (10),
	CelularPv CHAR (10),
	PRIMARY KEY(IdPv)
)
create table Clientes(
	IdC CHAR (4) NOT NULL,
	NomC VARCHAR (25),
	APC VARCHAR (20),
	AMC VARCHAR (20),
	CasaC CHAR(10),
	CelularC CHAR (10),
	PRIMARY KEY(IdC)
)
create table Productos
(
	IdP char(3) not null, 
	NombreP varchar(50),
	TipoP char(1), 
	Precio float(2),
	Tam char(2),
	CantidadEx int, 
	primary key (IdP)
)
create table Trabajadores
(
	IdTra char(2) NOT NULL,
	NomTra varchar(25), 
	APTra varchar(20),
	AMTra varchar(20),
	Sueldo float(2),
	Turno char(1),
	primary key (IdTra)
)
create table MateriaPrima(
	IdMP char (4) not null primary key,
	NombreMP varchar (50),
	CantidadMP int
)
create table EncabezadoVentas
(
	IdV char(7) NOT NULL primary key,
	IdC char(4) NOT NULL,
	IdTra char(2) NOT NULL,
	TotalV float(2),
	TipoPago char(1),
	FechaV char(10)
	foreign key(IdC) references Clientes(IdC),
	foreign key(IdTra) references Trabajadores(IdTra)
)
create table Ventas
(
	IdV char(7) NOT NULL,
	IdP char(3) NOT NULL,
	CantidadV int,
	SubtotalV float(2), 
	foreign key(IdP) references Productos(IdP),
	primary key(IdV, IdP)
)
create table EncabezadoCompras
(
	IdCom Char(6) not null primary key,
	IdPv char(4) not null,
	FechaCom char(10),
	TotalCom float(2),
	foreign key(IdPv) references Proveedores(IdPv)
)
Create table Compras
(
	IdCom char(6) not null ,
	IdMP char(4) not null,
	CantidadCom int,
	Costo float(2),
	SubtotalCom float(2),
	primary key(IdCom,IdMP),
	foreign key(IdMP) references MateriaPrima(IdMP)
)
create table EncabezadoRecetas(
	IdR char (4) not null primary key,
	IdP char (3) not null,
	CantidadPro int,
	TotalR float(2),
	foreign key(IdP) references Productos(IdP)
)
create table Recetas(
	IdR char(4) not null,
	IdMP char(4) not null,
	CantidadR int,
	SubtotalR float(2),
	foreign key(IdMP) references MateriaPrima(IdMP),
	primary key(IdR, IdMP)
)
create table Produccion(
	IdPro char(5) not null primary key,
	IdR char (4) not null,
	IdP char (3) not null,
	CantidadPro int,
	FechaPro char(10),
	TotalR float(2),
	PrecioUni float (2),
	foreign key(IdR) references EncabezadoRecetas(IdR),
	foreign key(IdP) references Productos(IdP)
)
insert into identificadores values(1, 1, 1, 1, 1, 1, 1, 1, 1, 1)