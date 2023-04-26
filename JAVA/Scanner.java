import java.util.Scanner;
class Scanner{
	public static void main(String[] args)
	{
		//int x=20;
		
		Scanner s=new Scanner(System.in);
		int num =s.nextInt(); 
		System.out.println("Enter the number:");
		check(num);
	}
	public static void check(int num){
		int count=0;
		
		for(int i=1;i<=num;i++){
			if(num%i==0){
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
