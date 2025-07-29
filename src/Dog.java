public class Dog {
    private String name;
    private String foodName;
    private boolean hungry = false;
    private boolean alive = true;

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
        System.out.println(name +" ate the " + foodName + ".");
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
