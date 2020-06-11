package Basic_Program;

public class MethodOverLoadingParentClass {
	
	public void method1() {
	
		System.out.println("0 param method");
	}
	
	public void method1(int a) {
		System.out.println("1 param method " +a);
		
	}
	
	public void method1(int a,String s) {
		System.out.println("2 params method .." + a +" " +s);
		
		
	}
	

}
