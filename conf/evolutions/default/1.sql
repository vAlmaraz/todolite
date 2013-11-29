# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table tag (
  id                        bigint not null,
  tag                       varchar(255),
  constraint pk_tag primary key (id))
;

create table tarea (
  id                        bigint not null,
  descripcion               varchar(255),
  realizada                 boolean,
  autor_id                  bigint,
  constraint pk_tarea primary key (id))
;

create table usuario (
  id                        bigint not null,
  nombre                    varchar(255),
  constraint pk_usuario primary key (id))
;


create table tag_tarea (
  tag_id                         bigint not null,
  tarea_id                       bigint not null,
  constraint pk_tag_tarea primary key (tag_id, tarea_id))
;
create sequence tag_seq;

create sequence tarea_seq;

create sequence usuario_seq;

alter table tarea add constraint fk_tarea_autor_1 foreign key (autor_id) references usuario (id) on delete restrict on update restrict;
create index ix_tarea_autor_1 on tarea (autor_id);



alter table tag_tarea add constraint fk_tag_tarea_tag_01 foreign key (tag_id) references tag (id) on delete restrict on update restrict;

alter table tag_tarea add constraint fk_tag_tarea_tarea_02 foreign key (tarea_id) references tarea (id) on delete restrict on update restrict;

# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists tag;

drop table if exists tag_tarea;

drop table if exists tarea;

drop table if exists usuario;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists tag_seq;

drop sequence if exists tarea_seq;

drop sequence if exists usuario_seq;

