import java.util.Scanner;

public class TerminalPet {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Choose an animal (cat/dog): ");
        String petChoice = scnr.next();

        Pet pet = new Pet(petChoice);
        //Figure out how to choose a pet

        // INTRO
        System.out.print("Enter a name for your " + petChoice + ": ");
        pet.setName(scnr.next());
        System.out.println();
        pet.printPicture(petChoice);

        //DECISION
        while (pet.isAlive()) {
            System.out.println("What would you like to do?");
            System.out.print("Type \"Feed\" to feed " + pet.getName() + ".\n");
            System.out.println("Type \"Play\" to play with " + pet.getName() + ".");
            System.out.println();
                if (scnr.next().equals("Feed")) {
                System.out.print("Enter a food: ");
                pet.setFoodName(scnr.next());
                pet.giveFood();
                }
                if (scnr.next().equals("Play")) {
                pet.playWith();
                }
            System.out.println();
            System.out.println("Type anything to continue");
            System.out.println();
        }
    }
}