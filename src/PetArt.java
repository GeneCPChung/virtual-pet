
public class PetArt {
	private String petType;
	private String dog;
	private String cat;
	private String robot;

	public PetArt(String petType) {
		this.petType = dog;
		this.petType = cat;
		this.petType = robot;
	}

	public boolean getPetChosen(String petChosen) {
		return petType.equals(petChosen);
	}

	public String getDogFace() {
		return "  /^ ^\\\n / 0 0 \\\n V\\ Y /V\n  /'-'\\\n";
	}

	public String getDeadDog() {
		return "  /^ ^\\\n / X X \\\n V\\ Y /V\n  / U \\\n";
	}

	public String getCatFace() {
		return " .       . \n \\`-\"'\"-'/ \n  } 6 6 { \n =.  Y  ,= \n   /^^^\\  \n";
	}

	public String getDeadCat() {
		return " .       . \n \\`-\"'\"-'/ \n  } X X { \n =.  Y  ,= \n   / U \\  \n";
	}

	public String getRobotFace() {
		return "     _______\n   _/       \\_\n  / |       | \\\n /  |__   __|  \\\n|__/((o| |o))\\__| \n|\\     |_|     /| \n| \\           / | \n \\| / \\___/ \\ |/ \n  \\ |   _   | / \n   \\_________/ \n ";
	}

	public String getDeadRobot() {
		return "     _______\n   _/       \\_\n  / |       | \\\n /  |__   __|  \\\n|__/(X | |X))\\__| \n|\\     |_|     /| \n| \\    ____   / | \n \\|\\  /    \\ |/ \n  \\ |   _    |/ \n   \\_________/ \n ";
	}

}
