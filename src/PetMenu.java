import java.util.Scanner;

public class PetMenu {
    Scanner scnr = new Scanner(System.in);
    public PetMenu() {

    }

    public void displayMenu(Pet pet) {
            System.out.println("What would you like to do?");
            System.out.print("Type \"Feed\" to feed " + pet.getName() + ".\n");
            System.out.println("Type \"Play\" to play with " + pet.getName() + ".");
        }

    public void scanForChoice(Pet pet) {
        String choice = "Void";
        boolean choiceNeeded = true;
        while (choiceNeeded) {
            choice = scnr.nextLine();
            if (choice.equals("Feed")) {
                System.out.print("Enter a food: ");
                pet.setFoodName(scnr.next());
                pet.giveFood();
            }
            else if (choice.equals("Play")) {
                pet.playWith();
            }
            else {
                System.out.println("Invalid choice.");
            }

            choiceNeeded = false;
        }
    }

    public void takeAnotherChoice(Pet pet) {
        String choice = "Void";
        System.out.println("Would you like to make another choice? (Yes/No)");
        choice  = scnr.nextLine();

        if (choice.equals("Yes")) {
            scanForChoice(pet);
        }
        else if (choice.equals("No")) {
            System.out.println("Say goodbye to " + pet.getName() + ".");
            System.exit(0);
        }

    }


}
