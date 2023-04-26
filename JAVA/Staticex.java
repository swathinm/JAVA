class Staticex{
	static int x=10;
	int y=20;
	public static void main(String[] args)
	{
		Staticex s1=new Staticex();
		s1.x=888;
		s1.y=999;
		Staticex s2=new Staticex();
		System.out.println(s2.x+".."+s2.y);
	}
}
		