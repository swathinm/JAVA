class Call{
	int d=50;
	
	void change(int d){
		d=d+100;
	}
	public static void main(String[] args)
	{
		Call c=new Call();
		
		System.out.println(c.d);
		c.change(100);
		System.out.println(c.d);
		
	}
}