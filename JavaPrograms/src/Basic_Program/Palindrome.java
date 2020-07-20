package Basic_Program;

public class Palindrome {

	public static void main(String[] args) {

		
		  int a;
		 int sum=0;
		 int temp;    
		  int b=454;//It is the number variable to be checked for palindrome  
		  
		  temp=b;    
		  while(b>0){    
		   a=b%10;  //getting remainder  
		   sum=(sum*10)+a;    
		   b=b/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		
	}


