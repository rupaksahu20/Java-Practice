package Basic_Program;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		
		
		      String str;
		      String rev = "";
		      Scanner sc = new Scanner(System.in);
		 
		      System.out.println("Enter a string:");
		      str = sc.nextLine();
		 
		      int length = str.length();
		 
		      for ( int i = length - 1; i >= 0; i-- )
		         rev = rev + str.charAt(i);
		 
		      if (str.equals(rev))
		         System.out.println(str+" is a palindrome");
		      else
		         System.out.println(str+" is not a palindrome");
		 
		   }
		}
	


