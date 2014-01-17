package fr.bonplans.controller;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import fr.bonplans.controller.interfaces.IArctualiteController;
import fr.bonplans.dao.interfaces.CategorieDAO;
import fr.bonplans.dao.interfaces.UtilisateurDAO;
import fr.bonplans.modele.Categorie;


@Controller
public class ActualiteController implements IArctualiteController{


	@RequestMapping(value="/Actualite")
	public ModelAndView showActualite(  
			RedirectAttributes redirectAttributes){
		System.out.println("showActualite()");
		ModelAndView model = new ModelAndView("Actualite");

		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Datasource.xml");
		CategorieDAO categorieDAO = (CategorieDAO) context.getBean("CategorieDAO");
		ArrayList<Categorie> categories = categorieDAO.selectAll();
		model.addObject("categories",categories);
		

		return model;

	}


}
