package c08_InheritanceExercises;

abstract class Shape {
	public abstract double calculateArea();

}

class Circle extends Shape {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}

}

class Rectangle extends Shape{
	private double width;
	private double height;
	
	public Rectangle ( double widht, double height) {
		this.width = widht;
		this.height = height;
	}
	
	@Override
	public double calculateArea() {
		return width * height;
	}
}




