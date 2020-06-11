package Basic_Program;

public class FinallyConcept {

	public static void main(String[] args) {
		// test1();
//		test2();
		division();

	}

	// Finally block will execute whether exception will come or not
	//Finally is a block

	public static void test1() {
		try {
			System.out.println("Inside test1 method");
			throw new RuntimeException("test");

		} catch (java.lang.Exception ex) {
			System.out.println("inside catch block");
		}

		finally {
			System.out.println("inside finally block");
		}
	}

	public static void test2() {
		try {
			System.out.println("inside test2");
		} finally {
			System.out.println("finally code inside test2 method");
		}
	}

	public static void division() {
		int i = 10;
		try {
			System.out.println("inside try block");
			int k = i / 0;
		} catch (ArithmeticException e) {
			System.out.println("inside catch block");
			System.out.println("devide by zero error");
		}

		finally {
			System.out.println("execute this code even after any exception");
		}
	}

}
