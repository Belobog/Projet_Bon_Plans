package fr.bonplans.controller;



import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.validation.Valid;

import org.joda.time.LocalTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import fr.bonplans.controller.interfaces.IAccueilController;
import fr.bonplans.controller.interfaces.IInscriptionController;
import fr.bonplans.modele.Adresse;
import fr.bonplans.modele.Contact;
import fr.bonplans.modele.Person;
import fr.bonplans.modele.Utilisateur;
import fr.bonplans.modele.interfaces.IAdresse;
import fr.bonplans.modele.interfaces.IContact;
import fr.bonplans.modele.interfaces.IUtilisateur;
import fr.bonplans.repositories.ContactRepository;
import fr.bonplans.repositories.UtilisateurRepository;


@Controller
public class InscriptionController implements IInscriptionController{
	
	@Autowired
	private UtilisateurRepository repository;
	
	@RequestMapping(value="/Inscription", method=RequestMethod.GET)
    public String showInscription(Utilisateur utilisateur) {
		System.out.println("Inscription");
        return "Inscription";
    }
	
	@RequestMapping(value="/Inscription", method=RequestMethod.POST)
    public String validerInscription(@Valid Utilisateur utilisateur , BindingResult bindingResult, 
            RedirectAttributes redirectAttributes) {
		System.out.println("liste des erreurs");
		for(FieldError error : bindingResult.getFieldErrors()){
			String erreur = "error_"+error.getObjectName()+"_"+error.getField();
			redirectAttributes.addFlashAttribute(erreur,error.getField()+" "+ bindingResult.getFieldError().getDefaultMessage());
		}
		System.out.println("-----------------------------------------------");
    	/*
		utilisateur.setRole("admin");
    	System.out.println("Avant");
    	System.out.println("pseudo vaut "+utilisateur.getPseudo());
    	System.out.println("role vaut "+utilisateur.getRole());
    	System.out.println("password vaut "+utilisateur.getPassword());
    	System.out.println("nom vaut "+utilisateur.getNom());
    	System.out.println("prenom vaut "+utilisateur.getPrenom());
    	*/
		
		
    	//IUtilisateur utilisateur = new Utilisateur();
    	/*IAdresse adresse = new Adresse();
    	IContact contact = new Contact();
    	
    	contact.setMail("mail@live.fr");
    	contact.setNumero("0666666666");
    	contact.setType("Admin");
    	
    	adresse.setCode_postal("75019");
    	adresse.setComplement("bis");
    	adresse.setNumero("12");
    	adresse.setType("livraison");
    	adresse.setType_de_voie("rue");
    	adresse.setVille("Paris");
    	
    	ArrayList<IAdresse> adresses = new ArrayList<IAdresse>();
    	adresses.add(adresse);
    	
    	ArrayList<IContact> contacts = new ArrayList<IContact>();
    	contacts.add(contact);
    	utilisateur.setAdresses(adresses);
    	utilisateur.setContacts(contacts);
    	utilisateur.setDate_de_naissance("12/07/1998");
    	utilisateur.setNom("Maric");
    	utilisateur.setPassword("test");
    	utilisateur.setPrenom("Boris");
    	utilisateur.setPseudo("Pseudo");
    	utilisateur.setRole("admin");
    	
    	repository.save(utilisateur);
    	
    	*/
    	
    	System.out.println("Après");
        if (bindingResult.hasErrors()) {
        	System.out.println("Dans le if");
            //redirectAttributes.addFlashAttribute("error_pseudo", bindingResult.getFieldError().getDefaultMessage());
            return "redirect:/Inscription";
        }
        return "rest";
    }
   
    /*
    @RequestMapping(value="/Inscription", method=RequestMethod.POST)
    public String validerInscription(@Valid Person person, BindingResult bindingResult, 
            RedirectAttributes redirectAttributes) {
    	
    	System.out.println("Avant");
    	
    	IUtilisateur utilisateur = new Utilisateur();
    	IAdresse adresse = new Adresse();
    	IContact contact = new Contact();
    	
    	contact.setMail("mail@live.fr");
    	contact.setNumero("0666666666");
    	contact.setType("Admin");
    	
    	adresse.setCode_postal("75019");
    	adresse.setComplement("bis");
    	adresse.setNumero("12");
    	adresse.setType("livraison");
    	adresse.setType_de_voie("rue");
    	adresse.setVille("Paris");
    	
    	ArrayList<IAdresse> adresses = new ArrayList<IAdresse>();
    	adresses.add(adresse);
    	
    	ArrayList<IContact> contacts = new ArrayList<IContact>();
    	contacts.add(contact);
    	utilisateur.setAdresses(adresses);
    	utilisateur.setContacts(contacts);
    	utilisateur.setDate_de_naissance("12/07/1998");
    	utilisateur.setNom("Maric");
    	utilisateur.setPassword("test");
    	utilisateur.setPrenom("Boris");
    	utilisateur.setPseudo("Pseudo");
    	utilisateur.setRole("admin");
    	
    	repository.save(utilisateur);
    	
    	
    	
    	System.out.println("Après");
        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("error", bindingResult.getFieldError().getDefaultMessage());
            return "redirect:/Inscription";
        }
        return "results";
    }
    */
    
    
    
    
    
    
    
    

}
