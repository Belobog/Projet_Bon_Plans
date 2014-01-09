package fr.bonplans.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.RequestContextHolder;

import fr.bonplans.controller.interfaces.IConnexionController;

@Controller
public class ConnexionController implements IConnexionController {
	
	
	
	@RequestMapping(value="/Connexion",method=RequestMethod.GET)
	public String showConnexion(HttpServletRequest request,String email,String password){
		System.out.println("showConnexion");
		return "Connexion";
	}
	
	
	@RequestMapping(value="/ConnexionOk",method=RequestMethod.GET)
	public String confirmConnexion(HttpServletRequest request,String email,String password){
		System.out.println("confirmConnexion");
		return "ConnexionOk";
	}
	
	
	@RequestMapping(value="/Deconnexion")
	public String Deconnexion(HttpServletRequest request,String email,String password){
		System.out.println("Deconnexion");
		return "Connexion";
	}

}
