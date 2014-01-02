package fr.bonplans.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;

import fr.bonplans.controller.interfaces.IConnexionController;

@Controller
public class ConnexionController implements IConnexionController {
	
	private static int compteur = 0;
	
	@RequestMapping(value="/Connexion",method=RequestMethod.GET)
	public String showConnexion(HttpServletRequest request){
		compteur ++;
		System.out.println("adresse Ip : "+request.getRemoteAddr());
		System.out.println("showConnexion() numéro : "+compteur);
		return "Connexion";
	}
	
	
	@RequestMapping(value="/Connexion",method=RequestMethod.POST)
	public String confirmConnexion(){
		System.out.println("confirmConnexion()");
		return "Connexion";
	}

}
