package fr.bonplans.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.bonplans.modele.interfaces.IUtilisateur;

public interface UtilisateurRepository extends MongoRepository<IUtilisateur,String> {

}
