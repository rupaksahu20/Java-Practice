/**
 * 
 */
package com.javaquestions;

import java.util.Scanner;

/**
 * @author Rupak
 *
 */
public class OddEven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner reader= new Scanner(System.in);
		System.out.println("Plz enter a number");
		int num=reader.nextInt();
		
		if(num%2==0) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}
		
		
		
		
	}

}
