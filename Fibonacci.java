import java.util.Scanner;
class Fibonacci{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=s.nextInt();
		
		int n1=0,n2=1,n3=0;
		
		while(n3<num)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		
		if(n3==num)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
}
		