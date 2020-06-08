package shreyansh_program;

public class StaticBlock_Demo 
{
/*	static
	{
		System.out.println("Inside Static Block");//Static block will be executed first as compare to main method
	}
	
	static
	{                                                          ==>Static blocks are the normal block of code,enclosed in braces{},preceded with static keyword.
		System.out.println("Inside 2nd static block");         ==>Static blocks are used to initialize the static data member.
	}                                                          ==>Static blcok is executed before main method.
	public static void main(String[] args) {                   ==>Static block will be executed at the time of class loading.    
		                                                       ==>A class can have multiple static blocks,which will be executed from to Bottom.
		System.out.println("Inside Main Block");
	}
	static
	{
		System.out.println("Inside 3rd static block");
	}

}*/

static String s="";
static
{
	s="Rupak Sahu";
}
public static void main(String[] args) {
	System.out.println("String is "+s);
}
}

