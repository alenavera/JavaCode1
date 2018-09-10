package AbstractionP;

public class Kite extends Game{

public Kite() {
	super("Kite",8,8);
	
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
