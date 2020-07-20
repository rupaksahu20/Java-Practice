/**
 * 
 */
package listConcept;

import java.util.HashMap;

/**
 * @author Rupak
 *
 */
public class HashMapConcept {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// HashMap is a class implements Map interface
		// extends AbstractMap
		// it contains only unique elements
		// stores the values -key -value pair
		// it may have one null key and multiple null values
		// it maintains no order
		// HashMap is non-Synchronised -not thread safe

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "Rupak");
		hm.put(2, "Suraj");
		hm.put(3, "Debasis");

		System.out.println(hm.get(1));
		System.out.println(hm.get(4));

		// We can traverse the value from HashMap using entrySet

		for (java.util.Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}

		System.out.println(hm);
		hm.remove(3);
		System.out.println(hm);

		HashMap<Integer, OfcEmployee> emp = new HashMap<Integer, OfcEmployee>();

		OfcEmployee e1 = new OfcEmployee("Rupak", 28, "QA");
		OfcEmployee e2 = new OfcEmployee("Debasis", 30, "Dev");
		OfcEmployee e3 = new OfcEmployee("Suraj", 31, "Admin");
		OfcEmployee e4 = new OfcEmployee("Suraj", 31, "Admin");

		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);
		emp.put(4, e4);

		// traverse the Hashmap

		for (java.util.Map.Entry<Integer, OfcEmployee> m : emp.entrySet()) {
			int key = m.getKey();
			OfcEmployee e = m.getValue();
			System.out.println(key + "Info");
			System.out.println(e.name + " " + e.age + " " + e.dept);

		}

	}

}
