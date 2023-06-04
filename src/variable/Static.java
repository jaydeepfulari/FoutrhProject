package variable;

public class Static {

	static int a = 10;
	static int b = 20;
	static int c = 30;

	public static void staticstatic()
	{
		System.out.println(a);
	}
	
	public void staticnonstatic()
	{
		System.out.println(b);
		
	}
	
	public static void main(String[] args) {
		System.out.println(c);
		staticstatic();
		Static a = new Static();
		a.staticnonstatic();
		
	}
}
