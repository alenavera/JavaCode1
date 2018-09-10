package AbstractionP;

public class SingleHouse extends Building {

	double hoaFee;

	public SingleHouse(String name, String type, int floorCount, double hoaFee) {
		super(name, type, floorCount);
		this.hoaFee = hoaFee;
	}
	@Override
	public void addDoor() {
		System.out.println("I am Empty Constructor from Single House");
	}

	public void addFloor() {
		System.out.println("I am adding floor from Single House");

	}

	public String toString() {
		return getName() + getType() + " " + getFloorCount() + "  " + hoaFee + "  1 Single House";
	}

}
