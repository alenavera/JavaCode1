package AbstractionP;

public class Jenkov2 extends Jenkov3 {
	

		    public void process() {
		        stepBefore();
		        action();
		        stepAfter();
		    
	 }

	@Override
	public void action() {
		System.out.println("Jenkov 2demin jenkov 3ton keldm");
	
		
	}

	@Override
	public void abstractMethod() {
		System.out.println("Im the superclass");
		
	}

	}
	

