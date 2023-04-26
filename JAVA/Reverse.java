class Reverse {
	public static void main(String[] args)
	{	
		int n=1234;
		int r=0;
		int rem;
		
		while(n!=0)
		{
			rem=n%10;
			r=r*10+rem;
			n /= 10;
		}
		
		System.out.println(r);
	}
}