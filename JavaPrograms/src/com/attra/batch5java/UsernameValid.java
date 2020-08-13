/**
 * 
 */
package com.attra.batch5java;

import java.util.regex.Pattern;

/**
 * @author Rupak
 *
 */
public class UsernameValid {

	public static boolean isValid(String name) {
		return Pattern.matches("^[aA-zZ][aA-zZ0-9_]{8,30}$", name);
	}

	public static void main(String[] args) {

		String[] username = { "Gsdas_5dew", "sqwe", "1grG_rytyty", "G2edddd_trr" };
		for (int i = 0; i < username.length; i++) {
			if (isValid(username[i])) {

				System.out.println("Entered user name:" + " " + username[i] + "is valid");

			} else {
				System.out.println("Entered user name:" + " " + username[i] + "is invalid");
			}
		}
	}

}


