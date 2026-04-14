package FeuillePersonnage;

public class Modificateurs {
	private int modifForce;
	private int modifDexterite;
	private int modifConstitution;
	private int modifIntelligence;
	private int modifSagesse;
	private int modifCharisme;
	
	Modificateurs(){}
	
	Modificateurs(int force, int dexterite, int constitution, int intelligence, int sagesse, int charisme)
	{
		this.modifForce = (int) Math.floor((force-10)/2);
		this.modifDexterite = (int) Math.floor((dexterite-10)/2);
		this.modifConstitution = (int) Math.floor((constitution-10)/2);
		this.modifIntelligence = (int) Math.floor((intelligence-10)/2);
		this.modifSagesse = (int) Math.floor((sagesse-10)/2);
		this.modifCharisme = (int) Math.floor((charisme-10)/2);
	}

	public int getModifForce() {
		return modifForce;
	}

	public void setModifForce(int modifForce) {
		this.modifForce = modifForce;
	}

	public int getModifDexterite() {
		return modifDexterite;
	}

	public void setModifDexterite(int modifDexterite) {
		this.modifDexterite = modifDexterite;
	}

	public int getModifConstitution() {
		return modifConstitution;
	}

	public void setModifConstitution(int modifConstitution) {
		this.modifConstitution = modifConstitution;
	}

	public int getModifIntelligence() {
		return modifIntelligence;
	}

	public void setModifIntelligence(int modifIntelligence) {
		this.modifIntelligence = modifIntelligence;
	}

	public int getModifSagesse() {
		return modifSagesse;
	}

	public void setModifSagesse(int modifSagesse) {
		this.modifSagesse = modifSagesse;
	}

	public int getModifCharisme() {
		return modifCharisme;
	}

	public void setModifCharisme(int modifCharisme) {
		this.modifCharisme = modifCharisme;
	}
	
	
}
