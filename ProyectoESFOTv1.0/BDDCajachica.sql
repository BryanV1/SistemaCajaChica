
if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('CAJA_CHICA') and o.name = 'FK_CAJA_CHI_MODIFICA_FACTURA')
alter table CAJA_CHICA
   drop constraint FK_CAJA_CHI_MODIFICA_FACTURA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('DETALLE_FACTURA') and o.name = 'FK_DETALLE__ESTA_CATEGORI')
alter table DETALLE_FACTURA
   drop constraint FK_DETALLE__ESTA_CATEGORI
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('DETALLE_FACTURA') and o.name = 'FK_DETALLE__TIENE_FACTURA')
alter table DETALLE_FACTURA
   drop constraint FK_DETALLE__TIENE_FACTURA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('FACTURA') and o.name = 'FK_FACTURA_GENERA_VALE_CAJ')
alter table FACTURA
   drop constraint FK_FACTURA_GENERA_VALE_CAJ
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('FACTURA') and o.name = 'FK_FACTURA_INGRESA_USUARIO')
alter table FACTURA
   drop constraint FK_FACTURA_INGRESA_USUARIO
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('FACTURA') and o.name = 'FK_FACTURA_RETIENE_RETENCIO')
alter table FACTURA
   drop constraint FK_FACTURA_RETIENE_RETENCIO
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('RETENCION_FACTURA') and o.name = 'FK_RETENCIO_RETIENE2_FACTURA')
alter table RETENCION_FACTURA
   drop constraint FK_RETENCIO_RETIENE2_FACTURA
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('SOLICITUD') and o.name = 'FK_SOLICITU_RECIVE_USUARIO')
alter table SOLICITUD
   drop constraint FK_SOLICITU_RECIVE_USUARIO
go

if exists (select 1
   from sys.sysreferences r join sys.sysobjects o on (o.id = r.constid and o.type = 'F')
   where r.fkeyid = object_id('VALE_CAJA_CHICA') and o.name = 'FK_VALE_CAJ_GENERA2_FACTURA')
alter table VALE_CAJA_CHICA
   drop constraint FK_VALE_CAJ_GENERA2_FACTURA
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('CAJA_CHICA')
            and   name  = 'MODIFICA_FK'
            and   indid > 0
            and   indid < 255)
   drop index CAJA_CHICA.MODIFICA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('CAJA_CHICA')
            and   type = 'U')
   drop table CAJA_CHICA
go

if exists (select 1
            from  sysobjects
           where  id = object_id('CATEGORIA_PARTIDA_PRESPUESTARIA')
            and   type = 'U')
   drop table CATEGORIA_PARTIDA_PRESPUESTARIA
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('DETALLE_FACTURA')
            and   name  = 'ESTA_FK'
            and   indid > 0
            and   indid < 255)
   drop index DETALLE_FACTURA.ESTA_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('DETALLE_FACTURA')
            and   name  = 'TIENE_FK'
            and   indid > 0
            and   indid < 255)
   drop index DETALLE_FACTURA.TIENE_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('DETALLE_FACTURA')
            and   type = 'U')
   drop table DETALLE_FACTURA
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('FACTURA')
            and   name  = 'INGRESA_FK'
            and   indid > 0
            and   indid < 255)
   drop index FACTURA.INGRESA_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('FACTURA')
            and   name  = 'RETIENE_FK'
            and   indid > 0
            and   indid < 255)
   drop index FACTURA.RETIENE_FK
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('FACTURA')
            and   name  = 'GENERA_FK'
            and   indid > 0
            and   indid < 255)
   drop index FACTURA.GENERA_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('FACTURA')
            and   type = 'U')
   drop table FACTURA
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('RETENCION_FACTURA')
            and   name  = 'RETIENE2_FK'
            and   indid > 0
            and   indid < 255)
   drop index RETENCION_FACTURA.RETIENE2_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('RETENCION_FACTURA')
            and   type = 'U')
   drop table RETENCION_FACTURA
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('SOLICITUD')
            and   name  = 'RECIVE_FK'
            and   indid > 0
            and   indid < 255)
   drop index SOLICITUD.RECIVE_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('SOLICITUD')
            and   type = 'U')
   drop table SOLICITUD
