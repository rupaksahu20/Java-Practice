package rbiInterfaceConcept;

public class ICICIBank implements USBank,RBI {

	//RBI Interface overridden method
	@Override
	public void educationLoan() {
		System.out.println("icici -- edu Loan");
		
	}

	@Override
	public void homeLoan() {

		System.out.println("icici -- homeLoan");
	}

	@Override
	public void carLoan() {

		System.out.println("icici -- car loan");
	}

	//UsBank interface Overridden method
	@Override
	public void debit() {

		System.out.println("icici -- debit");
	}

	@Override
	public void credit() {

		System.out.println("icici -- credit");
	}

	@Override
	public void transferMoney() {

		System.out.println("icici -- tarnsfermoney");
	}

	@Override
	public void trading() {

		System.out.println("icici -- trading");
	}
	
	//ICICI bank class methods:
	
	public void mutualFunds() {
		System.out.println("icici -- mutual funds");
	}
	
	public void insurance() {
		System.out.println("icici -- insurance");
	}
	

}
