package Abstruction;

public class ArrAyPractise {

	public static void main(String[] args) {
		
		
//		int[] intArray= new int[12];
//		
//	
//
//		for(int i=1; i <intArray.length; i++) {
//		    intArray[i] = i;
//
////	
////		System.out.println(intArray[i]+"="+i );
////	}
//		String[] stringArray = new String[10];
//
//		for(int i=1; i < stringArray.length; i++) {
//		    stringArray[i] = "String no " + i;
//	//	}
//
//		//for(int i=0; i < stringArray.length; i++) {
//		    System.out.println( stringArray[i] +" ="+i);
//		}
		
		
		int[][] intArrays = new int[10][20];

		for(int i=0; i < intArrays.length; i++){
		    for(int j=0; j < intArrays[i].length; j++){
		        System.out.println("i: " + i + ", j: " + j);
		    }
		}
}}
