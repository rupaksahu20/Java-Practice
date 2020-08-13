/**
 * 
 */
package com.javaquestions;

/**
 * @author Rupak
 *
 */
public class LargestAmongThreeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a = 900;
		int b = 500;
		int c = 900;

		if (a > b && a > c) {
			System.out.println("a is greatest number");
		}

		else if (b > c) {
			System.out.println("b is greatest number");
		} else {
			System.out.println("c is greatest number");
		}

	}

}
