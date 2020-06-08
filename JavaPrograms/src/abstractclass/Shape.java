package abstractclass;

public abstract class Shape {
	Shape(){
		System.out.println("Shape class constructor");
	}
	
	int colour;
	
	abstract void drawing();
	
	public void fill() {
		System.out.println("Shape -- fill");
	}

}
