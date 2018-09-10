package AbstractionPraktika;



public class WhileLoop {}

/*
   public static void main(String args[ ] ){
      StringBuilder sb = new StringBuilder("12345678");
      System.out.println(sb );
      sb.setLength(5);
System.out.println(sb.length());
sb.setLength(10);
      System.out.println(sb.length());
   }
}
*/

/*

       private static int loop = 15 ;
       static final int INTERVAL = 10 ;
       boolean flag ;
       { flag = true; loop = 0; } 
      
       static { loop = loop+INTERVAL; }
}
*/
//
//public static void main(String[] args) {
//	
//
//
//boolean b1 = false;
//boolean b2 = false;
//if (b2 != b1= b2){
//   System.out.println("true");
//}
//else{
//   System.out.println("false");
//}
//
//}}
//   abstract void calculate();
//   public static void main(String[] args){
//      System.out.println("calculating");
//      WhileLoop x = null;
//      x.calculate();
//   }
//}

//	  public static void main(String[] args) {
//		  TestClass t=new MNOP();
//		  System.out.println(t.x);
//		  System.out.println(t.y);
//		    // System.out.println(new TestClass().x+", "+new TestClass().y);
//	  }
//
//}
//class MNOP extends TestClass{
//   int x = 30;
//   static int y = 40;
//}
//
//class TestClass {
//	   int x = 10;
//	   static int y = 20;
//   }
//
//

//	
//
//
//    public void initData(String[] arr){
//        int ind = 0;
//        for(String str : arr){
//            str.concat(str+" "+ind);
//            ind++;
//        }
//    }
//    
//    public void printData(String[] arr){
//        for(String str : arr){
//            System.out.println(str);
//        }
//    }
//    
//    public static void main(String[] args) {
//   	 WhileLoop ot=new  WhileLoop();
//        String[] arr = new String[2];
//        ot.initData(arr);
//        ot.printData(arr);
//    }
//}
//	 t.loadMatrix();
//	 System.out.println(t.compute(1, 2));
//
//
//}
//    int[][] matrix = new int[2][3];
//    
//    int a[] = {1, 2, 3};
//    int b[] = {4, 5, 6};
//
//    public int compute(int x, int y){
//        return a[x]*b[y];
//    }
//    
//    public void loadMatrix(){
//        for(int x=0; x<matrix.length; x++){
//            for(int y=0; y<matrix[x].length; y++){
//                matrix[x][y]=compute(x,y);
//            }
//        }
//    }}


//
//public static String hello = "Hello"; 
//
//   public static void main(String[] args){
//      String hello = "Hello", lo = "lo";
//    //  System.out.print(( AbstractionPraktika.WhileLoop.hello == hello) + " ");    //line 1
//    //  System.out.print(( AbstractionPraktika.Other.hello == hello) + " ");   //line 2
//    //  System.out.print((hello == ("Hel"+"lo")) + " ");           //line 3
//     // System.out.print( (hello=="Hel"+lo) + " ");              //line 4
//     System.out.println(hello == ("Hel"+lo).intern());          //line 5
//   }
//}

//String s="";
//String t=new String("good");
//String r=new String ("good");
//System.out.println(t==r);


//      Stack s1 = new Stack ();
//      Stack s2 = new Stack ();
//      processStacks (s1,s2);
//      System.out.println (s1 + "    "+ s2);
//   }
//   public static void processStacks(Stack s1, Stack s2){
//      s1.push (new Integer ("100")); //assume that the method push adds the passed object to the stack.
//      s2 = s1;
// 
  
//	 WhileLoop t=new  WhileLoop();
//	System.out.println( t.getTypeOfDayWithSwitchStatement("Tuesday"));
//boolean b=false;
//if(b=true) {
//	System.out.println("true");
//}

//String str = "123";
//
////long m1 = new Long(str);
////long m2 =Long.parseLong(str);
////long m3=Long.valueOf(str).longValue();
////System.out.println(m3+123);
//
//
//int t1=new Integer(str);
//int t2=Integer.parseInt(str);
//int t3=Integer.valueOf(str).intValue();
//System.out.println(t1+10);
//
//System.out.println(t2+20);
//System.out.println(t3+30);
//}

//	public String getTypeOfDayWithSwitchStatement(String dayOfWeekArg) {
//	     String typeOfDay;
//	     switch (dayOfWeekArg) {
//	         case "Monday":
//	             typeOfDay = "Start of work week";
//	             break;
//	         case "Tuesday":
//	         case "Wednesday":
//	         case "Thursday":
//	             typeOfDay = "Midweek";
//	             break;
//	         case "Friday":
//	             typeOfDay = "End of work week";
//	             break;
//	         case "Saturday":
//	         case "Sunday":
//	             typeOfDay = "Weekend";
//	             break;
//	         default:
//	             throw new IllegalArgumentException("Invalid day of the week: " + dayOfWeekArg);
//	     }
//	     return typeOfDay;
//	}
//}
//
//
