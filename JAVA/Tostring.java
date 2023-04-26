class Tostring{
	int i;
	String name;
	
	Tostring(int id,String name){
		this.i=id;
		this.name=name;
		
	}
	
	public String toString(){
		return i+" "+name;
	} 
	
	public static void main(String[] args){
		Tostring t=new Tostring(10,"Swathi");
		System.out.println(t);
	}
}