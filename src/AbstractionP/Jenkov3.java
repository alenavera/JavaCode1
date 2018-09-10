package AbstractionP;

public abstract class Jenkov3 extends Jenkov {
	 public void process() {
	        stepBefore();
	        action();
	        stepAfter();
	    }

	    public void stepBefore() {
	       System.out.println("Jenkov3-stepBefore");
	    }

	    public abstract void action(); // implemented by subclasses

	    public void stepAfter() {
	    	   System.out.println("Jenkov3 ton keldim step after");
	    }
	}


