-----CONSULTA CON CLAVES
-----Identificador
use cafeteria
create procedure buscarIdentificador @num int
as 
select * from identificadores where ps = 1
--execute buscarIdentificador

-----Materia Prima
create procedure busquedaMP @claveMP char(4)
as 
select * from MateriaPrima where IdMP = @claveMP
--execute busquedaMP


-----CUENTA TOTALES
-----Todos los productos
create procedure cuentaProductos
as 
select count(*) from Productos
--execute cuentaProductos

-----Toda la materia prima
create procedure cuentaMPS
as 
select count(*) from MateriaPrima
--execute cuentaMPS


-----AGREGAR
-----Ventas
create procedure agregarVenta @claveVenta char(7), @claveProducto char(3), @CantidadVenta int, @SubtotalV float(2)
as 
insert into Ventas values(@claveVenta, @claveProducto, @CantidadVenta, @SubtotalV) 
--execute agregarVenta

-----EncabezadoVentas
create procedure agregarVenta2 @claveVenta char(7), @claveCliente char(4), 
@claveTrabajador char(4), @TotalV float(2), @TipoPago char(1), @FechaV char(10)
as 
insert into EncabezadoVentas values(@claveVenta, @claveCliente, @claveTrabajador, @TotalV, @TipoPago, @FechaV) 
--execute agregarVenta2

-----Compras
create procedure agregarCompra @claveCompra char(6), @claveMP char(4), @CantidadCompra int, 
@Costo float(2), @SubtotalCom float(2)
as 
insert into Compras values(@claveCompra, @claveMP, @CantidadCompra, @Costo, @SubtotalCom)
--execute agregarCompra

-----EncabezadoCompras
create procedure agregarCompra2 @claveCompra char(6), @claveProve char(4), @FechaCom char(10), @TotalCom float(2)
as 
insert into EncabezadoCompras values(@claveCompra, @claveProve, @FechaCom, @TotalCom)
--execute agregarCompra2

-----MateriaPrima
create procedure agregarMP @claveMP char(4), @nombreMP varchar(50), @cantidadMP int 
as 
insert into MateriaPrima values(@claveMP, @nombreMP, @cantidadMP)
--execute agregarMP


-----MODIFICAR
-----Identificador de las ventas
create procedure modificarIdentiVenta @num int
as 
update identificadores set IdentificadoresVe = @num
--execute modificarIdentiVenta

-----Identificador de las materia prima
create procedure modificarIdentiCom @num int
as 
update identificadores set IdentificadoresCo = @num
--execute modificarIdentiCom

-----Identificador de las materia prima
create procedure modificarIdentiMP @num int
as 
update identificadores set IdentificadoresMP = @num
--execute modificarIdentiMP

-----Existencia del Producto
create procedure modificarExPro @cantidad int, @claveProducto char(3)
as 
update Productos set CantidadEx = @cantidad where IdP = @claveProducto
--execute modificarExPro

-----Existencia de la Materia Prima
create procedure modificarExMP @cantidad int, @claveMP char(4)
as 
update MateriaPrima set CantidadMP = @cantidad where IdMP = @claveMP
--execute modificarExMP

-----Materia Prima
create procedure modificarMP @nombreMP varchar(50), @cantidadMP int, @claveMP char(4)
as 
update MateriaPrima set NombreMP = @nombreMP, CantidadMP = @cantidadMP where IdMP = @claveMP
--execute modificarMP


-----Venta
create procedure modificarVenta @claveCliente char(4), @claveTrabajador char(4), 
@TipoPago char(1), @FechaV char(10), @claveVenta char(7)
as 
update EncabezadoVentas set IdC = @claveCliente, IdTra = @claveTrabajador, TipoPago = @TipoPago,
FechaV = @FechaV where IdV = @claveVenta
--execute modificarVenta

-----Compra
create procedure modificarCompra @claveProve char(4), @FechaCom char(10), @claveCompra char(6)
as 
UPDATE EncabezadoCompras SET IdPv = @claveProve, FechaCom = @FechaCom where IdCom = @claveCompra
--execute modificarCompra


