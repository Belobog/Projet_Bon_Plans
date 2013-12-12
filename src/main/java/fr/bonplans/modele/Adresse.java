package fr.bonplans.modele;

import fr.bonplans.modele.interfaces.IAdresse;

public class Adresse implements IAdresse{
	
	private String type;
	private String numero;
	private String type_de_voie;
	private String complement;
	private String code_postal;
	private String ville;
	
	
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
	
	
	

}
