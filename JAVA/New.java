import java.util.Scanner;
class New{
	public static void main(String[] args)
	{
		//int x=20;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int x =s.nextInt(); 
		check(x);
	}
	public static void check(int x){
		int count=0;
		
		for(int i=1;i<=x;i++){
			if(x%i==0){
				count++;
			}
		}
		
		if(count>2)
		{
			System.out.println("not prime");
		}
		else{
			System.out.println("prime");
		}
	}
}
