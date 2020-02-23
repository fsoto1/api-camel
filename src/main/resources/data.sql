DROP TABLE producto;

CREATE TABLE producto(
	id BIGINT AUTO_INCREMENT  PRIMARY KEY,
	nombre VARCHAR(250) NOT NULL,
	img VARCHAR(250) NOT NULL,
	descripcion VARCHAR(250) NOT NULL,
	precio INT AUTO_INCREMENT  NOT NULL,
	descuento DECIMAL(10,2),
	creacion TIMESTAMP,
	modificacion TIMESTAMP
);

INSERT INTO producto 
 (nombre, img, descripcion, precio, descuento, creacion, modificacion)
 VALUES
 ('Kunstmann Torobayo', 'img/1', 'Pack 4', 5400, 0, now(), now()),
 ('Kunstmann Miel', 'img/2', 'Pack 4', 5700, 0, now(), now()),
 ('Kunstmann sin filtrar', 'img/3', 'Pack 4', 6200, 0.2, now(), now()),
 ('Dolbek Ale', 'img/4', 'Pack 4', 4200, 0.11, now(), now()),
 ('Dolbek Maqui', 'img/5', 'Pack 4', 5200, 0, now(), now())
 ;