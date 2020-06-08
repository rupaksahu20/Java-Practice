package com.pratice;

public class MainMethodConcept {

	public static void main(String[] args) {

		System.out.println("Main Method");
		main(10);
		main(30, 20);
	}
	
	
	public static void main(int a) {

		System.out.println("Main Method");
		System.out.println(a);
	}
	
	public static void main(int a,int b) {

		System.out.println("Main Method");
		System.out.println(a + "  " + b);
	}



}
