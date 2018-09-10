package Abstruction;

import java.util.ArrayList;
import java.util.List;


public class Delete {	
	public static void main(String[] args) {
		
	
	List<String>	words	=	new	ArrayList<>();			
words.add("Otto");	
words.add("ADA");	
words.add("Alyla");		
words.add("Bob");	
words.add("HannaH");
words.add("Java");		
System.out.println("List	of	words:	"	+	words);				


List<String>	palindromes1	=	filterStrings(words,new	PalindromeCaseSensitive());				
System.out.println(palindromes1);		




List<String>	palindromes2	=	filterStrings(words,new PalindromeCaseInsensitive());				
System.out.println(	palindromes2);	


List<String>	palindromes3	=	filterStrings(words,new	StrPredicate()	{	

	
	
	@Override									
	public	boolean	test(String	str)	{										
return	str.equals(new	StringBuilder(str).reverse().toString());
}});			
	

System.out.println(	palindromes3);	


List<String>	palindromes4	=	filterStrings(words,new	StrPredicate()	{		
	
	@Override	
	public	boolean	test(String	str)	{												
		return	str.equalsIgnoreCase(new	StringBuilder(str).reverse().toString());										
	}
	}
);				
System.out.println(palindromes4);		

}	
public	static	List<String>	filterStrings(List<String>	strList,StrPredicate	predicate)	{	
		List<String>	result	=	new	ArrayList<>();				
for	(String	str	:	strList)	{					
	if	(predicate.test(str))	{																																															
		result.add(str);
		}}			
return	result;	
} 
}





	interface	StrPredicate	{	
		
	boolean	test(String	str);
	
}
class	PalindromeCaseSensitive	implements StrPredicate	{

	@Override
	public boolean test(String str) {
		
		return str.equals(new	StringBuilder(str).reverse().toString());	
		}
	
}
	 

class	PalindromeCaseInsensitive	implements	StrPredicate	{								
	@Override	
	public	boolean	test(String	str)	{			
	return	str.equalsIgnoreCase(new	StringBuilder(str).reverse().toString());		
	} }

























//	List<String>	palindromes4	=	filterStrings(words,new	StrPredicate()	{	
//		@Override public	boolean	test(String	str)	{												
//			return	str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
//		}});				
//	System.out.println(palindromes4);
//}
//
// 	
//public	static	List<String>	filterStrings(List<String>	strList,List<String>result	=new	ArrayList<>();																																										StrPredicate	predicate)	{				
//			
//		for	(String	str	:	strList)	{					
//		if	(predicate.test(str))	{																																									
//			// (10)					
//			result.add(str);				
//			}				}				return	result;		} }}
//		

//	public static void main(String[] args) {
//
//		List<String> words = new ArrayList<>();
//
//		words.add("OttO");
//		words.add("Ada");
//		words.add("Alula");
//		words.add("Bob");
//		words.add("HannaH");
//		words.add("Java");
//		words.add("anana");
//		System.out.println("List	of	words:	" + words);
//
//		List<String> palindromes = filterPalindromes(words);
//
//		System.out.println( palindromes);
//
//
//	}
//
//	public	static	List<String>	filterPalindromes(List<String>	words)	{		
//		List<String>	result	=	new	ArrayList<>();			
//		for	(String	word	:	words)	{						
//			if	(word.equals(new	StringBuilder(word).reverse().toString()))	{	
//				// (5)							
//				result.add(word);					
//				}				
//			}		
//		return	result;		
//	}
//}	
// public static void main(String[] args) {
// List<String> strList = new ArrayList<>();
// strList.add("Anna");
// strList.add("Bob");
// strList.add("Bob");
// strList.add("Ada");
// strList.add(null);
// strList.add("Bob");
// strList.add("Bob");
// strList.add("Adda");
//
// while(strList.remove("Bob")){
// System.out.println(strList);
// }
// }}
// List<String> strList = new ArrayList<>();
// strList.add("Anna");
// strList.add("Ada");
// strList.add(null);
// strList.add("Bob");
// strList.add("Bob");
// strList.add("Adda");
// strList.add("Atakan");
// System.out.println(strList.size());
// System.out.println(strList);
//
//
// while(strList.remove("Bob"));
// System.out.println(strList);
// System.out.println(strList.size());}
// }
// public static void main(String[] args) {
//
// List<String> strList = new ArrayList<>();
// strList.add("Anna");
// strList.add("Ada");
// strList.add("Bob");
// strList.add("Adda");
// strList.add("Bob");
// for (int i = 0; i < strList.size(); ++i) {
// if (strList.get(i).equals("Bob")) {
// strList.remove(i);
// }
// }
// System.out.println(strList);
// }
// }
// List<String> strList = new ArrayList<>();
//
// strList.add("Anna");
// strList.add("Ada");
// strList.add(null);
//
// strList.add("Bob");
//
// strList.add("Adda");
// strList.add("Bob");
// //System.out.println(strList);
// for (int i = 0; i < strList.size(); ++i) {
//
// if (strList.get(i).equals("Ada")) {
// System.out.print(i);
// }
// System.out.println();
// }}}

