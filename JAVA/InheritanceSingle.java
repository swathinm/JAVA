class InheritanceSingle{
	String name="Swathi";
}
class Child extends InheritanceSingle{
	float salary=10000;

	public static void main(String[] args){
		Child c=new Child();
		System.out.println(c.name);
		System.out.println(c.salary);
	}
}