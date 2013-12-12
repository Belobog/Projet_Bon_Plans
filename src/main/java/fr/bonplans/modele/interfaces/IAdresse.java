package fr.bonplans.modele.interfaces;

public interface IAdresse {
	
	public String getType();
	public void setType(String type);
	public String getNumero() ;
	public void setNumero(String numero) ;
	public String getType_de_voie();
	public void setType_de_voie(String type_de_voie) ;
	public String getComplement() ;
	public void setComplement(String complement);
	public String getCode_postal();
	public void setCode_postal(String code_postal);
	public String getVille();
	public void setVille(String ville);
	
}
