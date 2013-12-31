package fr.bonplans.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.bonplans.controller.interfaces.IConnexionController;

@Controller
public class ConnexionController implements IConnexionController {
	
	
	@RequestMapping(value="/Connexion",method=RequestMethod.GET)
	public String showConnexion(){
		System.out.println("showConnexion()");
		return "Connexion";
	}
	
	
	@RequestMapping(value="/Connexion",method=RequestMethod.POST)
	public String confirmConnexion(){
		System.out.println("confirmConnexion()");
		return "Connexion";
	}

}
