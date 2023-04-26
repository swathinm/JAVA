class Call{
	static int d=10;
	static void change(Call c){
		d=d+100;
	}
	public static void main(String[] args){
		Call c=new Call();
		System.out.println(c.d);
		c.change(c);
		System.out.println(c.d);
	}
}