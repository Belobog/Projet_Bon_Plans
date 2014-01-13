package fr.bonplans.dao.interfaces;

import java.util.ArrayList;

import fr.bonplans.modele.Categorie;

public interface CategorieDAO {
	
	public void insert(Categorie categorie);
	public ArrayList<Categorie> selectAll();

}
