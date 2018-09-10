package Abstruction;

public class ShapeTest {

	public static void main(String[] args) {
	
Circle c=new Circle(1.1);
c.draw();
double result=c.calculateArea();
System.out.println(result);

System.out.println();



Triangle t=new Triangle(2.5,3.5,3.5);
t.draw();
t.SuperDraw();

	}

}
