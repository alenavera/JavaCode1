package AbstractionP;

public class Construction {
	public static void main(String[] args) {
		
	
Building br=new Building(" Trump Tower","Hotel",10);
System.out.println(br.toString());
SingleHouse s=new SingleHouse(" Maria  Town "," Otel ",20,10.45);
System.out.println(s);

//TownHouse t= new TownHouse();
s.addDoor();
s.addFloor();
}
}