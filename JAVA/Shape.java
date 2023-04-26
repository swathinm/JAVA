class Shape{
	void draw()
	{
		System.out.println("draw");
	}
}
class Rectangle extends Shape{
	void draw(){
		System.out.println("Rect");
	}
}
class Circle  extends Shape{
	void draw(){
		System.out.println("Circle");
	
	 }
}
class Test{ 
	public static void main(String[] args)
	{
		Shape s,s2;
		
		s=new Rectangle();
		
		s2=new Circle();
		s.draw();
		s2.draw();
	}
}