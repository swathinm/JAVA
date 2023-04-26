class Variable{
	int data=10;
	static int a=20;
	public static void main(String[] args){
		int b=30;
		
		Variable obj=new Variable();
		System.out.println(obj.data);
		System.out.println(a);
		System.out.println(b);
	}
}