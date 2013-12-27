package fr.bonplans.dao.interfaces;

import fr.bonplans.modele.Utilisateur;



public interface UtilisateurDAO {
	
	public void insert(Utilisateur utilisateur);

	void register(Utilisateur utilisateur);
	public boolean isEmailAvailable(String email);

}
