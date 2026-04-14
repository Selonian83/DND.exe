package FeuillePersonnage;

public class idPersonnage {
	private String nomPersonnage;
	private String race;
	private String classe;
	private String historique;
	private int XP;
	private int niveau;
	private String nomJoueur;
	
	public idPersonnage(){}
	
	idPersonnage(String nomPersonnage, String race, String classe, String historique, int niveau, String nomJoueur)
	{
		this.nomPersonnage = nomPersonnage;
		this.race = race;
		this.classe = classe;
		this.historique = historique;
		this.niveau = niveau;
		this.nomJoueur = nomJoueur;
	}

	public String getNomPersonnage() {
		return nomPersonnage;
	}

	public void setNomPersonnage(String nomPersonnage) {
		this.nomPersonnage = nomPersonnage;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getHistorique() {
		return historique;
	}

	public void setHistorique(String historique) {
		this.historique = historique;
	}

	public int getXP() {
		return XP;
	}

	public void setXP(int xP) {
		XP = xP;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public String getNomJoueur() {
		return nomJoueur;
	}

	public void setNomJoueur(String nomJoueur) {
		this.nomJoueur = nomJoueur;
	}
	
	
}
