package Abstruction;

import java.util.Scanner;

public class ExamPrep {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
int 	x=1;
	do {
	try{
		System.out.println("Enter your first number!");
	
	int k=input.nextInt();
	
	System.out.println("Enter your second number!");
	int t=input.nextInt();
	
	int sum=k/t;
	System.out.println(sum);
	x=2;
	}
	catch(ArithmeticException e) {
		System.out.println("You can not do this");
	
	}
	}while(x==1);
	
	
	
	
	
}}

//	Integer l=new Integer(200);
//	int r=l.intValue();
//	int g=l;
//	System.out.println(r+g);
////
////	 //numbers array
////	  int numbers[] = new int[]{55,32,45,98,82,11,9,39,50};
////
////	  //assign first element of an array to largest and smallest
////	  int smallest = numbers[0];
////	  int largest = numbers[0];
////
////
////	  for (int i = 1; i<numbers.length; i++) {
////	   if (numbers[i]>largest) {
////	    largest = numbers[i];
////	   } else if (numbers[i]  > smallest) {
////	    smallest = numbers[i];
////	  }
////
////	  System.out.println("Largest Number is : " + largest);
////	  System.out.println("Smallest Number is : " + smallest);
////	 
////	}
////	  
////String d="100";
////int x=100;
////
////int p= Integer.parseInt(d); 
////int sum=(p+x);
////System.out.println(sum);
//
//}}