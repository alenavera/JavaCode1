package AbstractionP;

public class Rhombus extends Game{

public Rhombus() {
	super("Rhombus",4,4);
	
}

@Override
public int calculate() {
	 int result=(height*width)/2;
	return result;
}

@Override
public void display() {
	
	System.out.println(name+" "+" area is "+ calculate());
}
	
	
	
}
