package Method;

public class NonStaticMethod 
{
	public void NsMethod()
	{
		System.out.println("I am non Static Method");
	}
	public static void main(String[] args) 
	{
		NonStaticMethod a = new NonStaticMethod();
		a.NsMethod();                                // no need to create object
	}
}
