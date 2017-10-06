
public class VirtualPet {

	// Instance Data
	private String requiredAction;
	private String petStatus;
	private int hunger;
	private int boredom;
	private int needToPotty;
	
	// Constructor
	public VirtualPet(String requiredAction, int hunger, int boredom, int needToPotty) {
		
		this.requiredAction = requiredAction;
		this.hunger = hunger;
		this.boredom = boredom;
		this.needToPotty = needToPotty;
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

	// Setter (offers change)

	// Method of behavior

	// tick
	public void tick(int updatePetStatus) {
		// update everything
		hunger += 1;
		boredom += 1;
		needToPotty += 1;	

	}

	public boolean allowAction(String enteredAction) {
		return requiredAction.equals(enteredAction);
	}

	void feeding(int eating) {
		hunger -= eating;
		needToPotty += eating;
		boredom += eating;
	}

	void playing(int playing) {
		boredom -= playing;
		hunger += playing;
	}

	void pooping(int pooping) {
		needToPotty -= pooping;
		hunger += pooping;
		boredom -= pooping;
	}

}
