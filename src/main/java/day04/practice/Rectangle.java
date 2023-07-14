package day04.practice;

public class Rectangle {
	protected double length;
	protected double breadth;
	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	public double calculateArea() {
		return length * breadth;
	}
}
class Square extends Rectangle {
	public Square(double side) {
		super(side, side);
	}
	public static void main(String[] args) {
		Square square = new Square(8.0);
		double length = square.getLength();
		System.out.println("Length: " + length);
		double area = square.calculateArea();
		System.out.println("Area: " + area);
	}
	
}