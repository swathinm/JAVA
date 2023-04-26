class MethodoverloadingType1{
	void sum(int a, int b)
	{
		System.out.println("Method invoked");
	}
	void sum(long a,long b)
	{
		System .out.println("long method invoked");
	}
}
class Test{
	public static void main(String[] args)
	{
		MethodoverloadingType1 m= new MethodoverloadingType1();
		m.sum(20,20);
		//m.sum(10.1,10.1);  // error occurs
		m.sum(20L,20L);
	}
	
}