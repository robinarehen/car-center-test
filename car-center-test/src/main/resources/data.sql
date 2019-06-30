insert into TIPOS_PERSONA (nombre, descripcion) values ('Empleado', 'Empleado de Car Center');
insert into TIPOS_PERSONA (nombre, descripcion) values ('Cliente', 'Cliente de Car Center');

insert into TIPOS_IDENTIFICACION (nombre, descripcion) values ('CC', 'Cedula de Ciudadania');

insert into TIPOS_GENERO (nombre, descripcion) values ('F', 'Femenino');
insert into TIPOS_GENERO (nombre, descripcion) values ('M', 'Masculino');

insert into TIPOS_ESTADO (nombre_tabla, nombre, descripcion) 
	values ('ALL_TABLES', 'Activo', 'Estado igual para todas las tablas que lo utilicen');
insert into TIPOS_ESTADO (nombre_tabla, nombre, descripcion) 
	values ('ALL_TABLES', 'Inactivo', 'Estado igual para todas las tablas que lo utilicen');

insert into DATOS_PERSONALES (
		id_tipo_persona, id_tipo_identificacion, id_tipo_genero, id_tipo_estado, 
		numero_identificacion, nombres, primer_apellido, segundo_apellido)
	values (1, 1, 2, 1, 1047, 'Robin', 'Arellano', 'Henriquez');

insert into USUARIOS (id_persona, id_tipo_estado, username, password) 
	values (1, 1, 'rarellano', '$2a$10$FokseVmmy7ev6w8RcCg3B.4YCHqEdIGmfu1rPIYJGeb.9ZjrwzewO');

insert into CIUDADES (nombre, descripcion) values ('Bogotá D.C', 'Distrito Capital');
