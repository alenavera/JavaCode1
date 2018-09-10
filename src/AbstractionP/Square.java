package AbstractionP;

public class Square extends Game{
//private  int area;
public Square() {
	super("Square",2,4);
}


	@Override
	public int calculate() {
		int result=2*(height*width);
		//this.area = result;
		return result;
	}

	@Override
	public void display() {
		System.out.println(name+" "+  "area  is "+calculate());
		
	}

}
