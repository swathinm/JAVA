package Package;
import Cartoon.*;
public class Two{
	public void m3(){
		System.out.println("M3");
	}
	public static void main(String[] args){
		Two obj1=new Two();
		One obj=new One();
		obj1.m3();
		obj.m1();
	}
}