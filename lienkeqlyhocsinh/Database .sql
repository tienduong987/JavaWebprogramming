DROP DATABASE IF EXISTS QLYSINHVIEN;
create database QLYSINHVIEN;
use QLYSINHVIEN;
DROP TABLE IF EXISTS STUDENT;
CREATE TABLE STUDENT(
id int primary key,
name varchar (100),
email varchar(100),
pass varchar (100)
);

DROP TABLE IF EXISTS QUESTIONS;
create table QUESTIONS(
id int primary key,
content varchar(500),
answer_a varchar(100),
answer_b varchar(100),
answer_c varchar(100),
answer_d varchar(100),
correct varchar (45)
);
insert into STUDENT(id,name,email,pass) values ('001', 'Nguyen Nam','nguyennam@gmail.com','123'); 
insert into STUDENT(id,name,email,pass) values ('002', 'Do Cuong','cuong@gmail.com','1234'); 
insert into STUDENT(id,name,email,pass) values ('003', 'Hoang Dong','dong@gmail.com','1235'); 

DROP TABLE if exists STUDENT_QUESTION;
create table STUDENT_QUESTION(
student_id INT,
contion_id INT,
answer varchar(45)
);


select * from STUDENT;

 