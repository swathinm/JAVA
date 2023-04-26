// write a program to check if a number is multiple of 3 or not
import java.util.*;
class Ass2{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		if(i%3==0){
			System.out.println("Multiple");
		}
		else{
			System.out.println("not multiple");
		}
	}
}