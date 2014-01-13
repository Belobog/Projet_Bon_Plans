package fr.bonplans.controller;





import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import fr.bonplans.controller.interfaces.IInscriptionController;
import fr.bonplans.dao.interfaces.UtilisateurDAO;

import fr.bonplans.modele.Utilisateur;



@Controller
public class InscriptionController implements IInscriptionController{

	//@Autowired
	//private UtilisateurRepository repository;
	
	
	/**
	 * Cette méthode est à l'écoute des requetes de types get lorsque l'utilisateur est redirigé vers
	 * le lien Inscription
	 * @param utilisateur
	 * @return
	 */
	@RequestMapping(value="/Inscription", method=RequestMethod.GET)
	public String showInscription(Utilisateur utilisateur) {
		System.out.println("showInscription");
		return "Inscription";
	}
	
	/**
	 * Cette méthode est à l'écoute des requetes de types post lorsque l'utilisateur est redirigé vers
	 * le lien Inscription
	 * @param utilisateur
	 * @param bindingResult
	 * @param redirectAttributes
	 * @return
	 */
	@RequestMapping(value="/Inscription", method=RequestMethod.POST)
	public String validerInscription(@Valid Utilisateur utilisateur , BindingResult bindingResult, 
			RedirectAttributes redirectAttributes) {

		
		
		System.out.println("validerInscription");
		if (bindingResult.hasErrors()) {
			redirectEntries(bindingResult, redirectAttributes);
			return "redirect:/Inscription";
		}
		else{
			if(register(utilisateur))return "OK";
			else return "KO";
			
		}
		
	}
	
	/**
	 * Cette méthode permet d'enregistrer en base un utilisateur qui vient de s'inscrire
	 * Attention si l'utilisateur identifié existe déjà en base la fonction renvoie false 
	 * et l'utilisateur n'est pas enregistré.
	 * @param utilisateur
	 * @return
	 */
	public boolean register(Utilisateur utilisateur) {
		System.out.println("register");
		utilisateur.setContacts(null);
		utilisateur.setAdresses(null);
		utilisateur.setActive("1");
		Date date__inscription = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		//System.out.println("la date formaté vaut : "+format.format(date__inscription));
		utilisateur.setDate_inscription(format.format(date__inscription));
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource.xml");
		
        UtilisateurDAO utilisateurDAO = (UtilisateurDAO) context.getBean("UtilisateurDAO");
        
        if(utilisateurDAO.isEmailAvailable(utilisateur.getEmail())){
        	utilisateurDAO.register(utilisateur);
        	return true;
        }
        else return false;
		
	}

	/**
	 * Permet de rediriger les entrées de l'utilisateur vers le formulaire d'origine
	 * @param bindingResult
	 * @param redirectAttributes
	 */
	public void redirectEntries(BindingResult bindingResult, RedirectAttributes redirectAttributes){
		System.out.println("redirectEntries");
		String erreur;
		String flag;
		for(FieldError error : bindingResult.getFieldErrors()){
			//System.out.println("champs qui fait chier "+error.getField());
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
