package fr.bonplans.modele.interfaces;

import fr.bonplans.modele.Utilisateur;

public interface IContact {
	
	public String getId();
	public void setId(String id);
	public String getType_();
	public void setType_(String type_) ;
	public String getMail();
	public void setMail(String mail);
	public String getNumero();
	public void setNumero(String numero);
	public Utilisateur getUtilisateur();
	public void setUtilisateur(Utilisateur utilisateur);

}
