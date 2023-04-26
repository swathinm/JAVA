class Aggregation{
	int square(int n){
		return n*n;
	}
}
class Circle{
	Aggregation a;
	double pi=3.14;
	
	double area(int radius){
		a=new Aggregation();
		int rsquare=a.square(radius);
		return pi*rsquare;
	}
	
	public static void main(String[] args){
		Circle c=new Circle();
		double result=c.area(6);
		System.out.println(result);
	}
}