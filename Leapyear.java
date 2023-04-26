class Leapyear{
	public static void main(String[] args)
	
	// Using if else
	/* {
		int i=2024;
		if(i%400==0){
			System.out.println("it is leap Year");
		}
		 else if((i%4==0)&&(i%100!=0))
		{
			System.out.println("it is a leaap year");
		} 
		else {
			System.out.println("Not a leap year");
		}
	} */
	
	// Using Ternary Operator
	
	{
		int i=2020;
		/* String j ;
		String k;
		if((i%400==0)?("yes"):("not "));
		{
			System.out.println(j);
		} */
		
		String j=(i%400==0)||(i%4==0)&&(i%100!=0)?("leap year"):("not ");
		if (j=="leap year")
		{
			System.out.println("it is a leap year");
		}else{
			System.out.println("it is not leap year");
		}
		
	}
		
		
}