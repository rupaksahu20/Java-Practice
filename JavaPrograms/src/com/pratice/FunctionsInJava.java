package com.pratice;

import java.util.ArrayList;

public class FunctionsInJava {

	public static void main(String[] args) {

		FunctionsInJava obj=new FunctionsInJava();
		obj.test();
		
		int add=obj.sum();
		System.out.println(add);
		
		String name=obj.getName();
		System.out.println(name);
		
		int div=obj.division(90, 18);
		System.out.println(div);
		
		String all=obj.concatString("Rupak", "Kumar", 10, 20);
		System.out.println(all);
		
		int ar[]=obj.getNumbers(20, 30, 40);
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		
		ArrayList<String> str =obj.getStudentLists("Rupak", "Suraj", "Debasis");
		System.out.println(str);
		
		
	}
	
	//can not create a function inside a function
	//Functions are independent to each
	
	//Two types of function:
	//1.System defined
	//2.user defined
	//use defined functions are below types
	//2.a:no ip and no op
	//2.b:no ip but some op
	//2.c: some ip some op
	
	
	//Method Overloading:Within the class  number of function are there having same method name
	//but different numbers of params or different types of params
	
	//2.a:no ip and no op
	//void -can not return anything
	public void test() { //0 param
		System.out.println("Test Method");
	}
	
	
	//2.b:no ip but some op
	
	public int sum() {
		System.out.println("SUM Method");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	
	public String getName() {
		System.out.println("Get name Method");
		String name="Tom";
		return name;
	}
	
	//2.c: some ip some op
	public int division(int x,int y) {
		System.out.println("Division Method");
		int z=x/y;
		return z;
	}
	
	public String concatString(String x,String y,int a,int b) {
		System.out.println("Concat String method");
		String con=x+y+a+b;
		return con;
	}
	
	public int[] getNumbers(int a,int b,int c) {
		System.out.println("get numbers");
		int arr[]=new int[3];
		arr[0]=a;
		arr[1]=b;
		arr[2]=c;
		
		return arr;
	}
	
	public ArrayList<String> getStudentLists(String s1,String s2,String s3) {
		System.out.println("Get Student Lists");
		ArrayList<String> ar=new ArrayList<String>();
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		return ar;
		
	}
	
	

}
