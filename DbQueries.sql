create database test;
use test;

create table user (
 id int,
 username varchar(20),
 pwd varchar(20)
);

select * from user;

insert into user values (101,"superman","fly"),(102,"spiderman","web");

alter table user modify pwd varchar(100);
alter table user modify id int primary key;
insert into user values (103,"kumar","$IVNvNPxALmSEMZVIZZJsC.Z7M0.NqTOEoGdanfN3A.snXdNPO18Oe"),(104,"harish","$pf7qBvSfO/EH6Z4l0xjjGefXEsdBgd63r8xWCDQzlkS6Bukax6AVu");
update user SET pwd = "$2y$12$pf7qBvSfO/EH6Z4l0xjjGefXEsdBgd63r8xWCDQzlkS6Bukax6AVu" where id = 104;
update user SET pwd = "$2y$12$MvKSvFh69RNhNnjyJtkVfefHUb.KDBFV3Qn0E5e282Mqvo/gUKkzq" where id = 103;