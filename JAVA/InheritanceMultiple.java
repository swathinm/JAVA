class InheritanceMultiple{
	int id=10;
}
class Child extends InheritanceMultiple{
	String name="Swathi";
}
class Subchild extends InheritanceMultiple,Child{
	float salary=10000;
	public static void main(String[] args){
		Subchild s=new Subchild();
		System.out.println(s.id);
		System.out.println(s.name);
	}
}