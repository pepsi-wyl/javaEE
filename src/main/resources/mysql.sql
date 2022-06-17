create
database javaee;

use
javaee;

create table student
(
    id   int auto_increment
        primary key,
    name varchar(20) null,
    sex  varchar(2) null
);

insert into student
VALUES (1, 'wyl', '男')
     , (2, 'pepsi-wyl', '男');