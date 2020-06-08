package com.pratice;

import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {

		ArrayList ar=new ArrayList();
		
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		System.out.println(ar.size());//3
		
		ar.add(400);
		ar.add(500);
		ar.add("Rupak");
		ar.add('c');
		ar.add(12.33);	
		ar.add(true);
		
		System.out.println(ar.size());//5
		System.out.println(ar.get(4));//500
//		System.out.println(ar.get(5));//IndexOutOfBoundsException
		
		ar.remove(4);
		System.out.println(ar.size());
		
		//Get All the value from ArrayList using for loop
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		
		ArrayList<Double> ar2=new ArrayList<Double>();
		
		ArrayList<String> ar3=new ArrayList<String>();
		ar1.add(100);
		System.out.println(ar1.get(0));
		
		System.out.println(ar);
		System.out.println(ar1.isEmpty());
		System.out.println(ar2.isEmpty());
	}

}
