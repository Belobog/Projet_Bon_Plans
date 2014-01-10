package fr.bonplans.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import fr.bonplans.controller.interfaces.IArticleController;


@Controller
public class ArticleController implements IArticleController{
	
	
	@RequestMapping(value="/Article")
	public ModelAndView showArticle(  
			RedirectAttributes redirectAttributes){
		System.out.println("showArticle()");
		ModelAndView model = new ModelAndView("Article");
		model.addObject("pseudo", "WelcomeController");
		
		return model;
		
	}
	
	
}
