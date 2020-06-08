package Basic_Program;

public class Account 
{
	 
	private int accno;
	private String name;
	private float balance;
	
	void setAccount(int accno,String name)
	{
		this.accno=accno;
		this.name=name;
		
		
	}
	void setAccount(int accno,String name,float balance)
	{
		setAccount(accno,name);
		this.balance=balance;
	}
	void printAccount()
	{
		System.out.println(accno);
		System.out.println(name);
		System.out.println(balance);
		
		
	}

}
