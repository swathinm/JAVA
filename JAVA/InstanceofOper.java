class Student{
}
class Teacher{
}
class InstanceofOper{
	public static void main(String[] args) throws Exception
	{
		Object ob=Class.forName(args[0]).newInstance();
		System.out.println(ob.getClass().getName()+"aaa");
	}
}
		