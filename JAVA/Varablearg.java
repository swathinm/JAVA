/*class Varablearg{
	public static void m1(int... x)
	{
		System.out.println("var-arg method"));
	}
	public static void main(String[] args)
	{
		m1();
		m1(10);
		m1(10,20);
	}
}*/

// out-put= var-arg method
//			var-arg method
//  		var-arg method

/*class Varablearg{
	public static void m1(int... x)
	{
		System.out.println(x.length));
	}
	public static void main(String[] args)
	{
		m1();
		m1(10);
		m1(10,20);
	}
}*/

// output= 0
//		   1
//		   2


class Varablearg{
	public static void sum(int... x)
	{
		int total=0;
		for(int x1:x)
		{
			total=total+x1;
		}
		System.out.println(total);
	}
	public static void main(String[] args)
	{
		sum();
		sum(10,20);
		sum(10,20,30);
		sum(10,20,30,40);
	}
