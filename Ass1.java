// write a program to check if a number is divisible by 7 or not
import java.util.*;
class Ass1{
	public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int i=s.nextInt();
	if(i%7==0){
		System.out.println("divisible");
	}
	else{
		System.out.println("not divisible");
	}
	}
}