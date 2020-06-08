package shreyansh_program;

public class EqualsDemo 
{
	public static void main(String[] args) {                         //Differnce between == and equals() method in java
		

		/*String s=new String("Rupak");
		String s1=new String("Rupak");                                  ==>Equals method is used for content comparison whereas == operator is used for reference comparison.
		
		System.out.println(s==s1); //False                              ==>In case of == operator if we compare incompatible types it will throw compile time error whereas in case of equlas method it will return false.

		System.out.println(s.equals(s1)); //True
		*/                                                           //   ==>If we compare two null values using == operator it will return true,whereas in case of equals method it will throw NPE.
		
		/*String s=new String("Rupak");
		StringBuffer sb=new StringBuffer("Rupak");
		
		//System.out.println(s==sb); CTE
		System.out.println(s.equals(sb));//False
		*/
		
		/*String s=null;
		System.out.println(s==null);//True
		System.out.println(s.equals(null));
		*/
		/*String s1=new String("rupak");
		String s2=new String("rupak");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));*/
		
		String s1="10";
		String s2="111";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
	}
	

}
