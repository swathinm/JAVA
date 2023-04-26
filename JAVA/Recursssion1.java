class Recursssion1{
	static int count=0;
	static void Method(){
		
		count++;
		if(count<=5){
		System.out.println("hello");
		Method();
		}
	}
	public static void main(String[] args){
		Method();
	}
}