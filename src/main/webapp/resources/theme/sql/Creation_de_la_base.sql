Create database if not exists bonplans;

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
             
             
CREATE TABLE if not exists contact (
             id MEDIUMINT NOT NULL AUTO_INCREMENT,
             id_utilisateur MEDIUMINT NOT NULL,
             type_  CHAR(20) NOT NULL,
             numero CHAR(10) NOT NULL,
             PRIMARY KEY (id),
             FOREIGN KEY (id_utilisateur) REFERENCES utilisateur(id)
                     ON DELETE CASCADE
             
);


CREATE TABLE if not exists adresse (
             id MEDIUMINT NOT NULL AUTO_INCREMENT,
             id_utilisateur MEDIUMINT NOT NULL,
             type_  CHAR(20) NOT NULL,
             numero CHAR(5) NOT NULL,
             type_de_voie CHAR(15) NOT NULL,
             nom_de_voie CHAR(20) NOT NULL,
             complement CHAR(10) NOT NULL,
             code_postal CHAR(5) NOT NULL,
             ville CHAR(30) NOT NULL,
             PRIMARY KEY (id),
             FOREIGN KEY (id_utilisateur) REFERENCES utilisateur(id)
                     ON DELETE CASCADE
);
