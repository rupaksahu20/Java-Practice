package com.runner;

import com.google.threadclasses.GoogleFeatureThread;

public class GoogleTestRunner {

	public static void main(String[] args) {

		
		Thread t1=new GoogleFeatureThread("chrome thread", "chrome");
		
		System.out.println("Theads started....");
		
		t1.start();
		
		
		
	}

}
