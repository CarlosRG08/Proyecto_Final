drop schema if exists Proyecto;
drop user if exists usuario_proyecto;
CREATE SCHEMA Proyecto;

create user 'usuario_proyecto'@'%' identified by 'clave_proyecto';

grant all privileges on Proyecto.* to 'usuario_proyecto'@'%';
flush privileges;

create table Proyecto.Paciente(
  cedula_pac INT NOT NULL,
  nombre_comp_pac VARCHAR(150) NOT NULL,
  edad_pac INT NOT NULL,
  provincia_pac VARCHAR(30) NOT NULL,
  canton_pac VARCHAR(30) NOT NULL,
  distrito_pac VARCHAR(30) NOT NULL,
  estado_civil_pac VARCHAR(30) NOT NULL,
  sintomologia VARCHAR(500) NOT NULL,
  masa_kg_pac INT NOT NULL,
  altura_pac INT NOT NULL,
  artritis BOOLEAN NOT NULL,
  gota BOOLEAN NOT NULL,
  lupus BOOLEAN NOT NULL,
  fibromialgia BOOLEAN NOT NULL,
  
  PRIMARY KEY (cedula_pac)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;