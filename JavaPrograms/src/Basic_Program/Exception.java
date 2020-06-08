package Basic_Program;

public class Exception 
{
	public static void main(String[] args) {
		
       int i=10;
       
       try
       {
    	   i=i/Integer.parseInt(args[0]);
       }
       catch(ArithmeticException e)
       {
    	   System.out.println(e);
       }
       
       finally
       {
    	   System.out.println("Finally Block Executed");
       }
       System.out.println("Value of i is: "+i); 
	}

}
