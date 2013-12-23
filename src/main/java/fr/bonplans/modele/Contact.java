package fr.bonplans.modele;

import org.springframework.data.annotation.Id;

import fr.bonplans.modele.interfaces.IContact;

public class Contact implements IContact {
	
	@Id
	private String id;
	private String type_;
	private String mail;
	private String numero;
	private Utilisateur utilisateur;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType_() {
		return type_;
	}
	public void setType_(String type_) {
		this.type_ = type_;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	
	

}
