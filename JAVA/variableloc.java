class Variableloc{
	public static void main(String[] args)
	
	//without intializing
	/* {
		int x;
		System.out.println(x);
	}*/  // output error:value not intialized
	
	
	// without intializing
	/*{
		int x;
		System.out.println("Hello");
	}*/ // output:Hello
	
	
	
	// without intializing
	/*{
		int x;
		if(args.length>0)
		{
			x=10;
		}
		
		System.out.println(x);
	}*/ // output:error:value not intialized
	
	// without intializing runs
	{
		int x;
		if(args.length>0)
		{
			x=10;
		}
		else
		{
			x=20;
		}
		System.out.println(x);
	}
		
} // output:20
	
	
	
	
	
	
	
	
	
	
	
