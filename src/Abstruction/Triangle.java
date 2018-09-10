package Abstruction;

public class Triangle  extends  Shape{
	private double leng1;
	private double leng2;
	private double leng3;

	public Triangle(double leng1,double leng2, double leng3) {
		super("Triangle");
		this.leng1=leng1;
		this.leng2=leng2;
		this.leng3=leng3;
	}
		@Override
		public double calculateArea() {
			double result=leng1+leng2+leng3;
			return result;
			
	
		
		
		}
		@Override
		 public void draw() {
			System.out.println(" Drawing "+name + " triangle's area is "+""+(leng1+leng2+leng3));
	}
		@Override
		public void superDraw() {
			System.out.println("hey triangle");
			
		}
		
	}
	


