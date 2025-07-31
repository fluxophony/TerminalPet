import java.util.Scanner;

public class TerminalPet {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        PetMenu petMenu = new PetMenu();

        System.out.print("Choose an animal (cat/dog): ");
        String petChoice = scnr.next();

        Pet pet = new Pet(petChoice);
        //Figure out how to choose a pet

        // INTRO
        System.out.print("Enter a name for your " + petChoice + ": ");
        pet.setName(scnr.next());
        System.out.println();
        pet.printPicture(petChoice);

        petMenu.displayMenu(pet);
        petMenu.scanForChoice(pet);
        petMenu.takeAnotherChoice(pet);


    }
}