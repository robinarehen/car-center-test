insert into TIPOS_PERSONA (nombre, descripcion) values ('EMPLEADO', 'Empleado de Car Center');
insert into TIPOS_PERSONA (nombre, descripcion) values ('CLIENTE', 'Cliente de Car Center');

insert into TIPOS_IDENTIFICACION (nombre, descripcion) values ('CC', 'Cedula de Ciudadania');

insert into TIPOS_GENERO (nombre, descripcion) values ('F', 'Femenino');
insert into TIPOS_GENERO (nombre, descripcion) values ('M', 'Masculino');

insert into TIPOS_ESTADO (nombre_tabla, nombre, descripcion) 
	values ('ALL_TABLES', 'ACTIVO', 'Estado igual para todas las tablas que lo utilicen');
insert into TIPOS_ESTADO (nombre_tabla, nombre, descripcion) 
	values ('ALL_TABLES', 'INACTIVO', 'Estado igual para todas las tablas que lo utilicen');

insert into DATOS_PERSONALES (
		id_tipo_persona, id_tipo_identificacion, id_tipo_genero, id_tipo_estado, 
		numero_identificacion, nombres, primer_apellido, segundo_apellido)
	values (1, 1, 2, 1, 1047, 'Robin', 'Arellano', 'Henriquez');

insert into USUARIOS (id_persona, id_tipo_estado, username, password, enabled) 
	values (1, 1, 'rarellano', '$2a$10$FokseVmmy7ev6w8RcCg3B.4YCHqEdIGmfu1rPIYJGeb.9ZjrwzewO', true);

insert into ROLES (nombre, descripcion) values ('ADMIN', 'Administrador del Dashboard Car Center');
insert into ROLES (nombre, descripcion) values ('MECANICO', 'Empleado Mecanico de Car Center');
insert into ROLES (nombre, descripcion) values ('CLIENTE', 'Cliente de Car Center');

insert into ROLES_USUARIOS (id_rol, id_usuario, descripcion) values (1, 1, 'user: rarellano - rol: admin');

insert into CIUDADES (nombre, descripcion) values ('Bogotá D.C', 'Distrito Capital');
