package fr.bonplans.modele;

import java.util.ArrayList;

import fr.bonplans.modele.interfaces.IArticle;

public class Article implements IArticle{
	
	
	private String id;
	private String titre;
	private String sous_titre;
	private String url_image;
	private String date_de_ecriture;
	private String date_de_modification;
	private ArrayList<Categorie> categories;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getSous_titre() {
		return sous_titre;
	}
	public void setSous_titre(String sous_titre) {
		this.sous_titre = sous_titre;
	}
	public String getUrl_image() {
		return url_image;
	}
	public void setUrl_image(String url_image) {
		this.url_image = url_image;
	}
	public String getDate_de_ecriture() {
		return date_de_ecriture;
	}
	public void setDate_de_ecriture(String date_de_ecriture) {
		this.date_de_ecriture = date_de_ecriture;
	}
	public String getDate_de_modification() {
		return date_de_modification;
	}
	public void setDate_de_modification(String date_de_modification) {
		this.date_de_modification = date_de_modification;
	}
	public ArrayList<Categorie> getCategories() {
		return categories;
	}
	public void setCategories(ArrayList<Categorie> categories) {
		this.categories = categories;
	}
	
	
	
	
	

}