// public static void main(String[] args) {
//
//// List<StringBuilder> sbListOne = new ArrayList<>();
//// sbListOne.add(new StringBuilder("Anna"));
//// sbListOne.add(new StringBuilder("Ada"));
//// sbListOne.add(new StringBuilder("Bob"));
////
//// System.out.println(sbListOne);
////
////
//// List<StringBuilder> sbListTwo = new ArrayList<>(sbListOne);
////// sbListTwo.add(new StringBuilder("Anna"));
////// sbListTwo.add(new StringBuilder("Ada"));
////// sbListTwo.add(new StringBuilder("Bob"));
//////
////// System.out.println(sbListTwo);
//// System.out.println(sbListOne==sbListTwo);
//// System.out.println(sbListOne.equals(sbListTwo));
//// }}
// public static void main(String[] args) {
// doIt1(); doIt2(); }
// public static void doIt1() {
// List<StringBuilder> sbListOne = new ArrayList<>();
// sbListOne.add(new StringBuilder("Anna"));
// sbListOne.add(new StringBuilder("Ada"));
// sbListOne.add(new StringBuilder("Bob"));
// List<StringBuilder> sbListTwo = new ArrayList<>(sbListOne);
// sbListOne.add(null);
// sbListTwo.get(1).reverse();
// System.out.println(sbListOne); // (1) } public static void doIt2() {
// List<String> listOne = new ArrayList<>(); listOne.add(“Anna”);
// listOne.add(“Ada”); listOne.add(“Bob”); List<String> listTwo = new
// ArrayList<>(listOne); String strTemp = listOne.get(0);
// } // (2) }
//
// public static void doIt2() {
// List<String> listOne = new ArrayList<>();
// listOne.add("Anna");
// listOne.add("Ada");
// listOne.add("Bob");
// List<String> listTwo = new ArrayList<>(listOne);
//
// String strTemp = listOne.get(0);
//
// System.out.println(listOne.set(0, listOne.get(listOne.size()-1)));
// System.out.println(listOne);
// listOne.set(listOne.size()-1, strTemp);
// System.out.println(listOne+"99");
// System.out.println("====");
// System.out.println(listTwo); // (2) } }
// }
// }
// public static void main(String[] args) {
// //int i=0;
// List<String> strList = new ArrayList<>();
// //WOW! eBook www.wowebook.org
// strList.add("usen");
// strList.add("ahmed");
// strList.add("kenjebek");
// strList.add("kamila");
// strList.add("gulshan");
// for (int i = 0; i < strList.size(); ) {
// if(strList.get(i).length()<=5) {
// strList.remove(i);
// }else {
// ++i;
// }}
// System.out.println(strList);
// }
// }

// static String b = "JAVA";// class variable
// int num = 13;// instance variable
// static {//
// System.out.println("Hello from static block");
// }
//
// {//2
// System.out.println("Hello from instance initialization block ");
// }
//
// public static void main(String[] args) {
// double k = 6;//local variable
// System.out.println(k);
// // System.out.println(num);
// Delete t = new Delete();
// System.out.println(t.num);
//// Delete del=new Delete();
// }
//
// }
