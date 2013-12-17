package fr.bonplans.modele;

import java.util.ArrayList;









import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import fr.bonplans.modele.interfaces.IAdresse;
import fr.bonplans.modele.interfaces.IContact;
import fr.bonplans.modele.interfaces.IUtilisateur;

public class Utilisateur /*implements IUtilisateur*/{

	@Id
    private String id;
	
	@NotEmpty
	private String pseudo;
	private String role;
	
	@NotEmpty
	private String password;
	
	@NotEmpty
	private String nom;
	
	@NotEmpty
	private String prenom;

	@NotEmpty
	private String date_de_naissance;
	private String date_inscription;
	private ArrayList<IAdresse> adresses;
	private ArrayList<IContact> contacts;
	
	
	
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
