interface Class{
	void print();
}
interface NewClass extends Class{
	void show();
}
class A implements NewClass
{
	public void print(){System.out.println("1");}
	public void show(){System.out.println("2");}
	
	public static void main(String[] args)
	{
		A a=new A();
		a.print();
		a.show();
	}
}
		