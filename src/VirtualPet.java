
public class VirtualPet {

	// Instance Data
	private String requiredAction;
	private String petStatus;
	private int hunger;
	private int boredom;
	private int needToPotty;
	private int tiredness;
	
	// Constructor
	public VirtualPet(String requiredAction, int hunger, int boredom, int needToPotty, int tiredness) {
		
		this.requiredAction = requiredAction;
		this.hunger = hunger;
		this.boredom = boredom;
		this.needToPotty = needToPotty;
		this.tiredness = tiredness;
	}

	// Accessor (getter) method

	public int getHunger() {
		return hunger;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getNeedToPotty() {
		return needToPotty;
	}
	public int getTiredness() {
		return tiredness;
	}

	// Setter (offers change)

	// Method of behavior

	// tick
	public void tick(int updatePetStatus) {
		// update everything
		hunger += 1;
		boredom += 1;
		needToPotty += 1;
		tiredness += 1;
		}

	public boolean allowAction(String enteredAction) {
		return requiredAction.equals(enteredAction);
	}

	void feeding(int eating) {
		hunger -= eating;
		needToPotty += eating;
		boredom += eating;
		tiredness += eating;
	}

	void playing(int playing) {
		boredom -= playing;
		hunger += playing;
		tiredness += playing;
	}

	void pooping(int pooping) {
		needToPotty -= pooping;
		hunger += pooping;
		boredom -= pooping;
	}
	
	void sleeping(int sleeping) {
		needToPotty += sleeping;
		hunger += sleeping;
		boredom -= sleeping;
		tiredness -= sleeping;
	}

}
