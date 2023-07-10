
CREATE database movies_db;


use movies_db;


create table generos(
id INT NOT NULL AUTO_INCREMENT,
genero varchar(20) NOT NULL UNIQUE,
primary key(id)
);

CREATE TABLE director (
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(60) not null,
  nacionalidad VARCHAR(30)not null,
  nacimiento DATE not null,
  biografia TEXT not null,
  primary key(id)
);

CREATE TABLE actor (
  id INT not null auto_increment,
  nombre VARCHAR(255),
  nacionalidad VARCHAR(255),
  nacimiento DATE,
  biografia TEXT,
  PRIMARY KEY(id)
);

CREATE TABLE pelicula (
  id INT not null auto_increment,
  titulo VARCHAR(255) not null,
  sinopsis TEXT not null,
  imdb_rank INT not null,
  directorID INT not null,
  generoID INT not null,
  estreno_fecha DATE not null,
  plataformaID INT not null,
  PRIMARY KEY(id)
);


CREATE TABLE plataforma (
  id INT not null auto_increment,
  nombre VARCHAR(255) not null unique,
  url VARCHAR(255) not null,
  precio INT not null,
  PRIMARY KEY(id)
);


INSERT INTO plataforma (nombre, url, precio)
VALUES ('Netflix', 'https://www.netflix.com', 3000);


INSERT INTO director (nombre, nacionalidad, nacimiento, biografia)
VALUES ('Tony Scott', 'Inglaterra', '1944-06-20', 'Director británico de cine, conocido por películas como "Top Gun" y "Enemy of the State". Su estilo visual y narrativo es inconfundible.');

INSERT INTO generos (genero)
VALUES ('Acción');

INSERT INTO pelicula (titulo, sinopsis, imdb_rank, directorID, generoID, estreno_fecha, plataformaID)
VALUES ('Top Gun', 'Piloto rebelde se enfrenta a desafíos, rivalidades y romance en la escuela de élite de vuelo de la Marina de los Estados Unidos.', 8, 1, 1, '1986-05-16', 1);


select * from pelicula;
