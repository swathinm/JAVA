class Datamember{
	int a=1000;
}
class Data extends Datamember{
	int a=5000;  /// datamembers are not allowed in polymorphism
	
	public static void main(String[] args){
		Datamember d=new Data();
		System.out.println(d.a);
	}
}