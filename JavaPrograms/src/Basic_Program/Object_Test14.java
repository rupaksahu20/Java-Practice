package Basic_Program;

public class Object_Test14
{

	public static void main(String[] args) {
		
       Account acc1=new Account();
       Account acc2=new Account();
       
       
       acc1.setAccount(101,"rupak",1000);
       acc2.setAccount(102,"suraj");
       
       acc1.printAccount();
       acc2.printAccount();
	}

}
