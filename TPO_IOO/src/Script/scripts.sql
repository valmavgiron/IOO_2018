/*insert into test3 ( id ) values (seq_prueba.currval); */
--select * from test3 

--SELECT seq_prueba.nextval from DUAL;
--insert into test3 ( id ) values (seq_prueba.currval);

-- Recordar incrementar primero el sequence con el "SELECT seq_*SEQUENCE*.nextval from DUAL;" y despues hacer el insert con currval

--Creacion de Sequence
CREATE SEQUENCE SEQ_ABONO START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE SEQ_ACTIVIDAD START WITH 1 INCREMENT BY 1;
CREATE SEQUENCE SEQ_SOCIO START WITH 1 INCREMENT BY 1;
-- Creacion Tablas
CREATE TABLE ABONO(ID_ABONO INT PRIMARY KEY, NOMBRE VARCHAR(40), PRECIO DECIMAL, VIGENCIA DATE,TIPO VARCHAR(20));
CREATE TABLE SOCIO(ID_SOCIO INT PRIMARY KEY,NOMBRE VARCHAR(50),APELLIDO VARCHAR(50),DOMICILIO VARCHAR(100),TELEFONO VARCHAR(40),EMAIL VARCHAR(60),CERT_FECHA DATE,CERT_MEDICO VARCHAR(60),CERT_OBS VARCHAR(100));
CREATE TABLE ACTIVIDAD(ID_ACTIVIDAD INT PRIMARY KEY, TITULO VARCHAR(50), DESCRIPCION VARCHAR(100));