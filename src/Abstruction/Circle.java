package Abstruction;

public class Circle extends  Shape{
public double radius;



public Circle(double radius) {
	super("Circle");
	this.radius=radius;
}


@Override
	public double calculateArea() {
	double result=3.14*(radius*radius);
		return result;
		
	}
	@Override
	 public void draw() {
		System.out.println(" Drawing"+name + " circle with radius "+radius);
}


	@Override
	public void superDraw() {
	System.out.println("hey Circle");
		
	}}
