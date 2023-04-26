/* class This{
	
	void s(){
		System.out.println("s");
	}
	
	void t(){
		this.s();
	}
	
	public static void main(String[] args){
	This n=new This();
	n.t();
	}


	
} */

class This{
	int rollno;
	String name,comp;
	
	This(int rollno,String name){
		this.rollno=rollno;
		this.name=name;
	}
	
	This(int rollno,String name,String Comp){
	this(rollno,name);
	this.comp=comp;
	
	}
	
	 void display(){
		System.out.println(rollno+name+comp);
	}
		
	 
	
	
}
class Test{
	public static void main(String[] args){
		This n=new This(10,"swathi");
		n.display();
	
	}
}

 