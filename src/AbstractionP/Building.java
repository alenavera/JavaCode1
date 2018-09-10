package AbstractionP;

public class Building {
	private String name;
	private String type;
	private int floorCount;
	public Building(String name, String type, int floorCount) {
		super();
		this.name = name;
		this.type = type;
		this.floorCount = floorCount;
	}
	public Building() {
		System.out.println("i am  Empty Constructor");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getFloorCount() {
		return floorCount;
	}
	public void setFloorCount(int floorCount) {
		this.floorCount = floorCount;
	}
	public String toString() {
		return "Building information"+""+name+" " +type+" "+floorCount ;
}
	public void addFloor() {
		floorCount++;
		System.out.println("Adding Floors.......");
	}
	public void addDoor() {
		System.out.println("Adding Doors........");
	}
}
