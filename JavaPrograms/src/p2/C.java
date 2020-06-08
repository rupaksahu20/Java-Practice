package p2;

import p1.A;

public class C extends A {

	public static void main(String[] args) {
		A a = new A();

		System.out.println("a:" + a.d);
		C c1 = new C();
		System.out.println("c:" + c1.c);
		System.out.println("d:" + c1.d);

	}

}
