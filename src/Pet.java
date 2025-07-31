public class Pet {
    private String name;
    private String foodName;
    private boolean hungry;
    private boolean alive;
    private String petChoice;
    private int turns;

    //Constructor
    public Pet(String petChoice) {
        name = "Void";
        foodName = "Void";
        hungry = true;
        alive = true;
        this.petChoice = petChoice;
        turns = 0;
    }

    //Check if pet is alive
    public boolean isAlive() {
        return alive;
    }
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
            System.out.println();
            System.out.println(name + " ate the " + foodName + ".");
            System.out.println();
            hungry = false;
            ++turns;
            if (turns > 5) {
                hungry = true;
            }
        }
        else {
            System.out.println();
            System.out.println(name + " is not hungry.");
            System.out.println();
        }
    }

    //Play stuff
    public void playWith() {
        System.out.println();
        System.out.println("You played with " + name + "!");
        ++turns;
    }

    //Print picture
    public void printPicture(String petChoice) {
        DogPicture dogPicture = new DogPicture();
        CatPicture catPicture = new CatPicture();
        if  (petChoice.equals("cat")) {
            catPicture.printPicture();
        }
        if  (petChoice.equals("dog")) {
            dogPicture.printPicture();
        }
    }

}
