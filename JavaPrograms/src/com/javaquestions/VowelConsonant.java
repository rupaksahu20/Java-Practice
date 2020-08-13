/**
 * 
 */
package com.javaquestions;

/**
 * @author Rupak
 *
 */
public class VowelConsonant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		char ch = 'z';

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println(ch + " is vowel");

		} else {
			System.out.println(ch + " is consonant");
		}

		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(ch + " is vowel");
			break;

		default:
			System.out.println(ch + " is consonant");
			break;
		}

	}
}
