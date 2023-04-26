class Palindrom{
	public static void main(String [] args)
	{
		int n=1012;
		int r=0;
		int rem;
		int temp;
		temp=n;
		
		while(temp!=0)
		{
			rem=temp%10;
			r=r*10+rem;
			temp /=10;
		}
		if(n==r)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println(" not palindrome");
		}
	}
}
			 