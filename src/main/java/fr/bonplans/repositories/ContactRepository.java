package fr.bonplans.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import fr.bonplans.modele.interfaces.IContact;

public interface ContactRepository extends MongoRepository<IContact, String>{

}
