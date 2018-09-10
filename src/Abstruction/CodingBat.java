package Abstruction;

import java.util.Arrays;
import java.util.Comparator;

public class CodingBat {

	public static void main(String[] args) {
		
		
//		Employee[] employeeArray = new Employee[3];
//
//		employeeArray[0] = new Employee("Cander", 1);
//		employeeArray[1] = new Employee("Bob"  , 3);
//		employeeArray[2] = new Employee("Anna"  , 2);
//		
//		
//		java.util.Arrays.sort(employeeArray, new Comparator<Employee>() {
//		    @Override
//		    public int compare(Employee e1, Employee e2) {
//		        return e1.name.compareTo(e2.name);
		    }
//		});
//
//
//		for(int i=0; i < employeeArray.length; i++) {
//		    System.out.println(employeeArray[i].name);
//		}
//		
//	}
//private static class Employee{
//    public String name;
//    public int    employeeId;
//
//    public Employee(String name, int employeeId){
//        this.name       = name;
//        this.employeeId = employeeId;
//    }
//}

//c.printAll(new int[10], 6);
//c.displayArray(new int [10], 1, 9);
//c.printArray(new int[10], 5, 22);
	//c.insertIntoArray(new int[10], 3,127);
	

//	c.backAround("jamal");
//		
//		
//	}
//			public String backAround(String str) {
//			
//			  String last = str.substring(str.length() - 1);
//			  
//			  System.out.println(last + str + last);
//			  return last + str + last;
//			}
		
//		String str="karamel";
//		if (str.length() >= 4) {
//			  String a ;
//			  System.out.println(  a = str.substring(0, 4));
//			}
//			else {
//			  System.out.println(" whatever you want to do when length is < 4");
		//String str="Chocolate";
//		
//		if(str.length()>3) {
//			String k,k1,k2,k3;
//			System.out.println(k=str.substring(0,3)+str.substring(0,3)+str.substring(0,3));
//		}else{
//		System.out.println("you could not do it");
		
		
//		
//		String a="jamal";
//		String b="chocolate";
//		String c="Jamal";
//		boolean t=true;
//		
//		
//		if(a.equals(c)) { 
//			
//			
//			
//     System.out.println("tuura ");	
//		} else { 
//System.out.println("tuura emes continue");
//
//		} if(c.equals(b)) {
//			
//			
//			System.out.println("tuura");
//	} else if(a.equalsIgnoreCase(c)) {
//			 System.out.println("tuura");
//	} else {
//			System.out.println("tuura emes continue 2");
//			
//			
//			
//	}if(!b.equals(a)) {
//			System.out.println("b !==a--->tuura ");
//		
//	}else {
//			System.out.println("go away 3");
//		
//	}	
//		
//		int countXX(String str) {
//		  String str="xxx";
//		  int count=0;
//		  for(int i=0;i<str.length()-1;i++){
//		  if(str.substring(i,i+2).equals("xx"))
//		  count++; 
//		  System.out.println(count);
	  
	//int[] ints   = new int[20];
//
		//int insertIndex = 10;
	//	int newValue    = 123;
//
//		//move elements below insertion point.
//		for(int i=ints.length-1; i > insertIndex; i--){
//		    ints[i] = ints[i-1];
//		}
//
//		//insert new value
//		ints[insertIndex] = newValue;
//
//		System.out.println(Arrays.toString(ints));
//	int[]k=new int[10];
//		int insert=3;
//	int new1=666;
//		for(int i=k.length-1;i>insert;i--) {
//			k[i]=k[i-1];
//		}
//		
//		k[insert]=new1;
//		System.out.println(Arrays.toString(k));
		
//	
//	public void insertIntoArray(int[] array, int insertIndex, int newValue){
//		
//	 for(int i=array.length-1; i > insertIndex; i--){
//		    	
//		        array[i] = array[i-1];
//		    }
//
//		  
//		  array[insertIndex] = newValue;
//			System.out.println(Arrays.toString(array));
//		    
//		}
//		
//		}
	
//	
//	public void printArray(int[]array,int insert, int new1) {
//		for (int i = array.length-1; i>insert; i--) {
//			array[i]=array[i-1];
//			
//			
//		}
//		array[insert]=new1;
//		System.out.println(Arrays.toString(array));
	
	
	
//	
//	public void displayArray(int[]array,int insert,int new1) {
//		for (int i = array.length-1; i>insert; i--) {
//			array[i]=array[i-1];
//		}
//			array[insert]=new1;
//			
//			System.out.println(Arrays.toString(array));
//		}
//	
//	public void printAll(int[]array,int remove) {
//		for (int i = remove; i < array.length-1; i++) {
//			array[i]=array[i+1];
//			System.out.println(Arrays.toString(array));
//			}
//	
//	}
	//int[][] intArrays = new int[3][4];


//	
//	for(int i=0; i < intArrays[i].length; i++){
//		
//	    for(int j=0; j < intArrays[j].length; j++){
//	    	
//	    	//   for(int t=0; t <= intArrays[t].length; t++){
//	    		   
//	        System.out.println("i: " + i + ", j: " + j);
//	        		//+" ,t: " + t);
//	    }
////	}
////	
////	
//int[] ints = {0,2,4,6,8,10};
//
//int minVal = Integer.MIN_VALUE;
//
//for(int i=0; i < ints.length; i++){
//    if(ints[i] > minVal){
//        minVal = ints[i];
//    }
//}
//
//System.out.println("minVal = " + minVal);

//
////
////int[] source = new int[10];
////
////for(int i=0; i < source.length; i++) {
////    source[i] = i;
////}
////
//////int[] dest = Arrays.copyOfRange(source, 0, source.length);
//////System.out.println(  Arrays.toString(source) );
////
////int[] dest = Arrays.copyOf(source, source.length);
////System.out.println(  "dest"+Arrays.toString(dest) );
//
//int[] source = new int[18];
////
////for(int i=0; i < source.length; i++) {
////    source[i] = i;
////}
////
////int[] dest = Arrays.copyOfRange(source, 1, source.length);
////
////System.out.println(  "dest"+Arrays.toString(dest) );
////
//
//int[]   ints = new int[10];
//
//for(int i=0; i < ints.length; i++){
//    ints[i] = 10-i;
//}
//
//System.out.println(java.util.Arrays.toString(ints));
//java.util.Arrays.sort(ints);
//
//System.out.println(java.util.Arrays.toString(ints));
//
//
//
//

	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

