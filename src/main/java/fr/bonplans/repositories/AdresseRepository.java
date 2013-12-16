package fr.bonplans.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.bonplans.modele.interfaces.IAdresse;

public interface AdresseRepository extends MongoRepository<IAdresse, String> {

}
