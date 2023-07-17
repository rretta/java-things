create database db_web_menu;
use db_web_menu;

CREATE TABLE categorias (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL,
    categoria_padre_id INT,
    FOREIGN KEY (categoria_padre_id) REFERENCES categorias(id)
);


INSERT INTO categorias (nombre) VALUES ('Programación');
INSERT INTO categorias (nombre, categoria_padre_id) VALUES ('Frontend', 1);
INSERT INTO categorias (nombre, categoria_padre_id) VALUES ('Backend', 1);
INSERT INTO categorias (nombre, categoria_padre_id) VALUES ('¿Qué es la programación?', 1);
INSERT INTO categorias (nombre, categoria_padre_id) VALUES ('Javascript', 2);
INSERT INTO categorias (nombre, categoria_padre_id) VALUES ('Java', 3);
INSERT INTO categorias (nombre, categoria_padre_id) VALUES ('Python', 3);

select * from categorias;
