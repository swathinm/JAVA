abstract class Abstrat1{
	public abstract void m1();
	Abstrat1(){System.out.println("Constructor");
	}
	public void m2(){
		System.out.println("non Abstract method");
	}
	int i=10;
}
class B extends Abstrat1{
	public void m1(){
		System.out.println("Abstart m1");
	}
}
class C{
	public static void main(String[] args){
		Abstrat1 obj =new B();
		obj.m1();
		obj.m2();
		System.out.println(obj.i);
	}
}