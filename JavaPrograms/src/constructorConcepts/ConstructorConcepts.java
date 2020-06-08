package constructorConcepts;

public class ConstructorConcepts {
	
	public ConstructorConcepts() {
		System.out.println("Default const");
	}
	
	public ConstructorConcepts(int i) {
		System.out.println("Single param Const");
		System.out.println("The value i is " + i);
	}
	
	public ConstructorConcepts(int i,int j) {
		System.out.println("Two params const");
		System.out.println("The Value of i is " + i);
		System.out.println("The Value of j is " + j);
	}
	

	public static void main(String[] args) {

		ConstructorConcepts obj=new ConstructorConcepts();
		ConstructorConcepts obj1=new ConstructorConcepts(10);
		ConstructorConcepts obj2=new ConstructorConcepts(10,20);


		
		
	}

}
