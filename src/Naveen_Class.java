
public class Naveen_Class {
	
		   public static void main(String[] args) {
			   
			   int count=0;
				String name = "Hello World";
				String str=null;
		        char[] arr = name.toCharArray();
		        for (int i = 0; i < arr.length; i++) {
					if(arr[i]=='o')
					{
						count++;
					}
					if(count==2){
						 arr[i] = Character.toUpperCase(arr[i]);
						 str = new String(arr);
						 System.out.println(str);
						 break;
					}}}
		   }
//			   String river = "Hello, World";
//			   String str = river;
//			  river = river.replaceAll("e","*");//o
//			  river = river.replaceAll("o","#");//e
//			  river = river.replaceAll("\\*","o").replaceAll("#","e");
//			  System.out.print(river);
//		   }}
//String t = "  Hello World ";
//String t1=t.trim();
//System.out.println(t1);
//String t3=t1.replace(arg0, arg1)(t1.charAt(7))
////String result =(t.trim().charAt(7)+"").toUpperCase()+(t.trim().substring(1,t.trim().length()));
////System.out.println(result);
//			   System.out.println("----------------------------");
//		      String original = "Hello World";
//		      String newst = original.replace('o', 'O');
//		      System.out.println( newst );
//		      
//		      System.out.println("-----------------------------------------");
//		      String or = "Hello World";
//		      
//		      char[] t=or.toCharArray();
//	
//		      for (int i = 0; i < t.length; i++) {
//		    	  if(t[i]== 'o'){
//		    		  count++;
//		          } if(count==2) {
//		        	  System.out.println());
//		          }
//			}}}
//		      
//		      
		    
