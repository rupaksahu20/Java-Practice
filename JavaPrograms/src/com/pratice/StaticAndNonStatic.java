package com.pratice;

public class StaticAndNonStatic {
	
	String name="Tom";
	static int age=25;

	public static void main(String[] args) {

		//How to call static vars and method
		//1.Direct calling
		getName();
		System.out.println(age);
		//2.call by class name
		StaticAndNonStatic.getName();
		System.out.println(StaticAndNonStatic.age);
		
		//for non static we have to always create object
		
		StaticAndNonStatic obj=new StaticAndNonStatic();
		obj.sendMail();
		System.out.println(obj.name);
		
	}

	public static void getName() {
		System.out.println("get name Method");
	}
	
	public void sendMail() {
		System.out.println("Send Mail method");
	}
}
