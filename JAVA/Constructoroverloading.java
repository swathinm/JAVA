class Constructoroverloading{
	int id;
	String name;
	
	Constructoroverloading(int i,String name,int age){
		id=i;
		name=name;
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
	}
	
	public static void main(String[] args)
	{
		Constructoroverloading c=new Constructoroverloading(10,"Swathi",21);
	}
}