import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String petName = null;
		String petType = null;
		String petInfo = null;

		VirtualPet pet = new VirtualPet(petName, 50, 50, 50, 50);
		PetArt myPet = new PetArt(petType);

		// Name your pet
		System.out.println("What would you like to name your pet?");
		String actionOpt = input.nextLine();
		petName = actionOpt;

		// Choose what kind of pet your want
		System.out.println("What kind of pet is " + petName + "?\nType:\nDog\nCat\nRobot");
		petInfo = input.nextLine().toLowerCase();
		petType = petInfo;

		// Game Loop
		do {

			// Tick

			pet.getTick();

			// Pet Actions
			if (pet.getHunger() < 0) {
				System.out.println("Dude got hungry and ate the couch!\n");
				pet.getFood();
			}
			if (pet.getHunger() > 150) {
				System.out.println("Dude ate too much and puked all over the house!");
				pet.getPuke();
			}
			if (pet.getBoredom() < 0) {
				System.out.println("Dude died of boredom!\n YOU KILLED YOUR PET!!!");
				if (petType.equals("dog")) {
					System.out.println(myPet.getDeadDog());
				}
				if (petType.equals("cat")) {
					System.out.println(myPet.getDeadCat());
				}
				if (petType.equals("robot")) {
					System.out.println(myPet.getDeadRobot());
				}
				System.exit(0);
			}
			if (pet.getBoredom() > 200) {
				System.out.println("Dude got too excited and chewed up all of your pillows!");
				pet.getCrazy();
			}

			if (pet.getNeedToPotty() > 150) {
				System.out.println("Dude pooped all over the house!");
				pet.getPooper();
			}
			if (pet.getTiredness() < 0) {
				System.out.println("Dude went into a coma!\n YOU KILLED YOUR PET!!!");
				if (petType.equals("dog")) {
					System.out.println(myPet.getDeadDog());
				}
				if (petType.equals("cat")) {
					System.out.println(myPet.getDeadCat());
				}
				if (petType.equals("robot")) {
					System.out.println(myPet.getDeadRobot());
				}
				System.exit(0);
			}

			// Create a picture of your pet
			if (petType.equals("dog")) {
				System.out.println("\n\n  " + petName + "\n" + myPet.getDogFace());
			}
			if (petType.equals("cat")) {
				System.out.println("\n\n  " + petName + "\n" + myPet.getCatFace());
			}
			if (petType.equals("robot")) {
				System.out.println("\n\n  " + petName + "\n" + myPet.getRobotFace());
			}

			// Menu options
			System.out.println("This is how " + petName + " is feeling:\nHunger: " + pet.getHunger() + "\nBoredom: "
					+ pet.getBoredom() + "\nNeed To Potty: " + pet.getNeedToPotty() + "\nSleepiness: "
					+ pet.getTiredness());
			System.out.println("\nWhat would you like to do with " + petName + "?\n1: Feed " + petName
					+ "\n2: Play with " + petName + "\n3: Take " + petName + " out to potty" + "\n4: Give " + petName
					+ " a nap" + "\n5: Leave");
			actionOpt = input.next();

			// Choice actions
			if (actionOpt.equals("1")) {
				pet.feeding();
				System.out.println("You gave " + petName + " " + pet.rngNum5 + " food.");
			}

			if (actionOpt.equals("2")) {
				pet.playing();
				System.out.println("You played with " + petName + ".");
			}

			if (actionOpt.equals("3")) {
				pet.pooping();
				System.out.println("You took " + petName + " out to potty.");
			}

			if (actionOpt.equals("4")) {
				pet.sleeping();
				System.out.println("You gave " + petName + " a nap.");
			}

			if (actionOpt.equals("5")) {
				System.out.println("Thanks for visiting!");
				System.exit(0);
			}

		} while (!actionOpt.equals("5"));
	}
}
