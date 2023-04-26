interface A{
	void draw();
	static int n(){
		for(int i=1;i<=10;i++){
			//System.out.println(i*3);
			return i*2;
		}
		
	}
}
class Rectangle implements A{
	public void draw(){
		System.out.println("hi");
	}
}
class Test{
	public static void main(String[] args){
		A a=new Rectangle();
		a.draw();
		System.out.println(A.n());
	}
}
	
	