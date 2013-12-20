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

	//@Autowired
	//private UtilisateurRepository repository;

	@RequestMapping(value="/Inscription", method=RequestMethod.GET)
	public String showInscription(Utilisateur utilisateur) {
		System.out.println("Inscription");
		return "Inscription";
	}

	@RequestMapping(value="/Inscription", method=RequestMethod.POST)
	public String validerInscription(@Valid Utilisateur utilisateur , BindingResult bindingResult, 
			RedirectAttributes redirectAttributes) {
		redirectEntries(bindingResult, redirectAttributes);
		
		System.out.println("validerInscription");
		System.out.println("Le  nom est : "+bindingResult.getFieldValue("nom"));
		
		System.out.println("l'email vaut "+utilisateur.getEmail());
		
		
		utilisateur.setContacts(null);
		utilisateur.setAdresses(null);
		utilisateur.setRole("nouveau");

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
			return "redirect:/Inscription";
		}
		return "rest";
	}

	/**
	 * Permet de rediriger les entrées de l'utilisateur vers le formulaire d'origine
	 * @param bindingResult
	 * @param redirectAttributes
	 */
	public void redirectEntries(BindingResult bindingResult, RedirectAttributes redirectAttributes){
		System.out.println("Erreurs");
		String erreur;
		String flag;
		for(FieldError error : bindingResult.getFieldErrors()){
			erreur = "error_"+error.getObjectName()+"_"+error.getField();
			flag = "flag_"+error.getObjectName()+"_"+error.getField();
			redirectAttributes.addFlashAttribute(erreur, error.getDefaultMessage());
			redirectAttributes.addFlashAttribute(flag,"1");
			System.out.println(error.getObjectName()+"_"+error.getField()+" erreur de type : "+error.getDefaultMessage());
		}
		System.out.println("--------------------------------------------------------");
		redirectAttributes.addFlashAttribute("pseudo",bindingResult.getFieldValue("pseudo"));
		redirectAttributes.addFlashAttribute("email",bindingResult.getFieldValue("email"));
		redirectAttributes.addFlashAttribute("nom",bindingResult.getFieldValue("nom"));
		redirectAttributes.addFlashAttribute("prenom",bindingResult.getFieldValue("prenom"));
		redirectAttributes.addFlashAttribute("date_de_naissance",bindingResult.getFieldValue("date_de_naissance"));
		//redirectAttributes.addFlashAttribute("type",bindingResult.getFieldValue("type"));

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