-----ELIMINAR
-----Materia Prima
create procedure eliminarMP @claveMP char(4)
as 
update MateriaPrima set NombreMP = null, CantidadMp = null where IdMP = @claveMP
--execute eliminarMP


-----CONSULTAR
-----ConGen MateriaPrima
create procedure consultaMPS
as 
select * from MateriaPrima
--execute consultaMPS

-----Ventas1
create procedure consultarVenta @claveVenta char(7)
as 
select EncabezadoVentas.IdV,  Clientes.NomC, Trabajadores.NomTra, EncabezadoVentas.FechaV, EncabezadoVentas.TipoPago, 
EncabezadoVentas.TotalV from Clientes, Trabajadores, EncabezadoVentas 
where EncabezadoVentas.IdC = Clientes.IdC and EncabezadoVentas.IdTra = Trabajadores.IdTra and 
EncabezadoVentas.IdV=@claveVenta
--execute consultarVenta

-----Ventas2
create procedure consultarVenta2 @claveVenta char(7)
as 
select Productos.IdP, Productos.NombreP, Productos.Precio, Ventas.CantidadV, Ventas.SubtotalV 
from Ventas, Productos where Productos.IdP=Ventas.IdP and Ventas.IdV = @claveVenta
--execute consultarVenta2

-----Ventas3
create procedure consultarVenta3 @claveVenta char(7)
as 
select EncabezadoVentas.IdV,  EncabezadoVentas.IdC, Clientes.NomC, EncabezadoVentas.IdTra, Trabajadores.NomTra, 
EncabezadoVentas.FechaV, EncabezadoVentas.TipoPago from Clientes, Trabajadores, EncabezadoVentas 
where EncabezadoVentas.IdC = Clientes.IdC and EncabezadoVentas.IdTra = Trabajadores.IdTra 
and EncabezadoVentas.IdV = @claveVenta
--execute consultarVenta3

-----Compras1 consulta
create procedure consultarCompras @claveCompra char(6)
as 
select EncabezadoCompras.IdCom, Proveedores.NomPv, EncabezadoCompras.FechaCom, EncabezadoCompras.TotalCom 
from Proveedores, EncabezadoCompras 
where EncabezadoCompras.IdPv = Proveedores.IdPv and EncabezadoCompras.IdCom = @claveCompra
--execute consultarCompras

-----Compras2 consulta
create procedure consultarCompras2 @claveCompra char(6)
as 
select MateriaPrima.IdMP, MateriaPrima.NombreMP, Compras.costo, Compras.CantidadCom, Compras.SubtotalCom 
from Compras, MateriaPrima where MateriaPrima.IdMP = Compras.IdMP and Compras.IdCom = @claveCompra
--execute consultarCompras2

-----Compras3 vista modi
create procedure consultarCompras3 @claveCompra char(6)
as 
select EncabezadoCompras.IdCom, Proveedores.NomPv, Proveedores.IdPv, EncabezadoCompras.FechaCom 
from Proveedores, EncabezadoCompras 
where EncabezadoCompras.IdPv = Proveedores.IdPv and EncabezadoCompras.IdCom = @claveCompra
--execute consultarCompras3 

----Trabajadores 
create procedure agregarTra @claveTra char(2), @nombreTra varchar(25), @APTra varchar(20), @APMTra varchar(20), @SueldoTra float(2), @TurnoTra char(1)
as 
insert into Trabajadores values (@claveTra, @nombreTra, @APTra, @APMTra, @SueldoTra, @TurnoTra)
--execute agregarTra

----Identificador de Trabajadores 
create procedure modificarIdentiTra @num int 
as
update identificadores set IdentificadorTra = @num
--execute modificarIdentiTra 

----consultar trabajador 
create procedure consultarTra @IdTra char(2)
as
select * from Trabajadores where IdTra = @IdTra

----modificar Trabajador 
create procedure modificarTra @nombreTra varchar(25), @APTra varchar(20), @APMTra varchar(20), @SueldoTra float(2), @TurnoTra char(1), @claveTra  char(2)
as 
update Trabajadores set NomTra = @nombreTra, APTra = @APTra, AMTra = @APMTra, Sueldo = @SueldoTra, Turno = @TurnoTra where IdTra = @claveTra
--execute modificarTra

