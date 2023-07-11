package day01.practice;

public class Cat {
	
	private boolean hasDots;
    private String color;


    // Getters and setters
    public boolean hasDots() {
        return hasDots;
    }

    public void setHasDots(boolean hasDots) {
        this.hasDots = hasDots;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Main method to create Dog objects
    public static void main(String[] args) {
        // Create two Dog objects
        Dog cat1 = new Dog();
        cat1.setColor("white");
        cat1.setHasDots(false);
        Dog cat2 = new Dog();
        cat2.setColor("black");
        cat2.setHasDots(true);

        // Print the attributes of each Dog
        System.out.println("cat 1:");
        System.out.println("Has Dots: " + cat1.hasDots());
        System.out.println("Color: " + cat1.getColor());

        System.out.println("cat 2:");
        System.out.println("Has Dots: " + cat2.hasDots());
        System.out.println("Color: " + cat2.getColor());
    }

}


//Cat 1:
//Age: 4
//Color: White
//Speaks: Meow!
//Cat 2:
//Age: 3
//Color: Black
//Speaks: Meow!
