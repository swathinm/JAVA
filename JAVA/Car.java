 abstract class Bike{
	abstract void run();
}
	
class Car extends Bike{
	void run(){
		System.out.println("HI");
	}
	public static void main(String[] args)
		{
			Bike b=new Car();
			b.run();
		}
	}