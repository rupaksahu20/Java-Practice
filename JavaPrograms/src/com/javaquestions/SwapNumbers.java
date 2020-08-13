/**
 * 
 */
package com.javaquestions;

/**
 * @author Rupak
 *
 */
public class SwapNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		// System.out.println("Before Swapping");
		// System.out.println("a= " +a );
		// System.out.println("b= " +b );
		//
		// System.out.println("After Swapping");
		//
		// int temp;
		// temp=a;
		// a=b;
		// b=temp;
		// System.out.println("a= " +a );
		// System.out.println("b= " +b );

		// with out temp varibale

		System.out.println("Before Swapping");
		System.out.println("a= " + a);
		System.out.println("b= " + b);

		a = a - b;// -10
		b = a + b;// 10
		a = b - a;// 20

		System.out.println("After Swapping");
		System.out.println("a= " + a);
		System.out.println("b= " + b);

	}

}
