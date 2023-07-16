package day01.practice;


public class Dog {

    private boolean hasDots;
    private String color;
    
    public Dog(boolean hasDots, String color) {
        this.hasDots = hasDots;
        this.color = color;
    }
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
	public void speak() {
        System.out.println("Woof!");
    }
   
    public static void main(String[] args) {
      
        Dog dog1 = new Dog(true, "purple");
        Dog dog2 = new Dog(true, "blue");

        System.out.println("Dog 1:");
        System.out.println("Has Dots: " + dog1.hasDots());
        System.out.println("Color: " + dog1.getColor());
		dog1.speak();
        System.out.println("Dog 2:");
        System.out.println("Has Dots: " + dog2.hasDots());
        System.out.println("Color: " + dog2.getColor());
		dog1.speak();
    }
}