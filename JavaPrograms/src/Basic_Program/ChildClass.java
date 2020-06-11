package Basic_Program;

public class ChildClass extends ParentClass {
     
	
	//We can not override a static method in child class
	
	public static void hidingMethod() {
		System.out.println("Child class method");

	}

	public static void main(String[] args) {

		 ChildClass.hidingMethod();
		 ParentClass.hidingMethod();

	}

}
