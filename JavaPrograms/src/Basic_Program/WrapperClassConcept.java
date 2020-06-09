package Basic_Program;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		String s="100";
		System.out.println(s+20);
		
		//data conversion: String to int:
		int i=Integer.parseInt(s);
		System.out.println(i+20);

		//Integer ,Double ,Character ,Boolean
		
		//String to double conversion
		
		String s1="12.33";
		double d=Double.parseDouble(s1);
		System.out.println(d+10);
		
		//String to boolean
		
		String s2="true";
		boolean b=Boolean.parseBoolean(s2);
		System.out.println(b);
		
		//Integer to String conversion
		
		int j=200;
		System.out.println(j);
		
		String s3=String.valueOf(j);
		System.out.println(s3+20);
				
	}

}
