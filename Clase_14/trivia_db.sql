create database trivia_db;

use trivia_db;

create table questions(
id int not null auto_increment,
question varchar(100) not null,
option1 varchar(100) not null,
option2 varchar(100) not null,
option3 varchar(100) not null,
correctOption int not null,
categoryID int,
primary key(id) 
);

create table categories(
id int not null auto_increment,
category varchar(100) not null unique,
categoryDescription varchar(200) not null,
primary key(id)
);

INSERT INTO categories (category, categoryDescription) VALUES ('tecnología', 'Categoría de preguntas relacionadas con la tecnología');

INSERT INTO questions (question, option1, option2, option3, correctOption, categoryID) 
VALUES ('¿Cual de estos no es un lenguaje de programacion?', 'Java', 'CSS', 'C++', 2, 1);


SELECT *
FROM questions q
INNER JOIN categories c ON q.categoryID = c.id;
