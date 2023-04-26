class Greatest{
	public static void main(String[] args)
	// Using if-else
	/* {
		int i=10;
		int j=10;
		if(i==j)
		{
			System.out.println("both are equal");
		}
		else if(i>j)
		{
			System.out.println(i +":is graeter ");
		}
		else{
			System.out.println(j +":is greater");
		}
	} */
	
	// Using Ternary Operator
	
	/* {
		int i=20;
		int j=20;

		if(i==j)
		{
			System.out.println("both are equal");
		}
		else{
			String s=(i>j)?("i is graeter"):("j is greater");
			System.out.println(s);
		}
	} */
	
	// Using Max function
	{
		int i=30;
		int j=20;
		if(i==j)
		{
			System.out.println("both are equal");
		}
		else{
			System.out.println(Math.max(i,j)+"is greater");
		}
	}
}