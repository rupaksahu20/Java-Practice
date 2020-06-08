package com.pratice;

public class StringManipulationMethods {

	public static void main(String[] args) {

		String str="This is my java code";
		String str1="This is My java code";
		System.out.println(str.length());//to check the length of the String
		System.out.println(str.charAt(2));//it will give the character of the particular index
		System.out.println(str.indexOf("s"));//1st occurrence of s
		System.out.println(str.indexOf("s", str.indexOf("s")+1));//2nd occurrence of s
		System.out.println(str.indexOf("java"));
		System.out.println(str.indexOf("hello"));
		
		//replace:
		String date="01-01-2020";//01/01/2020
		System.out.println(date.replace("-", "/"));
		//trim
		String t="           Hello world                   ";
		System.out.println(t.trim());//This trim() method will remove only the left hand and right hand space,it will not remove the middle space between two word
		System.out.println(t.trim().replace(" ", ""));
		
		//equals
		System.out.println(str==str1);
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		
		//upper and lower case:
		String s1="Hello Automation Tester";
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		
		//sub string
		String s2="My transaction id is 345672";
		System.out.println(s2.substring(21, s2.length()));
		System.out.println(s2.substring(3, 14));
		System.out.println(s2.substring(3));
		
		//split:
		String tr="Hello_World_Selenium_test";
		String arr[]=tr.split("_");
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		String tr1="ABcxTestXxPOMxXx";
	    String arr1[]=tr1.split("x");
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		
		
	}

}
