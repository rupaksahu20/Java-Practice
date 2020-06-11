package Basic_Program;

public class MethodOverLoadingChildClass extends MethodOverLoadingParentClass {

	public static void main(String[] args) {
		
//		MethodOverLoadingParentClass obj= new MethodOverLoadingChildClass();
//		obj.method1();
//		obj.method1(10);
//		obj.method1(10, "Rupak");
		
		MethodOverLoadingChildClass c=new MethodOverLoadingChildClass();
		c.method1(10, "Ruapk", "Sahu");
		
	}
	
	public void method1(double d) {
		
		System.out.println("0 param method " + d);
	}
	
	public void method1(String str,int j) {
		System.out.println("1 param method " + str+j);
		
	}
	
	public void method1(int a,String s,String s1) {
		System.out.println("3 params method " + a+s+s1);
		
	}
	
	

}
