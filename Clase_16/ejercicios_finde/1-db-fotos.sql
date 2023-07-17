create database galeria_fotos;
use galeria_fotos;

CREATE TABLE categorias (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS etiquetas (
  id INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(50) NOT NULL
);




CREATE table fotos (
  id INT AUTO_INCREMENT PRIMARY KEY,
  titulo VARCHAR(100) NOT NULL,
  descripcion VARCHAR(255),
  url VARCHAR(200) NOT NULL,
  fecha_subida TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  categoria_id INT,
  FOREIGN KEY (categoria_id) REFERENCES categorias(id) ON DELETE SET NULL
);


CREATE TABLE IF NOT EXISTS fotos_etiquetas (
  foto_id INT,
  etiqueta_id INT,
  PRIMARY KEY (foto_id, etiqueta_id),
  FOREIGN KEY (foto_id) REFERENCES fotos(id) ON DELETE CASCADE,
  FOREIGN KEY (etiqueta_id) REFERENCES etiquetas(id) ON DELETE CASCADE
);
