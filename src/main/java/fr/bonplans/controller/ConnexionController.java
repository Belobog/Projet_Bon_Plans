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
	public String showConnexion(HttpServletRequest request,String email,String password){
		compteur ++;
		/*System.out.println("email vaut : "+email);
		System.out.println("password vaut : "+password);
		System.out.println("adresse Ip : "+request.getRemoteAddr());
		System.out.println("showConnexion() numéro : "+compteur);*/
		return "Connexion";
	}
	
	
	@RequestMapping(value="/ConnexionOk",method=RequestMethod.GET)
	public String confirmConnexion(HttpServletRequest request,String email,String password){
		
		System.out.println("email vaut : "+email);
		System.out.println("password vaut : "+password);
		System.out.println("confirmConnexion()");
		return "ConnexionOk";
	}

}
