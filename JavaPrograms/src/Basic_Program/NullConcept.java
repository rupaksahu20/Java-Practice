package Basic_Program;

public class NullConcept {
	
	static Object obj;
	static String str;
	static NullConcept nc;
	

	public static void main(String[] args) {
		//1.case sensitive
//		Object obj=null;
		
		//2.default reference value will be null
		
		System.out.println(obj);
		System.out.println(str);
		System.out.println(nc);
		
		
		//3.
//		Integer i=null;
//		int j=i;
//		System.out.println(j);//Here we will get NullPointerException
		
		//4. instanceof
		Integer i=null;
		Integer j=10;
		
		System.out.println(j instanceof Integer);//true
		System.out.println(i instanceof Integer);//false ---- because i is null
		
		//static vs	non static
		NullConcept obj= null;
//		obj.send();
		obj.sum();
		
		//5. == and !=
		System.out.println(null==null);
		System.out.println(null!=null);
		
		//6.
		String str=null;
		Integer i1=null;
		Double d1= null;
		
		String s1=(String)null;
		System.out.println(s1 + 100);
//		System.out.println(s1.length());  //NullPointerException
//		System.out.println(s1.charAt(0)); //NullPointerException
		
		Integer i2=(Integer)null;
		Double d2=(Double)null;
		
	

	}
	
	public static void sum() {
		System.out.println("sum ....");
	}
	
	public void send() {
		System.out.println("send ....");
	}

}
