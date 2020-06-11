package Basic_Program;

public class CallByValAndCallByRef {

	int p;
	int q;

	public static void main(String[] args) {

		CallByValAndCallByRef obj = new CallByValAndCallByRef();
		int x = 10;
		int y = 20;

		obj.testSum(x, y);// call by value or pass by value

		System.out.println(x);
		System.out.println(y);

		obj.p = 50;
		obj.q = 60;

		obj.swap(obj);
		// after swap
		System.out.println(obj.p);
		System.out.println(obj.q);

	}

	public void testSum(int x, int y) {
		x = 30;
		y = 40;
//		int c = a + b;
//		return c;
	}

	// call by reference
	public void swap(CallByValAndCallByRef t) {
		int temp;
		temp = t.p;// temp=50
		t.p = t.q;// t.p=60

	}

}
