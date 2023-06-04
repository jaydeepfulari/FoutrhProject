package constructor;

public class Constructor1 
{
	//declaration
int a;
int b;
int c;

//initialization
	Constructor1()							//Non Parametric / Zero Argument
	{
		a=10;
		b=20;
		c=a+b;
		System.out.println(c);
	}
	//Usage
	//public static void main(String[] args) 
	{
	new Constructor1();		//constructor
	}
	
		Constructor1(int a)					//Parametric / Argumental
	{
		System.out.println(a);
	}
//	public static void main(String[] args) 
	{
		new Constructor1();
	}
	
	
	Constructor1 (int b, float c)
	{
		System.out.println(b);
		System.out.println(c);
	}
	
	//usage
	public static void main(String[] args) {
		{
			new Constructor1 ();
			new Constructor1 (55);
			new Constructor1 (100,5.5f);
		}
	}
	

}
