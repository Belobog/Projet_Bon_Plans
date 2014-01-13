package fr.bonplans.modele;

import java.util.ArrayList;

import fr.bonplans.modele.interfaces.ICategorie;

public class Categorie implements ICategorie{
	
	private String id;
	private String nom;
	private ArrayList<Article>articles;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String toString(){
		return nom;
	}
	public ArrayList<Article> getArticles() {
		return articles;
	}
	public void setArticles(ArrayList<Article> articles) {
		this.articles = articles;
	}
	
	
	
	
	

}
