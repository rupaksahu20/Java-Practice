package listConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {

		
		int a[]=new int[3];//static Array -- size is fixed
		
		//Dynamic array--ArrayList:
		//1.can contain duplicate values/elements
		//2. maintain insertion order
		//3.Synchronized(Performance wise slow as compare to static array)
		//4. allows random access to fetch the element because it stores the values on the basis of indexes
		
		ArrayList ar=new ArrayList();
		
		ar.add(10);//0
		ar.add(20);//1
		ar.add(30);//2
		
		System.out.println(ar.size());
		
		ar.add(40);//3
		ar.add(50);//4
		ar.add(60);//5
		ar.add("Test");
		ar.add(true);
		ar.add(12.33);
		ar.add('c');
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));//to get the value from an index 
		
		//to print all the values from arraylist:
		//1.for loop
		//2. using iterator
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		
		//non generic Vs generic:
		ArrayList<Integer>ar1=new ArrayList<Integer>();
		ar1.add(100);
		
		ArrayList<String>ar2=new ArrayList<String>();
		ar2.add("Selenium");
		
		ArrayList<Object> ar3=new ArrayList<Object>();
		ar3.add(200);
		ar3.add("Java Selenium");
		ar3.add(true);
		ar3.add('c');
		
		//Employee Class Object
		Employee e1=new Employee("Rupak", 28, "QA");
		Employee e2=new Employee("Suraj", 30, "Dev");
		Employee e3=new Employee("Debasis", 29, "IT");
		
		ArrayList<Employee> ar4=new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//iterator to traverse the values:
		Iterator<Employee> it=ar4.iterator();
		while(it.hasNext()) {
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
				
		
		System.out.println("===================");
		//=============================
		
		//addAll()
		ArrayList<String> ar5=new ArrayList<String>();
		ar5.add("ABC");
		ar5.add("XYZ");
		ar5.add("PQR");
		
		
		ArrayList<String> ar6=new ArrayList<String>();
		ar6.add("ABCDE");
		ar6.add("XYZMNO");
		ar6.add("PQRSTU");
		
		ar5.addAll(ar6);
		
		for(int i=0;i<ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		
		//removeAll()
		ar5.removeAll(ar6);
		System.out.println("===================");
		
		for(int i=0;i<ar5.size(); i++) {
			System.out.println(ar5.get(i));
		}
		
		//retainAll --It will give the common value
		System.out.println("===================");
		
		ArrayList<String> ar7=new ArrayList<String>();
		ar7.add("ABC");
		ar7.add("XYZ");
		ar7.add("PQR");
		
		
		ArrayList<String> ar8=new ArrayList<String>();
		ar8.add("ABC");
		ar8.add("XYZMNO");
		ar8.add("PQRSTU");
		
		ar7.retainAll(ar8);
		for(int i=0;i <ar7.size();i++) {
			System.out.println(ar7.get(i));
		}
		
		
				
		
		
		
	}

}
