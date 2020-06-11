/**
 * 
 */
package com.logicalProgramForInterview;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Rupak
 *
 */
public class ReverseString_At_ItsOwn_Place {

	public static void main(String[] args) {

		
		System.out.println(stringReverse("HELLO WORLD").toString().replace("[", "").replace("]", "").replaceAll(",", ""));

	}

	public static List<String> stringReverse(String str) {

		String orgStr = "";
		List<String> list = new ArrayList<>();
		String[] strArr = str.split(" ");

		for (int a = 0; a <= strArr.length - 1; a++) {

			orgStr = reverse(a, strArr[a]);
			list.add(orgStr);
		}

		return list;
	}

	public static String reverse(int index, String str) {

		String revStr = "";
		for (int b = str.length() - 1; b >= 0; b--) {

			revStr = revStr + str.charAt(b);
		}
		return revStr;
	}

}
