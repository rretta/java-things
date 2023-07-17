create database db_users_gestion;
use db_users_gestion;

CREATE TABLE usuarios (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    contrasena VARCHAR(100) NOT NULL,
    fecha_registro DATE NOT NULL
);


CREATE TABLE roles (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL
);

CREATE TABLE permisos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) NOT NULL
);


ALTER TABLE usuarios ADD COLUMN rol_id INT;

ALTER TABLE usuarios
ADD FOREIGN KEY (rol_id) REFERENCES roles(id);

CREATE TABLE roles_permisos (
    id INT PRIMARY KEY AUTO_INCREMENT,
    rol_id INT NOT NULL,
    permiso_id INT NOT NULL,
    FOREIGN KEY (rol_id) REFERENCES roles(id),
    FOREIGN KEY (permiso_id) REFERENCES permisos(id)
);
