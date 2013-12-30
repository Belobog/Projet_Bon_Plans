package fr.bonplans.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import fr.bonplans.controller.interfaces.IAccueilController;



@Controller
public class AccueilController implements IAccueilController{

	/**Cette méthode gère toutes les requête vers le lien Accueil  et 
	 * le lien racine du site et renvoie à la page d'accueil.
	 * 
	 */
	@RequestMapping(value={"/","/Accueil"})
	public String showAccueil() {
		System.out.println("showAccueil");
		//LocalTime currentTime = new LocalTime();
		//System.out.println("The current local time is: " + currentTime);
		return "Accueil";
	}






}
