package AbstractionP;

public class TownHouse extends Building {


		private boolean isEndUnit;
		public TownHouse() {
		System.out.println("I am from Empty Constructor TownHouse");
		}
		public void addDoor() {
			System.out.println("I am from Town House");
	}
		public TownHouse(String name,String type,int FloorCount,boolean isEndUnit ) {
			super(name,type,FloorCount);
			this.isEndUnit=isEndUnit;
		}
		public String toString() {
			return getName()+getType()+""+getFloorCount()+isEndUnit;
}
}