--eliminar Trabajador 
create procedure eliminarTra @claveTra char (2)
as 
update Trabajadores set NomTra = null, APTra = null, AMTra = null, Sueldo = null, Turno = null where IdTra = @claveTra
--execute eliminarTra 

-----agregar Clientes
create procedure agregarCli @claveCli char(4), @nombreCli varchar(25), @apCli varchar (20), @amCli varchar(20), @telCasa char(10), @telCelular char(10)
as
insert into Clientes values(@claveCli,@nombreCli,@apCli,@amCli,@telCasa,@telCelular)
-----execute agregarCli

----Identificador de Clientes 
create procedure modificarIdentiCli @num int 
as
update identificadores set IdentificadorCli = @num
--execute modificarIdentiCli

----consultar Cliente 
create procedure consultarCli @IdCli char(4)
as
select * from Clientes where IdC = @IdCli

--modificar Clientes
create procedure modificarClientes @nombreCli varchar (25), @APCli varchar(20), @AMCli varchar(20), @CasaCli char(10), @CelularCli char(10), @IdCli char(4)   
as 
update Clientes set NomC = @nombreCli, APC = @APCli, AMC = @AMCli , CasaC = @CasaCli, CelularC = @CelularCli where IdC = @IdCli 

-- eliminar cliente
create procedure eliminarCliente @IdCli char (4)
as 
update Clientes set NomC = null, APC = null, AMC = null, CasaC = null, CelularC = null where IdC = @IdCli 

-- agregar productos 
create procedure agregarProductos @claveProd char(3), @nombreProd varchar(50), @TipoProd char(1), @PrecioProd float(2), @Tamanio char(2), @CantidadExProd int
as 
insert into Productos values (@claveProd, @nombreProd, @TipoProd,@PrecioProd, @Tamanio, @CantidadExProd)

----Identificador de Productos 
create procedure modificarIdentiProd @num int 
as
update identificadores set IdentificadorPro = @num

-----ConGen Productos
create procedure consultaProd
as 
select * from Productos

----consultar producto 
create procedure consultarProd @claveProd char(3)
as
select * from Productos where IdP = @claveProd
--execute consultarProd

---modificar producto 
create procedure modificarProductos @nombreProd varchar(50), @TipoProd char(1), @PrecioProd float(2), @Tamanio char(2), @CantidadExProd int, @claveProd char(3)
as 
update Productos set NombreP = @nombreProd, TipoP = @TipoProd, Precio = @PrecioProd, Tam = @Tamanio, CantidadEx = @CantidadExProd where IdP = @claveProd

---eliminar producto 
create procedure eliminarProductos  @claveProd char(3)
as 
update Productos set NombreP = null, TipoP = null, Precio = null, Tam = null, CantidadEx = null where IdP = @claveProd

--- agregar proveedores 
create procedure agregarProveedores @clavePv char(4), @nombrePv varchar(25), @APPv varchar(20), @AMPv varchar(20), @CasaPv char(10), @CelularPv char(10)
as 
insert into Proveedores values (@clavePv , @nombrePv, @APPv, @AMPv, @CasaPv, @CelularPv)

----Identificador de Proveedores 
create procedure modificarIdentiProv @num int 
as
update identificadores set IdentificadorPro = @num

----consultar proveedor
create procedure consultarPv @clavePv char(4)
as
select * from Proveedores where IdPv = @clavePv
--execute consultarPv

---modificar proveedor 
create procedure modificarPV @nombrePv varchar(25), @APPv varchar(20), @AMPv varchar(20), @CasaPv char(10), @CelularPv char(10), @clavePv char(4)
as 
update Proveedores set NomPv = @nombrePv, APPv = @APPv, AMPv = @AMPv, CasaPv = @CasaPv, CelularPv = @CelularPv where IdPv = @clavePv

---eliminar proVEEDOR
create procedure eliminarPV  @clavePv char(4)
as 
update Proveedores set NomPv = null, APPv = null, AMPv = null, CasaPv = null, CelularPv = null where IdPv = @clavePv