go

if exists (select 1
            from  sysobjects
           where  id = object_id('USUARIO')
            and   type = 'U')
   drop table USUARIO
go

if exists (select 1
            from  sysindexes
           where  id    = object_id('VALE_CAJA_CHICA')
            and   name  = 'GENERA2_FK'
            and   indid > 0
            and   indid < 255)
   drop index VALE_CAJA_CHICA.GENERA2_FK
go

if exists (select 1
            from  sysobjects
           where  id = object_id('VALE_CAJA_CHICA')
            and   type = 'U')
   drop table VALE_CAJA_CHICA
go

/*==============================================================*/
/* Table: CAJA_CHICA                                            */
/*==============================================================*/
create table CAJA_CHICA (
   ID_CAJA              int                  not null,
   ID_FACTURA           int                  null,
   MONTO                money                not null,
   FECHA_MONTO          datetime             not null,
   constraint PK_CAJA_CHICA primary key nonclustered (ID_CAJA)
)
go

/*==============================================================*/
/* Index: MODIFICA_FK                                           */
/*==============================================================*/
create index MODIFICA_FK on CAJA_CHICA (
ID_FACTURA ASC
)
go

/*==============================================================*/
/* Table: CATEGORIA_PARTIDA_PRESPUESTARIA                       */
/*==============================================================*/
create table CATEGORIA_PARTIDA_PRESPUESTARIA (
   CODIGO_CATEGORIA     int                  not null,
   COMCEPTO_PRODUCTO    varchar(500)         not null,
   constraint PK_CATEGORIA_PARTIDA_PRESPUEST primary key nonclustered (CODIGO_CATEGORIA)
)
go

/*==============================================================*/
/* Table: DETALLE_FACTURA                                       */
/*==============================================================*/
create table DETALLE_FACTURA (
   ID_DETALLE_FACTURA   int                  not null,
   ID_FACTURA           int                  not null,
   CODIGO_CATEGORIA     int                  not null,
   DESCRIPCION          varchar(30)          not null,
   CANTIDAD             int                  not null,
   PRECIO_UNITARIO      money                not null,
   constraint PK_DETALLE_FACTURA primary key nonclustered (ID_DETALLE_FACTURA)
)
go

/*==============================================================*/
/* Index: TIENE_FK                                              */
/*==============================================================*/
create index TIENE_FK on DETALLE_FACTURA (
ID_FACTURA ASC
)
go

/*==============================================================*/
/* Index: ESTA_FK                                               */
/*==============================================================*/
create index ESTA_FK on DETALLE_FACTURA (
CODIGO_CATEGORIA ASC
)
go

/*==============================================================*/
/* Table: FACTURA                                               */
/*==============================================================*/
create table FACTURA (
   ID_FACTURA           int                  not null,
   ID_RETENCION         int                  null,
   ID_USUARIO           int                  null,
   ID_VALE_CAJA_CHICA   int                  null,
   FECHA_FACTURA        datetime             not null,
   NOMBRE_PROVEEDOR     varchar(30)          not null,
   TOTAL                money                not null,
   DOCUMENTO_FACTURA    binary(1)            not null,
   constraint PK_FACTURA primary key nonclustered (ID_FACTURA)
)
go

/*==============================================================*/
/* Index: GENERA_FK                                             */
/*==============================================================*/
create index GENERA_FK on FACTURA (
ID_VALE_CAJA_CHICA ASC
)
go

/*==============================================================*/
/* Index: RETIENE_FK                                            */
/*==============================================================*/
create index RETIENE_FK on FACTURA (
ID_RETENCION ASC
)
go

/*==============================================================*/
/* Index: INGRESA_FK                                            */
/*==============================================================*/
create index INGRESA_FK on FACTURA (
ID_USUARIO ASC
)
go

/*==============================================================*/
/* Table: RETENCION_FACTURA                                     */
/*==============================================================*/
create table RETENCION_FACTURA (
   ID_RETENCION         int                  not null,
   ID_FACTURA           int                  not null,
   VALOR_RETENCION      money                not null,
   DOCUMENTO_RETENCION  binary(1)            not null,
   constraint PK_RETENCION_FACTURA primary key nonclustered (ID_RETENCION)
)
go

