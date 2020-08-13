/**
 * 
 */
package com.attra.batch5java;

/**
 * @author Rupak
 *
 */

//Write a program to calculate the sum of the integers in the below string

public class CalculateSumOfIntegerFrom_String {

	public static int sumOfDigits(String stng) {
		int l = stng.length();
		int sum = 0;
		for (int i = 0; i < l; i++) {
			// Condition to add integers in a given string
			if

			(Character.isDigit(stng.charAt(i))) {
				String tmp = stng.substring(i, i + 1);

				sum += Integer.parseInt(tmp);
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		// SumofInteger m = new SumofInteger();
		String str1 = "As3ty5fg888";
		System.out.println("The given string is: " + str1);
		System.out.println("The sum of the digits in the string is: " + sumOfDigits(str1));
	}

}

