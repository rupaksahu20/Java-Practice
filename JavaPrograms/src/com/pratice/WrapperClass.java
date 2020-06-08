package com.pratice;

public class WrapperClass {

	public static void main(String[] args) {

		//String to int:
		String x="100";
		System.out.println(x+20);
		int i=Integer.parseInt(x);
		System.out.println(i+20);
		
		String price="1000";
		System.out.println(Integer.parseInt(price)+200);
		
		String str="This is my java code";
		System.out.println(str.indexOf("i"));
		
//		String str1="100test";
//		int p=Integer.parseInt(str1);//NumberFormatException
		
		
		//String to double:
		String y="12.33";
		System.out.println(y+20);
		
		double d=Double.parseDouble(y);
		System.out.println(d+20);
		
		int p=100;
		System.out.println(p+20);
		
		String s1=String .valueOf(p);
		System.out.println(s1+20);
		
		
	}

}
