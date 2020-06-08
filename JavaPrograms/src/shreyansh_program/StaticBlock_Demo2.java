package shreyansh_program;

public class StaticBlock_Demo2 
{
	static String s="";
	static
	{
		s="Rupak Sahu";
		System.out.println("s is "+s);
	}                                                 //Ques-Can we execute a program without main() method?
	                                                 //ANS-Yes,One of the way is static block but in previous version of Jdk not in Jdk 1.7 and higher version

	StaticBlock_Demo2 ()
	{
		System.out.println("Inside Constructer");
	}
	
	public static void main(String[] args) {
		StaticBlock_Demo2 obj=new StaticBlock_Demo2();
		StaticBlock_Demo2 obj1=new StaticBlock_Demo2();
		StaticBlock_Demo2 obj2=new StaticBlock_Demo2();
				
	}
		
	

}
