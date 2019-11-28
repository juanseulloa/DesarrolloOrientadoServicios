
/*==============================================================*/
/* Table: ESTADO                                                */
/*==============================================================*/
create table ESTADO (
   IDESTADO             SERIAL               not null,
   TIPOESTADO           VARCHAR(20)          not null,
   constraint PK_ESTADO primary key (IDESTADO)
);

/*==============================================================*/
/* Table: LIBRO                                                 */
/*==============================================================*/
create table LIBRO (
   IDLIBRO              SERIAL               not null,
   NOMBRELIBRO          VARCHAR(100)         not null,
   EDICION              VARCHAR(100)         not null,
   AUTOR                VARCHAR(100)         not null,
   ANIO                 VARCHAR(100)             not null,
   constraint PK_LIBRO primary key (IDLIBRO)
);

/*==============================================================*/
/* Table: PERSONA                                               */
/*==============================================================*/
create table PERSONA (
   IDESTUDIANTE         SERIAL               not null,
   NOMBREESTUDIANTE     VARCHAR(100)         not null,
   APELLIDOESTUDIANTE   VARCHAR(100)         not null,
   CODIGO               VARCHAR(100)         not null,
   DOCUMENTO            VARCHAR(100)         not null,
   EMAIL                VARCHAR(100)         not null,
   DEPENDENCIA          VARCHAR(300)         not null,
   constraint PK_PERSONA primary key (IDESTUDIANTE)
);

/*==============================================================*/
/* Table: PRESTAMO                                              */
/*==============================================================*/
create table PRESTAMO (
   IDPRESTAMO           SERIAL               not null,
   FECHAPRESTAMO        VARCHAR(100)           not null,
   FECHAENTREGA         VARCHAR(100)           not null,
   IDLIBRO              INT4                 not null,
   IDESTUDIANTE         INT4                 not null,
   constraint PK_PRESTAMO primary key (IDPRESTAMO)
);

/*==============================================================*/
/* Table: PRESTAMO_ESTADO                                       */
/*==============================================================*/
create table PRESTAMO_ESTADO (
   IDPRESTAMOESTADO     SERIAL               not null,
   IDESTADO             INT4                 not null,
   IDPRESTAMO           INT4                 not null,
   HORA                 VARCHAR(100)            not null,
   constraint PK_PRESTAMO_ESTADO primary key (IDPRESTAMOESTADO)
);

alter table PRESTAMO
   add constraint FK_PRESTAMO_REFERENCE_LIBRO foreign key (IDLIBRO)
      references LIBRO (IDLIBRO)
      on delete restrict on update restrict;

alter table PRESTAMO
   add constraint FK_PRESTAMO_REFERENCE_PERSONA foreign key (IDESTUDIANTE)
      references PERSONA (IDESTUDIANTE)
      on delete restrict on update restrict;

alter table PRESTAMO_ESTADO
   add constraint FK_PRESTAMO_REFERENCE_PRESTAMO foreign key (IDPRESTAMO)
      references PRESTAMO (IDPRESTAMO)
      on delete restrict on update restrict;

alter table PRESTAMO_ESTADO
   add constraint FK_PRESTAMO_REFERENCE_ESTADO foreign key (IDESTADO)
      references ESTADO (IDESTADO)
      on delete restrict on update restrict;

