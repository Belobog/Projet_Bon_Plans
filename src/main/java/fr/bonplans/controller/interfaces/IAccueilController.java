package fr.bonplans.controller.interfaces;

import org.springframework.web.bind.annotation.RequestMapping;

public interface IAccueilController {

	@RequestMapping(value={"/","/Accueil"})
	public String showAccueil();

}
