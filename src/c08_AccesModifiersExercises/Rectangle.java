package c08_AccesModifiersExercises;

public class Rectangle {
	
	private double width;
	private double height;
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public void calculateArea(double result) {
		result = width * height;
		System.out.println(result);
	}

}
