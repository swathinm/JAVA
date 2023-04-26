import java.util.*;
class ThreeDigit{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		if(i>99&&i<=999){
			System.out.println("Three digit");
			
		}else{
			System.out.println("Not a three digit");
		}
	}
	
}