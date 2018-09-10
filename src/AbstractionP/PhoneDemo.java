package AbstractionP;

import java.util.Arrays;
import java.util.List;

public class PhoneDemo {

	public static void main(String[] args) {
		
//Phone obj=new Nokia();
//obj.showConfig();
//
//
//System.out.println();
//
//
//
//Phone obj2=new Samsung();
//obj2.showConfig();



Phone[] obj = { new Nokia(), new Samsung ()};
for (Phone abc : obj) {
abc.showConfig();
//	List<Phone> list = Arrays.asList(obj);
//	for (int i = 0; i < list.size(); i++) {
//     list.get(i).showConfig();
// 
//	}

}}}
