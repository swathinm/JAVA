class MethodoverloadingType2{
	void sum(int a,long b)
	{
		System.out.println("Method invoked"+" "+a+" " +b);
	}
	void sum(long a,long b){
		System.out.println("long method invoked"+" "+a+" " +b);
	}
}
class Test{
	public static void main(String[] args)
	{
		MethodoverloadingType2 m=new MethodoverloadingType2();
		m.sum(10,90);
		m.sum(10L,80L);
		//m.sum(10L,10L);
	}
}