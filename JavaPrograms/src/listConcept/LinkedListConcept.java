package listConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		LinkedList<String> ll=new LinkedList<String>();
		
		//add:
		ll.add("Selenium");
		ll.add("Java");
		ll.add("QTP");
		ll.add("Oracle");
		
		System.out.println("Content of LinkedList " +ll);
		
		//addFirst:
		ll.addFirst("Rupak");
		//addLast:
		ll.addLast("Sahu");
		System.out.println("Content of LinkedList " + ll);
		//get:
		System.out.println(ll.get(0));
		//set:
		ll.set(0, "Automation");
		System.out.println(ll.get(0));
		
		//remove first and last element:
		
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println("Content of LinkedList " + ll);
		
		//remove an element from a specific element by index
		
		ll.remove(2);
		System.out.println("Content of LinkedList " + ll);
		
		//How to print all the values of LinkedList:
		//for loop
		System.out.println("**** Using for loop");
		
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		//advance for loop/for each loop
		
		System.out.println("**** using for each loop");
		for(String str:ll) {
			System.out.println(str);
		}
		
		//using Iterator
		System.out.println("**** using Iterator");
		
		Iterator<String> it=ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//using while loop
		System.out.println("**** Using while loop");
		int num=0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		
		
		
	}

}
