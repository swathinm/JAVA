  class Forloop{
	public static void main(String[] args)
	{ 	
		
		 for (int i=0;i<=10;i=i++){
		for(int i=0;i%=2;i++)
			System.out.println(i);
		} 
			
			 /* int j=20;
			for(int i=0;i<=j/2;i++){
					System.out.println("the given is prime:"+j);
			}  */
		
	}
}  
/* public class Forloop {

  public static void main(String[] args) {

    int num = 29;
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}
 */
 /* public class Forloop{
  public static void main(String[] args) {

  int num = 20, count;

  for (int i = 1; i <= num; i++) {
   count = 0;
   for (int j = 2; j <= i / 2; j++) {
    if (i % j == 0) {
     count++;
     break;
    }
   }

   if (count == 0) {
    System.out.println(i);
   }

  }
 }
}
 */
 
/* class Forloop{
	public static void main(String[] args)
	{
		for(int i=0;i<=10;i++)
		{
 			 for(int j=0;j<=10-i;j++){
				System.out.print(" ");
			}  
		for (int s=0;s<=i*2-1;s++){
			System.out.print("*");
		}
			
		
			System.out.println();
		}
		
	}
}
		 */	
		
		
 
 