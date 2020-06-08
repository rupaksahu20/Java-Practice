package abstractConcept;

public class TestCar {

	public static void main(String[] args) {

		BMW b=new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftsafety();
		
		//Top casting--Child class object with parent class reference
		
	    Car c=new BMW();
	    
	    c.start();
	    c.stop();
	    c.refuel();
	    System.out.println(c.wheels);
		
		
	}

}
