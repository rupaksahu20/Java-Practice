package abstractConcept;

public abstract class Bank {
	
	//partial abstraction
	//hiding the implementation logic -- is called abstraction
	//abs class have both abs methods and non abs methods
	//can not create the object of abstract class
	
	public abstract void loan(); //abstract method==no method body
	
	
	//non abstract methods
	public void credit() {
		System.out.println("Bank -- Credit");
	}
	
	public void debit() {
		System.out.println("Bank -- Debit");
	}

}
