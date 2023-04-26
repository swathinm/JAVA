class Prime{
	public static void main(String[] args)
	{
		int x=1;
		int count=0;
		
		for(int i=1;i<=x;i++){
				if(x%i==0){
				count++;
				//System.out.println(i);
			}
		}
		if (count>2){
			System.out.println("not prime");
		}else{
			System.out.println("prime");
		}
			
	}
}
		
		