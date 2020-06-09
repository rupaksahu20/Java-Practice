package singleTonPattern;

public class Singleton {

	// In OPP, a singleton class is a class that can have only one object(instance
	// of the class) at a time
	// How to design a singleton class
	// 1. Make constructor as private
	// 2. write a static method that has return type of object of this singleton
	// class(Lazy Initialization)
	//Difference between normal class and singleton class:
	//for normal class we use constructor  whereas for singleton class we use getInstance() method for instantiation.
	

	private static Singleton singleton_instance = null;
	public String str;

	private Singleton() {
		str = "Hey I am Using Singleton class patern";
	}

	public static Singleton getInstance() {
		if (singleton_instance == null)
			singleton_instance = new Singleton();
		return singleton_instance;
	}

	public static void main(String[] args) {
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();

		x.str = (x.str).toUpperCase();

		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

		z.str = (z.str).toLowerCase();

		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

	}

}
