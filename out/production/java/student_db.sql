drop database if exists STUDENT_DB;
create database STUDENT_DB character set = utf8;
use STUDENT_DB;
create table COURSE(
  code char(4) primary key check ( char_length(code)=4 ),
  name varchar(20) unique not null,
  level enum ('Basic','Intermediate','Advanced') not null default 'Basic',
  duration smallint not null ,
  fees int not null check ( fees>0 ),
  available enum('Yes','No') not null default 'No'
);
insert COURSE values
('C001','Java basic','Basic',180,10000,1),
('C002','Spring framework','Advanced',240,150000,1),
('C011','Angular','Intermediate',200,150000,1),
('C012','NEST JS','Advanced',240,15000,1),
('C021','Flutter','Basic',200,15000,1);
create table MODULE(
    id smallint auto_increment primary key ,
    course_code char(4) not null ,
    display tinyint not null default 0 check ( display>=0 ),
    name varchar(40) not null ,
    duration smallint not null,
    description varchar(500),
    deleted boolean default false,
    foreign key (course_code) references COURSE (code)
);
insert MODULE
(course_code,name,display,duration) values
 ('C001','Language Fundamentals',1,16),
 ('C001','OOP',2,20),
 ('C001','Essential Java Api',3,36),
 ('C001','Language Fundamentals',1,16);
create table TEACHER(
    code char(6) primary key ,
    name varchar(20) not null ,
    registration_date varchar(20) not null ,
    phone varchar(14) not null check ( phone like '09%'),
    email varchar(80) check ( email=null or email='' or email like '%@%'),
    password varchar(255) not null ,
    change_password boolean default false,
    retire_date date
);
insert into TEACHER (code,registration_date,phone,name,password) values
('Thurei','2021','09693163723','Thurein Htet','0022555'),
('Thihda','2021','09693163723','Thurein Htet','0022555'),
('Kyaddw','2021','09693163723','Thurein Htet','0022555'),
('Miwwn','2021','09693163723','Thurein Htet','0022555');
create table class(
  course_code char(4) not null ,
  start_date date not null ,
  teacher_code char(6) not null ,
  description varchar(500),
  acceptable boolean default false,
  status enum('Announced','Teaching','Finished') default 'Announced',
    primary key (course_code,start_date),
    foreign key (course_code) references COURSE (code),
    foreign key (teacher_code) references TEACHER(code)
);
create table class_days(
    course_code char(4) not null ,
    start_date date not null,
    day enum('Mon','Tue','Wed','Thu','Fri','Sat','Sun'),
    start_time time not null,
    end_time time not null,
    remark varchar(255),
    primary key (course_code,start_date,day),
    foreign key (course_code,start_date) references class (course_code,start_date)
);
create table student(
    id int auto_increment primary key ,
    name varchar(40) not null ,
    registration_date date not null ,
    phone varchar(13) not null check ( phone like '09%'),
    email varchar(80) check ( email=null or email like '%@%'),
    password varchar(255) not null ,
    changed_password boolean default false,
    date_of_birth date,
    last_education enum('BEHS','College','Master','Other'),
    it_related boolean
);
create table registration(
  course_code char(4) not null ,
  start_date date not null ,
  student_id int not null ,
  registration_date date not null ,
  total_paid int,
  status enum ('Paid','Remain'),
  primary key (course_code,start_date,student_id),
  foreign key (course_code,start_date) references class(course_code,start_date),
  foreign key (student_id) references student(id)
);
create table paid_history(
   course_code char(4) not null ,
   start_date date not null ,
   student_id int not null ,
   paid_date date not null ,
   primary key (course_code,start_date,student_id,paid_date),
   fees int not null check ( fees>0 ),
   last_paid int not null default 0 check ( last_paid>=0 ),
   paid int not null check ( paid>=0 ),
   next_paid_date date,
   remark varchar(255)
);
insert into class (course_code,teacher_code,start_date,description) values
('C001','Pyaeph','20210707','Online July Intake');