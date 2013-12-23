package fr.bonplans.modele;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;

import fr.bonplans.modele.interfaces.IAdresse;

public class Adresse implements IAdresse{
	
	
	@Id
	private String id;
	@NotEmpty
	private String type;
	@NotEmpty
	private String numero;
	@NotEmpty
	private String type_de_voie;
	@NotEmpty
	private String nom_de_voie;
	private String complement;
	@NotEmpty
	private String code_postal;
	@NotEmpty
	private String ville;
	
	
	private Utilisateur utilisateur;
	
	
	
	
	
	public String getNom_de_voie() {
		return nom_de_voie;
	}

	public void setNom_de_voie(String nom_de_voie) {
		this.nom_de_voie = nom_de_voie;
	}

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
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getType_de_voie() {
		return type_de_voie;
	}
	public void setType_de_voie(String type_de_voie) {
		this.type_de_voie = type_de_voie;
	}
	public String getComplement() {
		return complement;
	}
	public void setComplement(String complement) {
		this.complement = complement;
	}
	public String getCode_postal() {
		return code_postal;
	}
	public void setCode_postal(String code_postal) {
		this.code_postal = code_postal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	
	
	
	

}
