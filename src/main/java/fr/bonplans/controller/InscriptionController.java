package fr.bonplans.controller;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



import fr.bonplans.controller.interfaces.IInscriptionController;
import fr.bonplans.modele.Utilisateur;
import fr.bonplans.modele.interfaces.IUtilisateur;

@Controller
public class InscriptionController implements IInscriptionController {
	
	@RequestMapping(value={"/Inscription"},method=RequestMethod.GET)
	public String afficherInscription() {
		System.out.println("afficherInscription()");
		//LocalTime currentTime = new LocalTime();
	    //System.out.println("The current local time is: " + currentTime);

		return "Inscription";
	}

	/*
	
	@RequestMapping(value={"/Inscription"},method=RequestMethod.POST)
	public String enterAge(@Valid Utilisateur utilisateur, BindingResult bindingResult, 
			RedirectAttributes redirectAttributes) {
		System.out.println("On rentre dans le enterAge");
		if (bindingResult.hasErrors()) {
			System.out.println( bindingResult.getFieldError().getDefaultMessage());
			System.out.println( bindingResult.getFieldError().getField());
			redirectAttributes.addFlashAttribute("error", bindingResult.getFieldError().getDefaultMessage());
			return "redirect:/test";
		}
		return "results";
	}
	*/

}
