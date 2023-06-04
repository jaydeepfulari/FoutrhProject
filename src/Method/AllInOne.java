package Method;

public class AllInOne 
{
	public static void StaticMethod()
	{
		System.out.println("Its Static in nature");
	}
	
	public void NonStaticMethod()
	{
		System.out.println("Its a Non Static Method. And I required to create an object");
	}
	public static void main(String[] args) 
		{
		System.out.println("I am Main Method. and I am the starting point of JVM . also without me, you cant execute the programme");
		
		StaticMethod();
		
		AllInOne a = new AllInOne();
		a.NonStaticMethod();
		
	}
}