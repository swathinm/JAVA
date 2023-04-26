class Bank{
	int getA(){
		return 0;
	}
}
class Sbi extends Bank{
	int getA(){
		return 1;
	}
}
class Icici extends Bank{
	int getA(){
		return 2;
	}
}
class Axis extends Bank{
	int getA(){
		return 3;
	}
}
class Test
	{
	public static void main(String[] args){
		Bank b;
		b=new Sbi();
		System.out.println(b.getA());
		b=new Icici();
		System.out.println(b.getA());
		b=new Axis();
		System.out.println(b.getA());
	}
}
		
		