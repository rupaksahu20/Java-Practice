package shreyansh_program;

//Difference between Interface with default method and abstract class

public interface Interface_Example 
{
	/*int a=10; //By default public,static and final     ==//Difference between Interface with default method and abstract class   
	//In interface we can't declare instance variable    ==>In interface all the variables are public,static and final by default and we can not declare instance variable.
	public default void defaultMethod()                  ==>We can't declare/write constructor inside interface whereas we can write constructor inside abstact class.   
	{                                                    ==>In case of interface we cant declare static and instance blocks whereas we can declare these blocks in abstract class.
		a=20;                                            ==>Inside interface we can't override object class methods whereas we can override object class methods in abstract class
	}
	
	Interface_Example() //Not allowed in interface
	{
		
	*/

}

abstract class Absclass
{
	
	static
	{
		System.out.println("Inside Static block");
	}
	{
		System.out.println("Inside nonstatic block");
		
	}
	public Absclass()
	{
		System.out.println("Inside cons"); //constructors are allowed inside abstract class
	}
	int x=10;//Instance variable
	public void demoMethod()
	{
		x=20; //We can change the value in case of instance variable
		
	}
}
