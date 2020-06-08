package rbiInterfaceConcept;

public interface USBank {
	
	int min_bal=100;
	
	public void debit();
	
	public void credit();
	
	public void transferMoney();
	
	public void trading();
	
	
	//no method body,only method declaration
	//method prototype
	//can not create the object of interface
	//no static methods in interface
	//but interface vars are static in nature by default
	

}
