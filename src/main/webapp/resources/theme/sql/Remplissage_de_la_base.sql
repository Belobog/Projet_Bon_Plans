use bonplans;

CREATE TABLE if not exists utilisateur (
             id MEDIUMINT NOT NULL AUTO_INCREMENT,
             pseudo CHAR(10) NOT NULL,
             email CHAR(30) NOT NULL,
             role CHAR(10) NOT NULL,
             password CHAR(20) NOT NULL,
             nom CHAR(30) NOT NULL,
             prenom CHAR(30) NOT NULL,
             date_de_naissance CHAR(10) NOT NULL,
             date_inscription CHAR(10) NOT NULL,
             active CHAR(1) NOT NULL,
             PRIMARY KEY (id)
);


Insert Into utilisateur (pseudo,email,role,password,nom,prenom,date_de_naissance,date_inscription,active)
values ('azerty','azerty@live.fr','admin','Azerty1234','azerty','azerty','01/01/1970','01/01/1970','1');
             
             
