package listConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {

		// It is similar to hashmap,but its synchronised.
		// stores the value on the basis of key-val
		// Key--> Object--HashCode -->value

		Hashtable h1 = new Hashtable();
		h1.put(1, "Rupak");
		h1.put(2, "Deb");
		h1.put(3, "Suraj");

		// Create a clone copy or shallow copy:

		Hashtable h2 = new Hashtable();

		h2 = (Hashtable) h1.clone();

		System.out.println("the Values from h1 " + h1);
		System.out.println("the Values from h2 " + h2);

		h1.clear();

		System.out.println("the Values from h1 " + h1);
		System.out.println("the Values from h2 " + h2);

		// contains values
		Hashtable ht = new Hashtable();

		ht.put("A", "Bhubaneswar");
		ht.put("B", "Baripada");
		ht.put("C", "Bangalore");
		ht.put("C", "Bangalore"); //It contains only unique values
		
		//no null key or null values

		if (ht.containsValue("Bangaore")) {
			System.out.println("Value is found.....");

		} else {
			System.out.println("Value is not found.....");
		}

		// print all the from hashtable using --Enumaration --elementsO;

		Enumeration e = ht.elements();
		System.out.println("Print values from ht");

		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		System.out.println(ht);

		// get all the values from hashtable using --entrySet()--set of hashtable
		// values:
		System.out.println("print values from ht using entry set");
		Set s = ht.entrySet();
		System.out.println(s);

		Hashtable ht1 = new Hashtable();

		ht1.put("A", "Bhubaneswar");
		ht1.put("B", "Baripada");
		ht1.put("C", "Bangalore");
		// check both the Hashtable are equal or not:
		if (ht.equals(ht1)) {
			System.out.println("Both The Hashtable are equal");
		} else {
			System.out.println("Both are Different Hashtable");
		}
		
		//get the value from a key
		System.out.println(ht1.get("A"));
		
		//get the hashcode of a Hashtable object:
		System.out.println("The hashcode value of ht1: " + ht1.hashCode());

	}

}
