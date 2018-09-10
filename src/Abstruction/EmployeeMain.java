package Abstruction;
import java.util.Arrays;
import java.util.Comparator;

public class EmployeeMain {

	public static void main(String[] args) {
		
//		
// Employee[] k=new Employee[5];
//		
// k[0]=new Employee("Jack",4000);
// k[1]=new Employee("Tailor",8000);
// k[2]=new Employee("Karl",7000);
// k[3]=new Employee("America",6000);
// k[4]=new Employee("Eric",5000);
// 
//java.util.Arrays.sort(k, new Comparator<Employee>() {
//
//	@Override
//	public int compare(Employee t1, Employee t2) {
//		
//		
////		int r = t1.name.compareTo(t2.name);
////        if(r!= 0) { return r; }
//    
//        return t1.salary - t2.salary;
//	
//		//return t1.name.compareTo(t2.name);
//	
//		
//		
//	
//	}
//	
//});
//for (int i = 0; i < k.length; i++) {
//	System.out.println(k[i].salary);
////}
////	for (int i = 0; i < k.length; i++) {
////		System.out.println(k[i].name+" "+k[i].salary);
//}
		
	//	int[] ints = {0,2,4,6,8,10,55,70};

//		int index = Arrays.binarySearch(ints, 6);
//		int index1 = Arrays.binarySearch(ints, 7);
//		int index3 = Arrays.binarySearch(ints, 35);
//		System.out.println(index3);	
		
		//int[] ints = {0,2,4,6,8,10};

//	//	int index = Arrays.binarySearch(ints, 0, 4, 2);
//		int index1 = Arrays.binarySearch(ints, 0,7,6 );
//		System.out.println(index1);
//		
		
		int[] ints1 = {0,2,4,6,8,10};
		int[] ints2 = {0,2,4,6,8,10};
		int[] ints3 = {10,8,6,4,2,0};
int[]ints4= {11,15,12,13,14,15};
		boolean ints1EqualsInts2 = Arrays.equals(ints1, ints2);
		boolean ints1EqualsInts3 = Arrays.equals(ints1, ints3);
		boolean ints3EqualsInts4 = Arrays.equals(ints3, ints4);

		System.out.println(ints1EqualsInts2);
		System.out.println(ints1EqualsInts3);
		System.out.println(ints3EqualsInts4);
		
	}}

	
	
	
	
	
	