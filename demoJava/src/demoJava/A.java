package demoJava;

public class A  {
	public static void main(String[] args) {
		int x=new I1()
		{
			public int m2()
			{
				System.out.println("ann");
				return 10;
			}
		}.m2();
		System.out.println(x);
	}

}
