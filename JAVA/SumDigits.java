class SumDigits{
	public static void main(String[] args){
		int n=123,a;
		int sum=0;
		
		while(n!=0){
		a=n%10;
		sum=sum+a;
		n = n/10;
		}
		System.out.println(sum);
	}
}

