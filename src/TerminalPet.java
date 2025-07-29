import java.util.Scanner;

public class TerminalPet {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Dog newDog = new Dog();

        // INTRO
        System.out.print("Enter a name for your dog: ");
        newDog.setName(scnr.next());
        System.out.println();
        newDog.printDogPicture();

        //DECISION
        System.out.println("What would you like to do?");
        System.out.print("Type \"Feed\" to feed " + newDog.getName() + ".");
        System.out.println();
        if (scnr.next().equals("Feed")) {
            System.out.print("Enter a food: ");
            newDog.setFoodName(scnr.next());
            newDog.giveFood();
        }

    }
}