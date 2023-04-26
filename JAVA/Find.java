 /* import java.util.Scanner;  
public class Find 
{  
public static void main (String args[])  
{  
//creating Scanner class object     
Scanner scan=new Scanner(System.in);  
System.out.print("Enter the number: ");  
//reading value from user  
int num=scan.nextInt();  
//method calling  
findEvenOdd(num);  
}  
//user defined method  
public static void findEvenOdd(int num)  
{  
//method body  
if(num%2==0)   
System.out.println(num+" is even");   
else   
System.out.println(num+" is odd");  
}  
}   */
/* public class Find   


{  
public static void main(String[] args)   
{  
int a = 19;  
int b = 5;  
//method calling  
int c = a+ b;   //a and b are actual parameters  
System.out.println("The sum of a and b is= " + c);  
}  
//user defined method  
// public static int add(int n1, int n2)   //n1 and n2 are formal parameters  
// {  
// int s;  
// s=n1+n2;  
// return s; //returning the sum  
// }  
}   */
/* class Find{
	public static void main(String[] args)
	{
		int i=2;
		int j=3;
		System.out.println(Math.max(i,j));
	}
} */

 /* class Find{
	public static void main(String[] args){
		int i=20;
		int j=10;
		int c=add(i,j);
		System.out.println(c);
	}
	 static int add(int a,int b){
	 int d;
	 d=a+b;
	 return d;
 }
}  */

 class Find{
	 int x=22;
	 public static void main(String[] args){
		Find f=new Find();
		evenodd(f.x);
		
	} 
	public static void evenodd(int a){
		if(a%2==0)
		{
			System.out.println("even");
		}
		else{
			System.out.println("odd");
		}
	}		
 }
	 
	 
