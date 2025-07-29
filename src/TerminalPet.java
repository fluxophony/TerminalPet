import java.util.Scanner;

public class TerminalPet {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String petChoice = scnr.next();

        //Figure out how to choose a pet

        // INTRO
        System.out.print("Enter a name for your " + petChoice + ": ");
        pet.setName(scnr.next());
        System.out.println();
        pet.printDogPicture();

        //DECISION
        System.out.println("What would you like to do?");
        System.out.print("Type \"Feed\" to feed " + pet.getName() + ".");
        System.out.println("Type \"Play\" to play with " + pet.getName() + ".");
        System.out.println();
        if (scnr.next().equals("Feed")) {
            System.out.print("Enter a food: ");
            pet.setFoodName(scnr.next());
            pet.giveFood();
        }

    }
}