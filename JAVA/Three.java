package Package;
//import Cartoon.*;
public class Three{
	public void m3(){
		System.out.println("m3");
	}
	public static void main(String[] args){
		One obj=new One();
		obj.m1();
		Three obj1=new Three();
		obj1.m3();
	}
}