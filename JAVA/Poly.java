class Poly{
	void run(){System.out.println("hi");}
}
class Po extends Poly{
	void run()
	{System.out.println("hello");}
	public static void main(String[] args)
		{
			Poly p=new Po();
			p.run();
		}
	}
