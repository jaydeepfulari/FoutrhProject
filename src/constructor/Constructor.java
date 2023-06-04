package constructor;

public class Constructor {
// DECLARATION
	int a;
	int b;
	int c;
	
	//initialization
	Constructor()
	{
		a=10;
		b=20;
		c=a+b;
		
	System.out.println(c);
	}
	
	//Usage
	public static void main(String[] args) 
	{
	new Constructor();
}
}