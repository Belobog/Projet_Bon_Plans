package fr.bonplans.modele;

import java.util.ArrayList;



import javax.validation.constraints.Pattern;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

import org.hibernate.validator.constraints.NotEmpty;

import org.springframework.data.annotation.Id;


import fr.bonplans.modele.interfaces.IAdresse;
import fr.bonplans.modele.interfaces.IContact;


public class Utilisateur /*implements IUtilisateur*/{

	@Id
	private String id;

	@NotEmpty(message = "Ce champ est indispensable pour vous identifier sur le site")
	@Length(min = 5, max = 10, message = "Le pseudo doit contenir entre 5 et 10 caractères")
	@Pattern(regexp = "[a-zA-Z0-9_.-]*",message = "Pseudo mal formé")
	private String pseudo;

	@NotEmpty(message = "Vous devez entrer une adresse email valide")
	@Email(message = "Vous devez entrer une adresse email valide")
	private String email;

	

	@NotEmpty
	@Length(min = 8, max = 20, message = "Le mot de passe doit contenir au moins 8 caractères")
	//@Pattern(regexp = "/(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,20}/," message = "Password must contain one digit."),
	private String password;

	@NotEmpty
	@Length(min=1, max= 20,message = "20 caractères maximum pour le nom")
	@Pattern(regexp = "[a-zA-Z-]*",message = "Caractère interdit")
	private String nom;

	@NotEmpty
	@Length(min=1, max= 20,message = "20 caractères maximum pour le prenom")
	@Pattern(regexp = "[a-zA-Z-]*",message = "Caractère interdit")
	private String prenom;

	@NotEmpty
	@Pattern(regexp = "[0-9]{2}/[0-9]{2}/[0-9]{4}$",message = "Format date incorrect")
	private String date_de_naissance;
	private String date_inscription;
	
	private String active;


	private ArrayList<IAdresse> adresses = new ArrayList<IAdresse>();
	private ArrayList<IContact> contacts;

	
	
	

	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPassword() {
		return password;
	}


	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getDate_de_naissance() {
		return date_de_naissance;
	}
	public void setDate_de_naissance(String date_de_naissance) {
		this.date_de_naissance = date_de_naissance;
	}
	public String getDate_inscription() {
		return date_inscription;
	}
	public void setDate_inscription(String date_inscription) {
		this.date_inscription = date_inscription;
	}
	public ArrayList<IAdresse> getAdresses() {
		return adresses;
	}
	public void setAdresses(ArrayList<IAdresse> adresses) {
		this.adresses = adresses;
	}
	public ArrayList<IContact> getContacts() {
		return contacts;
	}
	public void setContacts(ArrayList<IContact> contacts) {
		this.contacts = contacts;
	}




}
