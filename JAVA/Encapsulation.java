
// Using only getter;

class Encapsulation{
	private int id=1;
	private String name="Cartoon";
	
	public int getid(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
}
class Test{
	public static void main(String[] args){
		Encapsulation e=new Encapsulation();
		System.out.println(e.getid());
		System.out.println(e.getName());
	}
}
	