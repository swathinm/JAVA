interface A{
	void Show();
	class B{
		public void Show(){System.out.println("hi");}
	}
}
class C extends A.B{
	
	public static void main(String[] args){
		A.B c=new C();
		c.Show();
		
	}
}