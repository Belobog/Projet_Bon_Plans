package hello;

import javax.validation.Valid;

import org.joda.time.LocalTime;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class WebController {

    @RequestMapping(value="/", method=RequestMethod.GET)
    public String showForm(Person person) {
    	LocalTime currentTime = new LocalTime();
	    System.out.println("The current local time is: " + currentTime);
        return "form";
    }
   
    
    @RequestMapping(value="/", method=RequestMethod.POST)
    public String enterAge(@Valid Person person, BindingResult bindingResult, 
            RedirectAttributes redirectAttributes) {
    	System.out.println("enterAge()"+person.getAge());
        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("error", bindingResult.getFieldError().getDefaultMessage());
            return "redirect:/";
        }
        return "results";
    }
    
    
    
    @RequestMapping(value="/Inscription", method=RequestMethod.GET)
    public String showForm2(Person person) {
    	LocalTime currentTime = new LocalTime();
	    System.out.println("The current local time is: " + currentTime);
        return "Inscription";
    }
   
    
    @RequestMapping(value="/Inscription", method=RequestMethod.POST)
    public String enterAge2(@Valid Person person, BindingResult bindingResult, 
            RedirectAttributes redirectAttributes) {
    	System.out.println("enterAge()2");
        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("error", bindingResult.getFieldError().getDefaultMessage());
            return "redirect:/Inscription";
        }
        return "results";
    }
    
    
    
    
    
    
    
    

}
