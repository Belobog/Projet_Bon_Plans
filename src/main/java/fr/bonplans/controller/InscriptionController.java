package fr.bonplans.controller;





import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.validation.Valid;

import org.joda.time.DateTime;
import org.joda.time.LocalTime;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import fr.bonplans.beans.DataSourceConfig;
import fr.bonplans.controller.interfaces.IAccueilController;
import fr.bonplans.controller.interfaces.IInscriptionController;
import fr.bonplans.dao.interfaces.UtilisateurDAO;
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

		
		
		
		if (bindingResult.hasErrors()) {
			redirectEntries(bindingResult, redirectAttributes);
			return "redirect:/Inscription";
		}
		else{
			register(utilisateur);
			
			return "rest";
		}
		
	}

	public void register(Utilisateur utilisateur) {
		utilisateur.setContacts(null);
		utilisateur.setAdresses(null);
		utilisateur.setRole("nouveau");
		Date date__inscription = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("la date formaté vaut : "+format.format(date__inscription));
		utilisateur.setDate_inscription(format.format(date__inscription));
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource.xml");
		
        UtilisateurDAO utilisateurDAO = (UtilisateurDAO) context.getBean("UtilisateurDAO");
        
        utilisateurDAO.register(utilisateur);
		
	}

	/**
	 * Permet de rediriger les entrées de l'utilisateur vers le formulaire d'origine
	 * @param bindingResult
	 * @param redirectAttributes
	 */
	public void redirectEntries(BindingResult bindingResult, RedirectAttributes redirectAttributes){
		String erreur;
		String flag;
		for(FieldError error : bindingResult.getFieldErrors()){
			erreur = "error_"+error.getObjectName()+"_"+error.getField();
			flag = "flag_"+error.getObjectName()+"_"+error.getField();
			redirectAttributes.addFlashAttribute(erreur, error.getDefaultMessage());
			redirectAttributes.addFlashAttribute(flag,"1");
			
		}
		redirectAttributes.addFlashAttribute("pseudo",bindingResult.getFieldValue("pseudo"));
		redirectAttributes.addFlashAttribute("email",bindingResult.getFieldValue("email"));
		redirectAttributes.addFlashAttribute("nom",bindingResult.getFieldValue("nom"));
		redirectAttributes.addFlashAttribute("prenom",bindingResult.getFieldValue("prenom"));
		redirectAttributes.addFlashAttribute("date_de_naissance",bindingResult.getFieldValue("date_de_naissance"));

	}











}
