/**
 * 
 */
package com.javaquestions;

/**
 * @author Rupak
 *
 */
public class FactorialNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		getFact(5);

	}

	
	public static void getFact(int num) {
		
		int fact=1;
		
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of " + num + " is: " +fact);
	}
}
