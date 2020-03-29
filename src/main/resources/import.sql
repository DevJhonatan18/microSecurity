

INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('andres','$2a$10$AkdYKj34k1fBL3ZOBc4eHeFue8BzrGkn3t9P3BxGPRvnoM6Oy1qiq',true, 'dockerStywar', 'vargas','Stywar.vargas@aforo255.com');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$UFd5VnjdXgOLkkNiMAMVLONiiQVP9V5NZgBK.0g5iodbdgI/NogUW',true, 'Franco', 'chino','Franco.chino@aforo255.com');

INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('jurbina','$2y$10$Bsdxw45qNqpXdpRI3H3fn.jgBH7zKDAxM7DHAJSclIu9MJug0MlEO',true, 'Jhonatan', 'Urbina','Jhonatan.Urbina@aforo255.com');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 2);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 1);

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (3, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (3, 2);
