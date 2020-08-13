/**
 * 
 */
package com.attra.batch5java;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author Rupak
 *
 */

//Write a program to print the day in Capital letter when you input the date as DD MM YYYY format

public class GetDay {

	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Enter the date in the following format[DD MM YYYY]:");
		int date = in.nextInt();
		int month = in.nextInt();
		int year = in.nextInt();
		Calendar cal = Calendar.getInstance();
		cal.set(cal.YEAR, year);
		cal.set(cal.MONTH, month - 1);
		cal.set(cal.DATE, date);
		switch (cal.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			System.out.println("The day is SUNDAY");
			break;
		case 2:
			System.out.println("The day is MONDAY");
			break;
		case 3:
			System.out.println("The day is TUESDAY");
			break;
		case 4:
			System.out.println("The day is WEDNESDAY");
			break;
		case 5:
			System.out.println("The day is THURSDAY");
			break;
		case 6:
			System.out.println("The day is FRIDAY");
			break;
		case 7:
			System.out.println("The day is SATURDAY");
			break;
		}

	}
		
	

}
