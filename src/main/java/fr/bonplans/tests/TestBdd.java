package fr.bonplans.tests;

import fr.bonplans.modele.Article;
import fr.bonplans.modele.Categorie;

public class TestBdd {

	public static void main(String[] args) {
		Article article = new Article();
		Categorie categorie = new Categorie();
		
		categorie.setId("1");categorie.setNom("Informatique");
		article.setDate_de_ecriture("11/05/1988");
		article.setDate_de_modification("12/08/2000");
		article.setId("1");
		article.setSous_titre("Sous titre");
		article.setTitre("titre");
		article.setUrl_image("url");

	}

}
