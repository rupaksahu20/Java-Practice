package com.pratice;

public class StaticArray {

	public static void main(String[] args) {

		//Limitation of aray:
		//1. Static Array:size is fixed To overcome this problem,we use Dynamic Array(ArrayList)
		//2.it stores only similar types of values: To overcome this problem:
		//a.use object Array--Static Array--size is fixed
		//b.ArrayList
		//1.int:
		
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[3]);
//		System.out.println(i[4]);// it will give ArrayIndexOutOfBoundsException
		//To check an Array Size
		System.out.println(i.length);//It will give Array Size
		
		//To print the entire Array in console using for loop
		for(int j=0;j<i.length; j++) {
			System.out.println(i[j]);
		}
		
		//2.Double:
		double d[]=new double[2];
		d[0]=34.45;
		d[1]=34.50;
		System.out.println(d[0]+d[1]);
		
		//Object Array
		Object ob[]=new Object[5];
		ob[0]=10;
		ob[1]="Tom";
		ob[2]='c';
		ob[3]=12.33;
		ob[4]=true;
		
		System.out.println(ob.length);
		
		for(int p=0;p<ob.length;p++) {
			System.out.println(ob[p]);
		}
		
		
	}

}
