class Reversefor{
	public static  void main(String[] args)
	{
		int i=12345;
		int r=0;
		int rem;
		
		for(;i!=0;i=i/10)
		{
			rem=i%10;
			r=r*10+rem;
		}
		
		System.out.println(r);
	}
}
		