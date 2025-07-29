public class Cat {
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
        System.out.println("    /\\_____/\\");
        System.out.println("   /  o   o  \\");
        System.out.println("  ( ==  ^  == )");
        System.out.println("   )         (");
        System.out.println("  (           )");
        System.out.println(" ( (  )   (  ) )");
        System.out.println("(__(__)___(__)__)");
        System.out.println();
        System.out.println("Here is your cat, " + name + ".");
        System.out.println();
    }

}
