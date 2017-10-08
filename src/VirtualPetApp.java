import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String petName = null;
		String petType = null;
		String petInfo = null;
		VirtualPet pet = new VirtualPet(petName, 49, 49, 49, 49);
		PetArt myPet = new PetArt(petType);
		System.out.println("Welcome! Please give your pet a name: ");
		String actionOpt = input.nextLine();
		petName = actionOpt;
		System.out.println("What kind of pet is " + petName + "?\nDog\nCat\nRobot");
		petInfo = input.nextLine();
		petType = petInfo;
		//Game Loop
		do {
			pet.tick(0);
			if (petType.equals("dog")) {
				System.out.println(myPet.getDogHappy());
			}
			if (petType.equals("cat")) {
				System.out.println(myPet.getCatHappy());
			}
			if (petType.endsWith("robot")) {
				System.out.println(myPet.getRobotHappy());
			}
			System.out.println("This is how " + petName + " is feeling:\nHunger: " + pet.getHunger() + "\nBoredom: "
					+ pet.getBoredom() + "\nNeed To Potty: " + pet.getNeedToPotty() + "\nSleepiness: "
					+ pet.getTiredness());
			System.out.println("\nWhat would you like to do?\n1: Feed\n2: Play\n3: Potty\n4: Nap\n5: Leave\n");
			actionOpt = input.next();
			if (actionOpt.contentEquals("1")) {
				int feedingPet = 25;
				pet.feeding(feedingPet);
				System.out.println(petName + "'s hunger is now: " + pet.getHunger() + " and Need To Potty is "
						+ pet.getNeedToPotty());
			}
			
			if (actionOpt.contentEquals("2")) {
				int play = 25;
				pet.playing(play);
				System.out.println(petName + "'s new boredom is now " + pet.getBoredom() + " and their hunger is "
						+ pet.getHunger() + "\n");
			}
			int poop = 25;
			if (actionOpt.contentEquals("3")) {
				pet.pooping(poop);
				System.out.println(petName + "'s feeling much better. Her Potty is now " + pet.getNeedToPotty()
						+ " and their Hunger is now " + pet.getHunger() + "\n");
			}
			int sleep = 25;
			if (actionOpt.contentEquals("4")) {
				pet.sleeping(sleep);
			}

			if (actionOpt.contentEquals("5")) {
				System.out.println("Thanks for visiting!");
				System.exit(0);
			}

		} while (!actionOpt.contentEquals("5"));
	}
}
