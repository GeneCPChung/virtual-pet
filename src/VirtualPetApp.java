import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String petName = null;
		VirtualPet pet = new VirtualPet(petName, 10);
		System.out.println("Welcome! Please give your pet a name: ");
		String actionOpt = input.nextLine();
		petName = actionOpt;
		System.out.println("Welcome! This is how " + petName + " is feeling\n");

		do {
			System.out.println("This is how " + petName + " is feeling\n");
			System.out.println("What would you like to do?\n1: Feed\n2: Play\n3: Potty\n4: Leave\n");
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
					System.out.println(petName + "'s hunger is now: " + pet.getHunger());
				}
			}
			

			if (actionOpt.contentEquals("4")) {
				System.out.println("Thanks for visiting!");
				System.exit(0);
			}

		} while (!actionOpt.contentEquals("4"));
	}
}
