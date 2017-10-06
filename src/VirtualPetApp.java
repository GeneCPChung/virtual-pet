import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String petName = null;
		VirtualPet pet = new VirtualPet(petName, 49, 49, 49, 49);
		System.out.println("Welcome! Please give your pet a name: ");
		String actionOpt = input.nextLine();
		petName = actionOpt;

		do {
			pet.tick(0);
			System.out.println("This is how " + petName + " is feeling\nHunger: " + pet.getHunger() + "\nBoredom: "
					+ pet.getBoredom() + "\nNeed To Potty: " + pet.getNeedToPotty() + "\nSleepiness: " + pet.getTiredness());
			System.out.println("\nWhat would you like to do?\n1: Feed\n2: Play\n3: Potty\n4: Nap\n5: Leave\n");
			actionOpt = input.next();
			if (actionOpt.contentEquals("1")) {
				System.out.println("Please enter an amount to feed\n(1-5 Where 1 is the least)");
				int feedingPet = input.nextInt();
				while (feedingPet > pet.getHunger()) {
					System.out.println("You will kill " + petName
							+ " with that much food! Please enter something more reasonable:");
					feedingPet = input.nextInt();
				}
				if (feedingPet > 0) {
					pet.feeding(feedingPet);
					System.out.println(petName + "'s hunger is now: " + pet.getHunger() + " and Need To Potty is " + pet.getNeedToPotty());
				}
			}
			int play = 15;
			if (actionOpt.contentEquals("2")) {
				pet.playing(play);
				System.out.println(petName + "'s new boredom is now " + pet.getBoredom() + " and their hunger is " + pet.getHunger() + "\n");
			}
			int poop = 15;
			if (actionOpt.contentEquals("3")) {
				pet.pooping(poop);
				System.out.println(petName + "'s feeling much better. Her Potty is now " + pet.getNeedToPotty() + " and their Hunger is now " + pet.getHunger() + "\n");

			}
			int sleep = 30;
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
