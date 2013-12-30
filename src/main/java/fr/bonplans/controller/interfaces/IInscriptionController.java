package fr.bonplans.controller.interfaces;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import fr.bonplans.modele.Utilisateur;

public interface IInscriptionController {
	
	@RequestMapping(value="/Inscription", method=RequestMethod.GET)
	public String showInscription(Utilisateur utilisateur);
	
	@RequestMapping(value="/Inscription", method=RequestMethod.POST)
	public String validerInscription(@Valid Utilisateur utilisateur , BindingResult bindingResult, RedirectAttributes redirectAttributes);
	public boolean register(Utilisateur utilisateur);
	public void redirectEntries(BindingResult bindingResult, RedirectAttributes redirectAttributes);

}
