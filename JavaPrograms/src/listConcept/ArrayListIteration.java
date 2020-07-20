package listConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<String> cricketplayers = new ArrayList<String>();

		cricketplayers.add("Sachin Tendulkar");
		cricketplayers.add("Virat Koholi");
		cricketplayers.add("Rohit Sharma");
		cricketplayers.add("Ms Dhoni");
		cricketplayers.add("Rahul Dravid");

		// 1. traverse all the element using for each loop and lambda expression:

		// Using for each loop
		for (String str : cricketplayers) {
			System.out.println(str);
		}
		System.out.println("===============");
		// 2.using for loop

		for (int i = 0; i < cricketplayers.size(); i++) {
			System.out.println(cricketplayers.get(i));
		}

		System.out.println("===============");

		// 3. using lambda expression

		cricketplayers.forEach(names -> {
			System.out.println(names);
		});

		System.out.println("===============");

		// 4.using iterator
		Iterator<String> it = cricketplayers.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		// 5. using lambda and foreachRemaing() method
		System.out.println("===============");

		it = cricketplayers.iterator();
		it.forEachRemaining(names -> {
			System.out.println(names);
		});

		// 6. using a listiterator() to traverse in both the directions

		System.out.println("===============");

		ListIterator<String> name = cricketplayers.listIterator(cricketplayers.size());
		while (name.hasPrevious()) {
			String players = name.previous();
			System.out.println(players);
		}

	}

}
