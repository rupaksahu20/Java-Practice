package abstractclass;

public class Test extends Shape {
	
	 Test() {
		 System.out.println("test class constructor");
	}

	public static void main(String[] args) {

		Shape s=new Test();
		s.drawing();
		s.fill();
		
	}

	@Override
	void drawing() {

		System.out.println("Test -- drawing");
	}

}
