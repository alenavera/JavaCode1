package Abstruction;

 class OnlineStudent extends Student{
public static void main(String[] args) {
	OnlineStudent o=new OnlineStudent ();
	o.attendClass();
	o.study();
	System.out.println();
	TutoringClass t=new TutoringClass();
	t.attendClass();
	
}
	@Override
	public void attendClass() {
		System.out.println("Burulsun  Online okup jatat");
	}
			
	 }

