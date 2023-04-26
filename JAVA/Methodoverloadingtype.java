class MethodoverloadingType{
	void sum(int a,long b)
	{System.out.println(a+b);}
	void sum(int a,int b,int c)
	{System.out.println(a+b+c);}
}
class Test{
	public static void main(String[] args)
	{
		MethodoverloadingType m=new MethodoverloadingType();
		m.sum(10,10);
		m.sum(10,10,10);
	}
}