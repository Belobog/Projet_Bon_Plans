package fr.bonplans.controller;

import javax.validation.Valid;

import org.joda.time.LocalTime;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import fr.bonplans.controller.interfaces.IAccueilController;
import fr.bonplans.controller.interfaces.IInscriptionController;
import fr.bonplans.modele.Person;


@Controller
public class InscriptionController implements IInscriptionController{

	@RequestMapping(value="/Inscription", method=RequestMethod.GET)
    public String showInscription(Person person) {
        return "Inscription";
    }
   
    
    @RequestMapping(value="/Inscription", method=RequestMethod.POST)
    public String validerInscription(@Valid Person person, BindingResult bindingResult, 
            RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("error", bindingResult.getFieldError().getDefaultMessage());
            return "redirect:/Inscription";
        }
        return "results";
    }
    
    
    
    
    
    
    
    

}
