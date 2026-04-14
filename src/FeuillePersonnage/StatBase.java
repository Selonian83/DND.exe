package FeuillePersonnage;

public class StatBase {
	private int force;
	private int dexterite;
	private int constitution;
	private int intelligence;
	private int sagesse;
	private int charisme;
	
	public StatBase(){}
	
	StatBase(int force, int dexterite, int constitution, int intelligence, int sagesse, int charisme)
	{
		this.force = force;
		this.dexterite = dexterite;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.sagesse = sagesse;
		this.charisme = charisme;
	}
	
	public void applyBonus(String stat, int bonus)
	{
		switch(stat)
		{
		case "Force":
			this.force += bonus;
			break;
		case "Dexterite":
			this.dexterite += bonus;
			break;
		case "Constitution":
			this.constitution += bonus;
			break;
		case "Intelligence":
			this.intelligence += bonus;
			break;
		case "Sagesse":
			this.sagesse += bonus;
			break;
		case "Charisme":
			this.charisme += bonus;
			break;
		}
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getDexterite() {
		return dexterite;
	}

	public void setDexterite(int dexterite) {
		this.dexterite = dexterite;
	}

	public int getConstitution() {
		return constitution;
	}

	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getSagesse() {
		return sagesse;
	}

	public void setSagesse(int sagesse) {
		this.sagesse = sagesse;
	}

	public int getCharisme() {
		return charisme;
	}

	public void setCharisme(int charisme) {
		this.charisme = charisme;
	}
	
	
}
