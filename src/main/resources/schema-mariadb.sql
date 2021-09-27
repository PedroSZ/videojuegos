drop table if exists videojuego;

create table videojuego(
    id int primary key auto_increment,
    nombre varchar(200) not null,
    descripcion varchar(3000),
    imagen_url varchar(500)
);

insert into videojuego
(id, nombre, descripcion, imagen_url)values
(1,'Metal Gear Solid 3', 'La versión ampliada de Snake Eater salió al mercado en 2006 con una portada increíble, muy por encima del resto de portadas de la saga -que tienen su público también-. En ella se nos mostraba a Big Boss en uno de los mejores y más emotivos momentos de la trama, superando con creces a la carátula original.', 'https://sm.ign.com/ign_es/screenshot/default/60225-metal-gear-solid-3-subsistence-playstation-2_umwf.jpg'),
(2,'juego 2', 'esta es la descripcion de juego 2', 'https://m.media-amazon.com/images/I/91oFP7GhmSL._AC_SY741_.jpg'),
(3,'juego 3', 'esta es la descripcion de juego 3', 'https://m.media-amazon.com/images/I/91oFP7GhmSL._AC_SY741_.jpg'),
(4,'Forza 2 Motosport', 'El título de Turn10 inauguraba el género de carreras propiamente dicho en la generación para los usuarios de Xbox 360 -los de PS3 tendrían que esperar un poco más-.', 'https://im.ziffdavisinternational.com/ign_es/screenshot/default/forza-motosport-2_qsxu.jpg'),
(5,'juego 4', 'esta es la descripcion de juego 4', 'https://m.media-amazon.com/images/I/91oFP7GhmSL._AC_SY741_.jpg');

drop table if exists distribuidor;
create table distribuidor(
    id int primary key auto_increment,
    nombre varchar(100),
    sitio_web varchar(50)
);

insert into distribuidor
(id, nombre, sitio_web) values
(1, '2k', 'https://ventas.beyond-game.com/'),
(2, 'veyond game', 'https://ventas.beyond-game.com/'),
(3, 'tres videogame', 'https://ventas.beyond-game.com/'),
(4, 'cuatro juegos', 'https://ventas.beyond-game.com/'),
(5, 'cinco videogame', 'https://ventas.beyond-game.com/'),
(6, 'seis videogame', 'https://ventas.beyond-game.com/');


alter table videojuego
add column distribuidor_id int,
add foreign key (distribuidor_id) references distribuidor(id);  

update videojuego set distribuidor_id = 1 where id in (1,6);
update videojuego set distribuidor_id = 2 where id in (4);
update videojuego set distribuidor_id = 3 where id in (2);
update videojuego set distribuidor_id = 4 where id in (5);
update videojuego set distribuidor_id = 5 where id in (3);

alter table videojuego
modify distribuidor_id int not null;



drop table if exists desarrollador;
create table desarrollador(
    id int primary key auto_increment,
    nombre varchar(100),
    sitio_web varchar(50)
);
insert into desarrollador 
(id,    nombre,     sitio_web) values
(1, 'microsoft', 'https://developer.microsoft.com/en-us/games/'),
(2, 'playgame', 'https://developer.microsoft.com/en-us/games/'),
(3, 'gamedevelop', 'https://developer.microsoft.com/en-us/games/'),
(4, 'videovirtual', 'https://developer.microsoft.com/en-us/games/'),
(5, 'virtualsoft', 'https://developer.microsoft.com/en-us/games/'),
(6, 'virtualia', 'https://developer.microsoft.com/en-us/games/');

alter table videojuego
add column desarrollador_id int,
add foreign key (desarrollador_id) references desarrollador(id);

update videojuego set desarrollador_id = 1 where id in (2,5);
update videojuego set desarrollador_id = 2 where id in (4);
update videojuego set desarrollador_id = 3 where id in (6);
update videojuego set desarrollador_id = 4 where id in (3);
update videojuego set desarrollador_id = 5 where id in (1);


alter table videojuego
modify desarrollador_id int not null;