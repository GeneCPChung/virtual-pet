import java.util.Random;

public class VirtualPet {
	Random rand = new Random();
	int tickUpdt = rand.nextInt(5) + 1;
	int rngNum5 = rand.nextInt(100) + 1;
	int rngNum1 = rand.nextInt(5) + 1;
	int rngNum2 = rand.nextInt(5) + 1;
	int rngNum3 = rand.nextInt(5) + 1;
	int rngNum4 = rand.nextInt(5) + 1;
	

	// Instance Data
	private String petName;
	private int hunger;
	private int boredom;
	private int needToPotty;
	private int tiredness;

	// Constructor
	public VirtualPet(String petName, int hunger, int boredom, int needToPotty, int tiredness) {

		this.petName = petName;
		this.hunger = hunger;
		this.boredom = boredom;
		this.needToPotty = needToPotty;
		this.tiredness = tiredness;
	}

	// Accessors
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

	public int getTick(int tickStats) {


		if (rngNum5 < 25) {
			hunger *= rngNum1;
			boredom *= rngNum2;
			needToPotty *= rngNum3;
			tiredness *= rngNum4;
		}
		if (rngNum5 >= 21 && rngNum5 <= 49) {
			hunger += rngNum1;
			boredom -= rngNum2;
			needToPotty += rngNum3;
			tiredness -= rngNum4;
		}
		if (rngNum5 >= 50 && rngNum5 <= 74) {
			hunger -= rngNum1;
			boredom += rngNum2;
			needToPotty -= rngNum3;
			tiredness += rngNum4;
		}
		if (rngNum5 >= 75 && rngNum5 <= 100) {
			hunger /= rngNum1;
			boredom /= rngNum2;
			needToPotty /= rngNum3;
			tiredness /= rngNum4;
		}
		return tickStats;
		
		
	}

	// Name method
	public boolean enteredName(String enteredName) {
		return petName.equals(enteredName);
	}

	// Actions
	void feeding() {
		int eating = rngNum5;
		hunger -= eating;
		needToPotty += eating;

	}

	void playing() {
		int play = rngNum5;
		boredom -= play;
		tiredness += play;

	}

	void pooping() {
		int pooping = rngNum5;
		needToPotty -= pooping;
		boredom += pooping;
	}

	void sleeping() {
		int sleeping = rngNum5;
		tiredness -= sleeping;
		hunger += sleeping;
	}

	// Pet Logic
	
	  public void selfFeed(String[] args) { 
		  if (this.hunger < 100) { 
			  hunger /= rngNum5;
	  System.out.println(petName + "ate too much, so they threw up on the couch!");
	  }
	  
	  
	  
  }
}
