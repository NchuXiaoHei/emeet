/*==============================================================*/
/* DBMS name:      SAP SQL Anywhere 16                          */
/* Created on:     2018/5/15 21:38:58                           */
/*==============================================================*/


if exists(select 1 from sys.sysforeignkey where role='FK_CH_USER_REFERENCE_USER') then
    alter table ch_user
       delete foreign key FK_CH_USER_REFERENCE_USER
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_CH_USER_REFERENCE_HY') then
    alter table ch_user
       delete foreign key FK_CH_USER_REFERENCE_HY
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_HY_REFERENCE_ZBF') then
    alter table hy
       delete foreign key FK_HY_REFERENCE_ZBF
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_HY_JL_REFERENCE_USER') then
    alter table hy_jl
       delete foreign key FK_HY_JL_REFERENCE_USER
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_HY_JL_REFERENCE_HY') then
    alter table hy_jl
       delete foreign key FK_HY_JL_REFERENCE_HY
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_LC_REFERENCE_HY') then
    alter table lc
       delete foreign key FK_LC_REFERENCE_HY
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_TP_REFERENCE_HY') then
    alter table tp
       delete foreign key FK_TP_REFERENCE_HY
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_TP_REFERENCE_USER') then
    alter table tp
       delete foreign key FK_TP_REFERENCE_USER
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ZBF_REFERENCE_USER') then
    alter table zbf
       delete foreign key FK_ZBF_REFERENCE_USER
end if;

if exists(select 1 from sys.sysforeignkey where role='FK_ZL_REFERENCE_HY') then
    alter table zl
       delete foreign key FK_ZL_REFERENCE_HY
end if;

drop table if exists ch_user;

drop table if exists hy;

drop table if exists hy_jl;

drop table if exists lc;

drop table if exists tp;

drop table if exists "user";

drop table if exists zbf;

drop table if exists zl;

/*==============================================================*/
/* Table: ch_user                                               */
/*==============================================================*/
create table ch_user 
(
   type                 text                           not null,
   user_id              numeric(11)                    not null,
   ID                   numeric(11)                    not null,
   constraint PK_CH_USER primary key clustered (user_id, ID)
);

/*==============================================================*/
/* Table: hy                                                    */
/*==============================================================*/
create table hy 
(
   ID                   numeric(11)                    not null,
   name                 varchar(255)                           not null,
   s_time               datetime                       not null,
   e_time               datetime                       not null,
   constraint PK_HY primary key clustered (ID)
);

/*==============================================================*/
/* Table: hy_jl                                                 */
/*==============================================================*/
create table hy_jl 
(
   ID                   numeric(11)                    not null,
   jl_id                int                            not null,
   user_id              numeric(11)                    not null,
   note                 text                           not null,
   constraint PK_HY_JL primary key clustered (ID, jl_id)
);

/*==============================================================*/
/* Table: lc                                                    */
/*==============================================================*/
create table lc 
(
   num                  int                            not null,
   ID                   numeric(11)                    not null,
   note                 text                           not null,
   s_time               datetime                       not null,
   e_time                 datetime                   not    null,
   constraint PK_LC primary key clustered (num, ID)
);

/*==============================================================*/
/* Table: tp                                                    */
/*==============================================================*/
create table tp 
(
   ID                   numeric(11)                    not null,
   user_id              numeric(11)                    not null,
   px                   bit                            not null,
   tp_id                int                            not null,
   constraint PK_TP primary key clustered (ID, user_id, tp_id)
);

/*==============================================================*/
/* Table: "user"                                                */
/*==============================================================*/
create table "user" 
(
   user_id              numeric(11)                    not null,
   pwd                  varchar(16)                    not null,
   constraint PK_USER primary key clustered (user_id)
);

/*==============================================================*/
/* Table: zbf                                                   */
/*==============================================================*/
create table zbf 
(
   user_id              numeric(11)                    not null,
   address                text                         not  null,
   tel                  varchar(100)                           not null,
   name                 varchar(255)                           not null,
   constraint PK_ZBF primary key clustered (name)
);

/*==============================================================*/
/* Table: zl                                                    */
/*==============================================================*/
create table zl 
(
   zl_id                int                            not null,
   ID                   numeric(11)                    not null,
   file_path            text                           not null,
   constraint PK_ZL primary key clustered (zl_id, ID)
);

alter table ch_users
   add constraint FK_CH_USER_REFERENCE_USER foreign key (user_id)
      references user (user_id)
      on update restrict
      on delete restrict;

alter table ch_users
   add constraint FK_CH_USER_REFERENCE_HY foreign key (ID)
      references hy (ID)
      on update restrict
      on delete restrict;

alter table hy
   add constraint FK_HY_REFERENCE_ZBF foreign key (name)
      references zbf (name)
      on update restrict
      on delete restrict;

alter table hy_jl
   add constraint FK_HY_JL_REFERENCE_USER foreign key (user_id)
      references user (user_id)
      on update restrict
      on delete restrict;

alter table hy_jl
   add constraint FK_HY_JL_REFERENCE_HY foreign key (ID)
      references hy (ID)
      on update restrict
      on delete restrict;

alter table lc
   add constraint FK_LC_REFERENCE_HY foreign key (ID)
      references hy (ID)
      on update restrict
      on delete restrict;

alter table tp
   add constraint FK_TP_REFERENCE_HY foreign key (ID)
      references hy (ID)
      on update restrict
      on delete restrict;

alter table tp
   add constraint FK_TP_REFERENCE_USER foreign key (user_id)
      references user (user_id)
      on update restrict
      on delete restrict;

alter table zbf
   add constraint FK_ZBF_REFERENCE_USER foreign key (user_id)
      references user (user_id)
      on update restrict
      on delete restrict;

alter table zl
   add constraint FK_ZL_REFERENCE_HY foreign key (ID)
      references hy (ID)
      on update restrict
      on delete restrict;

