package abstractConcept;

public interface Car {
	
	
	//Always define only abstract methods
	//No method body
	//only method declaration
	//we achieve 100 % abstraction
	//can not create the object of interface
	//In interface variables are by default final and static
	
	int wheels=4;

	
	public void start();
	public void stop();
	public void refuel();
	
	
	

}
