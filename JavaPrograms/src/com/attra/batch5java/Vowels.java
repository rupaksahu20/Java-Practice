/**
 * 
 */
package com.attra.batch5java;

/**
 * @author Rupak
 *
 */

//Write a program to print only vowels as output by iterating through all the alphabets

public class Vowels {

	
	static void findVowelOrNot(char ch) {
		if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
			System.out.println(ch);
		}
	}

	public static void main(String[] args) {

		{
			char a;
			System.out.print("The Alphabets are:");
			for (a = 'A'; a <= 'Z'; a++) {
				System.out.print(a + " ");
			}
			System.out.println();
			System.out.println("The Vowels are:");
			for (a = 'A'; a < 'Z'; a++) {
				findVowelOrNot(a);

			}

		}
	}

}