/*==============================================================*/
/* Index: RETIENE2_FK                                           */
/*==============================================================*/
create index RETIENE2_FK on RETENCION_FACTURA (
ID_FACTURA ASC
)
go

/*==============================================================*/
/* Table: SOLICITUD                                             */
/*==============================================================*/
create table SOLICITUD (
   ID_SOLICITUD         varchar(10)          not null,
   ID_USUARIO           int                  null,
   NOMBRE_SOLICITANTE   varchar(30)          not null,
   FECHA_SOLICITUD      datetime             not null,
   DEPARTAMENTO         varchar(10)          not null,
   ESTADO               varchar(10)          not null,
   DOCUMENTO_QUIPUX     binary(1)            not null,
   DOCUMETNTO_ORDEN_COMPRA binary(1)            null,
   MEMODE_NOCOMPRA      binary(1)            null,
   constraint PK_SOLICITUD primary key nonclustered (ID_SOLICITUD)
)
go

/*==============================================================*/
/* Index: RECIVE_FK                                             */
/*==============================================================*/
create index RECIVE_FK on SOLICITUD (
ID_USUARIO ASC
)
go

/*==============================================================*/
/* Table: USUARIO                                               */
/*==============================================================*/
create table USUARIO (
   ID_USUARIO           int                  not null,
   NOMBRE_USUARIO       varchar(30)          not null,
   NICK_USUARIO         varchar(10)          not null,
   PASS                 varchar(1)           not null,
   constraint PK_USUARIO primary key nonclustered (ID_USUARIO)
)
go

/*==============================================================*/
/* Table: VALE_CAJA_CHICA                                       */
/*==============================================================*/
create table VALE_CAJA_CHICA (
   ID_VALE_CAJA_CHICA   int                  not null,
   ID_FACTURA           int                  null,
   DOCUMENTO_VALE_CAJA_CHICA binary(1)            not null,
   NOMBRE_ENCARGADA     varchar(30)          not null,
   constraint PK_VALE_CAJA_CHICA primary key nonclustered (ID_VALE_CAJA_CHICA)
)
go

/*==============================================================*/
/* Index: GENERA2_FK                                            */
/*==============================================================*/
create index GENERA2_FK on VALE_CAJA_CHICA (
ID_FACTURA ASC
)
go

alter table CAJA_CHICA
   add constraint FK_CAJA_CHI_MODIFICA_FACTURA foreign key (ID_FACTURA)
      references FACTURA (ID_FACTURA)
go

alter table DETALLE_FACTURA
   add constraint FK_DETALLE__ESTA_CATEGORI foreign key (CODIGO_CATEGORIA)
      references CATEGORIA_PARTIDA_PRESPUESTARIA (CODIGO_CATEGORIA)
go

alter table DETALLE_FACTURA
   add constraint FK_DETALLE__TIENE_FACTURA foreign key (ID_FACTURA)
      references FACTURA (ID_FACTURA)
go

alter table FACTURA
   add constraint FK_FACTURA_GENERA_VALE_CAJ foreign key (ID_VALE_CAJA_CHICA)
      references VALE_CAJA_CHICA (ID_VALE_CAJA_CHICA)
go

alter table FACTURA
   add constraint FK_FACTURA_INGRESA_USUARIO foreign key (ID_USUARIO)
      references USUARIO (ID_USUARIO)
go

alter table FACTURA
   add constraint FK_FACTURA_RETIENE_RETENCIO foreign key (ID_RETENCION)
      references RETENCION_FACTURA (ID_RETENCION)
go

alter table RETENCION_FACTURA
   add constraint FK_RETENCIO_RETIENE2_FACTURA foreign key (ID_FACTURA)
      references FACTURA (ID_FACTURA)
go

alter table SOLICITUD
   add constraint FK_SOLICITU_RECIVE_USUARIO foreign key (ID_USUARIO)
      references USUARIO (ID_USUARIO)
go

alter table VALE_CAJA_CHICA
   add constraint FK_VALE_CAJ_GENERA2_FACTURA foreign key (ID_FACTURA)
      references FACTURA (ID_FACTURA)
go

