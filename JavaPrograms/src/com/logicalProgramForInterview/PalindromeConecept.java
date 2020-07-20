package com.logicalProgramForInterview;

import java.util.Scanner;

public class PalindromeConecept {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Scanner in = new Scanner(System.in);

		System.out.println("Enter a string/number to check if it is a palindrome");
		String original = in.nextLine();
		char[] myArr = original.toUpperCase().toCharArray();
		
		for (int i = myArr.length - 1; i >= 0; i--) {
			sb.append(myArr[i]);
		}

		if (original.toUpperCase().equals(sb.toString())) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

	}

}
