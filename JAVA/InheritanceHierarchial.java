class InheritanceHierarchial{
	int id=10;
}
class child extends InheritanceHierarchial{
	String name="Swathi";
}
class Subchild extends InheritanceHierarchial{
	float salary=100;
	public static void main(String[] args)
	{
		Subchild s=new Subchild();
		System.out.println(s.id);
		//System.out.println(s.name);
		System.out.println(s.salary);
	}
}		

		