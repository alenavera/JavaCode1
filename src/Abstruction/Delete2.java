package Abstruction;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
//@FunctionalInterface
//interface StrPredicate {
//	boolean test(String str);
//}

public class Delete2 {
	public static void main(String[] args) {
		Predicate<Integer>	integerPred	=		i->	i%2	==	0;
		System.out.println(integerPred.test(2015));
		
		
		System.out.println("================");
		
		
		
		
		IntPredicate	intPred	=		i	->	i%2	==	0;
		System.out.println(intPred.test(2016));
}

}
//
//
//
//
//
//
//
//
//@FunctionalInterface 
//interface	NewStrPredicate		{	
//	boolean	test(String	str);	
//	
//default void	msg(String	str)
//{	
//	System.out.println(str);	}
////	(2)	Default method		
//static	void	info()	{
//	System.out.println("Testing!");	}		
////	(3)	Static method
//@Override	boolean	equals(Object	obj);																			
// 
//}

//	public static void main(String[] args) {
//		List<String> words = new ArrayList<>();
//		words.add("Otto");
//		words.add("ADA");
//		words.add("Alyla");
//		words.add("Bob");
//		words.add("HannaH");
//		words.add("Java");
//		
//		System.out.println( words);
//		
//		StrPredicate predicate1 = (String str) -> str.equals(new StringBuilder(str).reverse().toString());
//		
//		List<String> palindromes1 = filterStrings(words, predicate1);
//		System.out.println(palindromes1);
//		
//		StrPredicate predicate2 = (String str) -> str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
//		List<String> palindromes2 = filterStrings(words, predicate2);
//		System.out.println(palindromes2);
//	}
//
//	public static List<String> filterStrings(List<String> strList, StrPredicate predicate) {
//		List<String> result = new ArrayList<>();
//		for (String str : strList) {
//			if (predicate.test(str)) {
//				result.add(str);
//			}
//		}
//		return result;
//	}
//
//}
