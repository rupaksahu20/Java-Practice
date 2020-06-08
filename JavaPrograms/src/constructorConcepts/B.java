package constructorConcepts;

public class B extends A {
	
	public B() {
		super();
	}

	public B(int i) {
		super(10);
	}
	
	public B(int i,int j) {
		super(10,20);
	}
	public static void main(String[] args) {
		B obj=new B();
		B obj1=new B(10);
		B obj2=new B(10,20);
		

	}

}
