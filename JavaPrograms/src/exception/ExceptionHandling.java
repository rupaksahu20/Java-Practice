package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling {

	public static void main(String[] args) {

		//caught Exception
//		Thread.sleep(1000);
		
		//un-caught exception
//		int i=9/0;
//		System.out.println(i);
//		
		//1.try-catch:
		/*try {
			int i = 9 / 0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}*/
		
	/*	try {
			FileInputStream ip=new FileInputStream("C:\\Users\\Rupak\\Desktop\\original.xlsx");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}*/
		System.out.println("ABC");
		System.out.println("ABC");
		
		int j[]=new int[2];
		try {
		int i=9/0;
		System.out.println("Test");
		System.out.println("Test");
		System.out.println(j[3]);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");
		System.out.println("ABC");
		
	}

}
