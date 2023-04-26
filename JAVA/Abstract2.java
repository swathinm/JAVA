interface A{
	void a();
	void b();
	void c();
	void d();
}
// abstract class B implements A{
		
// }

		
class M implements A{
	public void a(){System.out.println("h");}
	public void b(){System.out.println("hi");}
	public void d(){System.out.println("hii");}
	public void c(){
			System.out.println("Hi");
		}
}

class Test{
	public static void main(String[] args){
		A a=new M();
		a.a();
		a.b();
		a.c();
		a.d();
	}
}
			