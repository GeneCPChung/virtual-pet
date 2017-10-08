
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
		return "\n  /^ ^\\\n / 0 0 \\\n V\\ Y /V\n  /'-'\\\n";
	}

	public String getCatFace() {
		return "\n .       . \n \\`-\"'\"-'/ \n  } 6 6 { \n =.  Y  ,= \n   /^^^\\  \n";
	}

	public String getRobotFace() {
		return "\n     _______\n   _/       \\_\n  / |       | \\\n /  |__   __|  \\\n|__/((o| |o))\\__| \n|\\     |_|     /| \n| \\           / | \n \\| / \\___/ \\ |/ \n  \\ |   _   | / \n   \\_________/ \n ";
	}

}
