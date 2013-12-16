package fr.bonplans.modele;

import org.springframework.data.annotation.Id;

import fr.bonplans.modele.interfaces.IContact;

public class Contact implements IContact {
	
	@Id
	private String id;
	private String type;
	private String mail;
	private String numero;
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	
	

}
