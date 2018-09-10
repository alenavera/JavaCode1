package AbstractionP;

import java.util.Arrays;
import java.util.List;



public class MainMethodForAbstract {

	public static void main(String[] args) {
//		Player player=new Player();
////		Menu menu=new Menu();
//		Square a=new Square();
//		a.display();
//		
//		
//		Rhombus r=new  Rhombus ();
//		 r.display();
//		 r.calculate();
//		
//		 
//		 Kite k=new Kite();
//		 k.display();
	 Game[] polygom = { new Square(), new Rhombus (), new  Kite () };
		//for (Game abc : polygom) {
		//	abc.display();
			List<Game> list = Arrays.asList(polygom);
			for (int i = 0; i < list.size(); i++) {
		     list.get(i).display();
		 
	//}

}}}
