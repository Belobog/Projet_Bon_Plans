package fr.bonplans.controller;

import javax.validation.Valid;

import org.joda.time.LocalTime;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import fr.bonplans.controller.interfaces.IAccueilController;
import fr.bonplans.modele.Person;


@Controller
public class AccueilController implements IAccueilController{

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String showAccueil() {
    	LocalTime currentTime = new LocalTime();
	    System.out.println("The current local time is: " + currentTime);
        return "Accueil";
    }
       


}