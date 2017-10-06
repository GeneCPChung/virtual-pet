
public class VirtualPet {

	// Instance Data
	private String requiredAction;
	private String petStatus;
	private int hunger;
	private int eating;
	private int playing;
	private int boredom;
	private int needToPotty;
	
	
	// Constructor
	public VirtualPet(String requiredAction, int hunger, int boredom) {
		this.requiredAction = requiredAction;
		this.hunger = hunger;
		this.boredom = boredom;
	}

	// Accessor (getter) method

	public int getHunger() {
		return hunger;
	}
	public int getBoredom() {
		return boredom;
	}

	// Setter (offers change)
		

	// Method of behavior

	// tick
	public void tick(int updatePetStatus) {
		// update everything
		
	}
	public boolean allowAction(String enteredAction) {
		return requiredAction.equals(enteredAction);
	}
	
	void feeding(int eating) {
		hunger -= eating;
	}
	void playing(int playing) {
		boredom -= playing;
	}


	
	

	
	
	
	
}
