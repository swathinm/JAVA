class Polymorphism{
	void run()
	{
		System.out.println("hi");
	}
	class Poly extends Polymorphism{
		void run()
		{
			System.out.println("hello");
		}
		public static void main(String[] args)
		{
			Polymorphism p=new Poly();
			p.run();
		}
	}