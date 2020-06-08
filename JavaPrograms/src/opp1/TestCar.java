package opp1;

public class TestCar {

	public static void main(String[] args) {

		BMW b=new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		
		//Top or Up casting:
	   Car c1=	new BMW(); //child class object can be referred by parent class ref variables
	   
	   c1.start();
	   c1.stop();
	   c1.refuel();
	   
	   //Down casting
	   BMW b1=(BMW) new Car();//ClassCastException will get while doing down casting
	   
		
	}

}
