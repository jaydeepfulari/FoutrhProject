//LOCAL= Inside the main method
//GLOBAL / INSTANCE = Inside the class but outside the main method		Only for NonStatic method.
// STATIC / CLASS = Inside the class, but having static keyword			For Static and NonStatic method.

package variable;
public class Local 									//LOCAL METHOD
{
	public static void staticlocal()				//STATIC
	{
		int b= 20;
		System.out.println(b);
	}
	
	public void nonstaticlocal()					//NON STATIC
	{
		int c = 10;
		System.out.println(c);
	}
	public static void main(String[] args) 			//MAIN
	{
	int a = 30;
	System.out.println(a);
	
	 staticlocal();
	 Local z = new Local();
	 z.nonstaticlocal();
	 }
		
	}