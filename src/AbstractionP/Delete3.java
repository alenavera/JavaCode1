package AbstractionP;

public class Delete3 {
public static void main(String[] args) {
	//String rev
	String s="Beknazar";
	int len=s.length();
	String rev="";
	for (int i =len-1 ; i >=0; i--) {
		rev=rev+s.charAt(i);}
	System.out.println(rev);
	
		
	}
}

