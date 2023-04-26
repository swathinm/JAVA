// STATIC VARIABLE
class Variablestat{
	static int c=10;
	// without assigning values
	static int x;
	static double d;
	static String s;
	
	public static void main(String[] args)
	{
		Variablestat v=new Variablestat();
		System.out.println(v.c);
		System.out.println(Variablestat.c);
		System.out.println(c);
		System.out.println(x);
		System.out.println(d);
		System.out.println(s);
		
		
	}
	public void m1()
	{
		System.out.println(c);
	}
}