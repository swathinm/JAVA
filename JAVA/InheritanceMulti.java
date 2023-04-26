class InheritanceMulti{
	int id=1;
}
class Child extends InheritanceMulti{
	String name="Swathi";
}
class Subchild extends Child{
	float salary=10000;
	public static void main(String[] args){
		Subchild s=new Subchild();
		System.out.println(s.id);
		System.out.println(s.name);
		System.out.println(s.salary);
	}
}

