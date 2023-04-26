 abstract class Abstrat{
	public abstract void m1();
}
class B extends Abstrat{
	public void m1(){
		System.out.println("m1-method");
	}
}
class Test{
	public static void main(String[] args){
			 B obj=new B();
			 obj.m1();
			 
	}
}
	