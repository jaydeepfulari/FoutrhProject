package variable;

public class Global 
{
	int a = 10;
	int b = 20;
	int c = 30;
	
	public static void GlobalStatic()		//STATIC
	{
		System.out.println(a);
	}
	
	public void GlobalNonStatic()		//NON STATIC
	{
		System.out.println(b);
	}

	public static void main(String[] args) //MAIN
	{
	System.out.println(c);					//MAIN
	
	//GlobalStatic();							//STATIC
		
	Global z = new Global();				//NON STATIC
	z.GlobalNonStatic();
	}
}
