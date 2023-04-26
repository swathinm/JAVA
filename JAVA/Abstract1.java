abstract class Hello{
	Hello(){
		System.out.println("Hello");
	};
	abstract void run();
	void iou(){
		System.out.println("Hi");
	}
}
	
class A extends Hello{
	void run(){System.out.println("Hiii");}
		
	public static void main(String[] args){
		
		Hello a=new A();
		a.run();
		a.iou();
	}
}
		
	