class Whileprime{
	public static void main(String[] args)
	{
		int x=7;
		int count=0;
		int i=2;
		while(i<x){
		
			if(x%i==0){
				count++;
			}
				i++;
		}
		if(count==2)
		{
			System.out.println("not prime");
		}else{
			System.out.println(" prime");
		}
		
	}
}