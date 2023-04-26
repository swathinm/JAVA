class Student{
	int x=10;
	System.out.println(x);
}
class Customer{
}
class Instanceof{
	public static void main(String[] args)throws Exception
	{
		Object o=Class.forName(args[0]).newInstance();
		System.out.println("Object created for:"+o.getClass().getName());
	}
}