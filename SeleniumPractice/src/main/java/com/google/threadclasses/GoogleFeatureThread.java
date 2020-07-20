package com.google.threadclasses;

import com.pages.GooglePage;

public class GoogleFeatureThread extends Thread{
	
	public String browserName;
	GooglePage googlepage;
	
	public GoogleFeatureThread(String threadName,String browserName) {
		super(threadName);
		this.browserName=browserName;
		googlepage=new GooglePage();
		
	}
	
	public void run() {
		System.out.println("thread -- started " + Thread.currentThread().getName());
		
		
		try {
			Thread.sleep(1000);
			googlepage.setUp(this.browserName);
			googlepage.googleSearchTest();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			googlepage.tearDown();
		}
		
		System.out.println("thread - ended " + Thread.currentThread().getName());
		
	}
	

}
