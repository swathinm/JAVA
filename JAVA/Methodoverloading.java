class Methodoverloading{
	  static int add(int a,int b){
		  return a+b;
	  }
	 static int add(int a,int b,int c){
		 return a+b+c;
	 }
	 
	 static double add(double a,double b,double c){
		 return a+b+c;
	 }
	 
	
	 
class Test{
	public static void main(String[] args){
		System.out.println(Methodoverloading.add(10,10));
		System.out.println(Methodoverloading.add(10,10,20));
		System.out.println(Methodoverloading.add(10.1,10.1,20.1));
	}
}