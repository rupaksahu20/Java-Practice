package Basic_Program;

 class Rupak 
 {
	 	int x=10;
		int y=20;
		 public  void add()
		{
			int z=x+y;
			System.out.println(z);
		}
		public  void mul()
		{
			int t=x*y;
			System.out.println(t);
		}
		static class Surajj
		{
		 int p=40;
		 int q=40;
			public  void sub()
			{
	
				int r=p-q;
				System.out.println(r);
			}
			public void div()
			{	int s=p/q;
			    System.out.println(s);
			}
		}
		public static void main(String[] args)
		{
			Rupak rk=new Rupak();
			rk.add();
			rk.mul();
			
			Surajj sj= new Surajj();
			sj.sub();
			sj.div();
		}
}
