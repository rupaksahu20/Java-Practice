package Basic_Program;

public class LocalVsGlobalVariable {
	
   static int a=10; //Global variable or class level variable
	int b=20;

	public static void main(String[] args) {
		int a=15; //Local variable
		int b=20;
		System.out.println(a);
		System.out.println(LocalVsGlobalVariable.a);
		LocalVsGlobalVariable obj=new LocalVsGlobalVariable();
		System.out.println(obj.b);
		sum();
		
		

	}
	
	
	public static  void sum() {
	String s ="rupak";
	System.out.println(s);
	}

}
