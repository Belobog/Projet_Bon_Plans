use bonplans;

#Remplissage de la table utilisateur
Insert Into utilisateur (pseudo,email,password,nom,prenom,date_de_naissance,date_inscription,active)
values ('azerty','azerty@live.fr','Azerty1234','azerty','azerty','01/01/1970','01/01/1970','1');            

#Remplissage de la table role
Insert into role (nom) 
values ('admin');
Insert into role (nom) 
values ('moderateur');
Insert into role (nom) 
values ('auteur');
Insert into role (nom) 
values ('utilisateur');

#Remplissage de la table role_to_utilisateur
Insert into role_to_utilisateur (id_role,id_utilisateur)
values (1,1);

#Remplissage de la table categorie
Insert into categorie (nom) values('Informatique');
Insert into categorie (nom) values('Cuisine');
Insert into categorie (nom) values('Langues etrangeres');
Insert into categorie (nom) values('Sports');
Insert into categorie (nom) values('Voyage');



