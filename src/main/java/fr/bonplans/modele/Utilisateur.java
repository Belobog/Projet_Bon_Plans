package fr.bonplans.modele;

import java.util.ArrayList;

import fr.bonplans.modele.interfaces.IAdresse;
import fr.bonplans.modele.interfaces.IContact;
import fr.bonplans.modele.interfaces.IUtilisateur;

public class Utilisateur implements IUtilisateur{

	
	private String pseudo;
	private String role;
	private String password;
	private String nom;
	private String prenom;
	private String date_de_naissance;
	private String date_inscription;
	private ArrayList<IAdresse> adresses;
	private ArrayList<IContact> contacts;
	public String getPseudo() {
		return pseudo;
	}
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}
	public String getPassword() {
		return password;
	}
	
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
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
