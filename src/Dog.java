public class Dog {
    private String name;
    private String foodName;
    private boolean hungry = true;
    private boolean alive = true;
    private int points = 0;

    // Name of pet
    public void setName(String inputName) {
        name = inputName;
    }
    public String getName() {
        return name;
    }

    // Food stuff
    public void setFoodName(String inputName) {
        foodName = inputName;
    }
    public void giveFood() {
        if (hungry) {
            System.out.println(name + " ate the " + foodName + ".");
            hungry = false;
        }
        else {
            System.out.println(name + " is not hungry.");
        }
    }

    //Play stuff
    public void playWith() {
        System.out.println("You played with " + name + "!");
        ++points;
    }


    // Print Dog
    public void printDogPicture() {
        System.out.println("  /^ ^\\");
        System.out.println(" / 0 0 \\");
        System.out.println(" V\\ Y /V");
        System.out.println("  / - \\");
        System.out.println(" /    |");
        System.out.println("V__) ||");
        System.out.println();
        System.out.println("Here is your dog, " + name + ".");
        System.out.println();
    }

}
