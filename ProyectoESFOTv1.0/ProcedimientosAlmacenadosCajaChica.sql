select * from CAJA_CHICA
insert into CAJA_CHICA(ID_CAJA,MONTO,FECHA_MONTO) values (4321,200,'2018-07-02')


/*INGRESA LA FACTURA SIN LOS CAMPOS NOT NULL*/
create procedure INGRESARFACTURA1
@idfac as int,@fechafac as datetime,@proveedor as varchar(30),
@total as money
as
insert into FACTURA(ID_FACTURA,FECHA_FACTURA,NOMBRE_PROVEEDOR,TOTAL,DOCUMENTO_FACTURA)
values (@idfac,@fechafac,@proveedor,@total,1)

/*ACTUALIZA LA FACTURA INGRESANDO LOS CAMPOS NOT NULL FALTANTES EN "INGRESARFACTURA"*/
create procedure ACTUALIZARFACTURA
@idfac as int,@idret as int,@idus as int,@idval as int
as
update FACTURA
set ID_RETENCION=@idret,ID_USUARIO=@idus,ID_VALE_CAJA_CHICA=@idval where ID_FACTURA=@idfac

/*AGREGA LA DESCRIPCION DE LA FACTURA*/
create procedure INGRESARDETALLEFACTURA
@detalle as int,@factura as int,@categoria as int,
@descripcion as varchar(30),@cant as int, @precio as money
as
insert into DETALLE_FACTURA
values(@detalle,@factura,@categoria,@descripcion,@cant,@precio)

/*PERMITE GENERAR LA SOLICITUD A LA DGIP O AL DEPARTAMENTO ADMINISTRATIVO*/
create procedure INGRESARSOLICITUD1
@id as varchar(10),@solicitante as varchar(30),@fecha as datetime,
@departamento as varchar(10),@estado as varchar(10)
as
insert into SOLICITUD(ID_SOLICITUD,NOMBRE_SOLICITANTE,FECHA_SOLICITUD,
DEPARTAMENTO,ESTADO,DOCUMENTO_QUIPUX)
values(@id,@solicitante,@fecha,@departamento,@estado,1)

/*ADMINISTRADOR: INGRESA USUARIO*/
create procedure INSERTARUSUARIO
as
@id as int,
@nom as varchar(30),
@ced as varchar(10),
@pass as varchar(1)
as
insert into USUARIO values (@id,@nom,@ced,@pass)

/*ADMINISTRADOR: ACTUALIZA USUARIO*/
create procedure ACTUALIZARUSUARIO
@id as int,
@nom as varchar(30),
@ced as varchar(10),
@pass as varchar(1)
as
delete USUARIO where ID_USUARIO=@id
insert into USUARIO values (@id,@nom,@ced,@pass)

/*INGRESA EL VALE CON EL ID DE LA FACTURA*/
create procedure INGRESARVALE
@idval as int,@idfac as int,@nom as varchar(30)
as
insert into VALE_CAJA_CHICA(ID_VALE_CAJA_CHICA,ID_FACTURA,NOMBRE_ENCARGADA,DOCUMENTO_VALE_CAJA_CHICA)
values (@idval,@idfac,@nom,1)

/*INGRESA LA RETENCION CON EL ID DE LA FACTURA*/
create procedure INGRESARETENCION
@idret as int,@idfac as int,@valor as money
as
insert into RETENCION_FACTURA(ID_RETENCION,ID_FACTURA,VALOR_RETENCION,DOCUMENTO_RETENCION)
values (@idret,@idfac,@valor,1)

/*DISMINUYE EL DINERO DE CAJA CHICA*/
create procedure ACTUALIZARMONTO
@idcaja as int, @idfac as int,@valor as money,@fecha as date
as
insert into CAJA_CHICA(ID_CAJA,ID_FACTURA,MONTO,FECHA_MONTO)
values (@idcaja,@idfac,
(select TOP 1 MONTO from caja_chica order by FECHA_MONTO desc)-@valor,@fecha)

/*REPONE EL DINERO DE CAJA CHICA*/
create procedure ACTUALIZARMONTO1
@idcaja as int,@valor as money,@fecha as date
as
insert into CAJA_CHICA(ID_CAJA,MONTO,FECHA_MONTO)
values (@idcaja,(select TOP 1 MONTO from caja_chica order by FECHA_MONTO desc)+@valor,@fecha)