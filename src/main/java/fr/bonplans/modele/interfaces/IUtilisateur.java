package fr.bonplans.modele.interfaces;

import java.util.ArrayList;

public interface IUtilisateur {
	
	public String getPseudo() ;
	public void setPseudo(String pseudo);
	public String getRole() ;
	public void setRole(String role);
	public String getPassword();
	public void setPassword(String password);
	public String getNom();
	public void setNom(String nom);
	public String getPrenom();
	public void setPrenom(String prenom);
	public String getDate_de_naissance();
	public void setDate_de_naissance(String date_de_naissance);
	public String getDate_inscription();
	public void setDate_inscription(String date_inscription);
	public ArrayList<IAdresse> getAdresses();
	public void setAdresses(ArrayList<IAdresse> adresses);
	public ArrayList<IContact> getContacts();
	public void setContacts(ArrayList<IContact> contacts);

}
