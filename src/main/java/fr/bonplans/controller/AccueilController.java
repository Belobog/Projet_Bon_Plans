package fr.bonplans.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.bonplans.controller.interfaces.IAccueilController;




@Controller
public class AccueilController implements IAccueilController {
        
        @RequestMapping(value={"/","Accueil"},method=RequestMethod.GET)
        public String afficherAccueil(){
                System.out.println("afficherAccueil()");
                return "Accueil";
        }
        

}