package Main;

import FeuillePersonnage.FeuillePersonnage;
import FeuillePersonnage.StatBase;
import FeuillePersonnage.idPersonnage;

public class Main {

	public static void main(String[] args) {
		
		
		FeuillePersonnage fp = new FeuillePersonnage();
		idPersonnage id = new idPersonnage();
		StatBase statBase = new StatBase();
		
		String nomPersonnage = "Ara";
		String race = "Elfe";
		String classe = "Barbare";
		int niveau = 2;
		String historique = "Enfant des rues";
		String nomJoueur = "Selo";
		
		int force;
		int dexterite;
		int constitution;
		int intelligence;
		int sagesse;
		int charisme;
		
		id.setNomPersonnage(nomPersonnage);
		id.setRace(race);
		id.setClasse(classe);
		id.setNiveau(niveau);
		id.setHistorique(historique);
		id.setNomJoueur(nomJoueur);
		
		statBase.setForce(10);
		statBase.setDexterite(10);
		statBase.setConstitution(10);
		statBase.setIntelligence(10);
		statBase.setSagesse(10);
		statBase.setCharisme(10);
		
		fp.setIdPersonnage(id);
		fp.setStatBase(statBase);
	}

}
