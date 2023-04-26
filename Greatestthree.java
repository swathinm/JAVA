class Greatestthree{
	public static void main(String[] args)
	{
		int i=10;
		int j=20;
		int k=30;
		if((i>=j)&&(i>=k))
		{
			System.out.println(i +": is greater" );
		}
		else if((j>=i)&&(j>=k))
		{
			System.out.println(j +": is greater");
		}
		else if((k>=i)&&(k>=j))
		{
			System.out.println(k +":is greater");
		}
	}
}
