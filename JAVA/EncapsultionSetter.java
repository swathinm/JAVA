class EncapsultionSetter{
	private int id;
	private String name;
	
	 public int getId(){
		return id;
	}
	public void setId(int i){
		this.id=i;
	}	 
	public String getName(){
		return name;
	}
	public void setName(String n){
		this.name=n;
	}
}
class Test{
	public static void main(String[] args){
		EncapsultionSetter e=new EncapsultionSetter();
		e.setId(10);
		e.setName("Swathi");
		System.out.println(e.getId());
		System.out.println(e.getName());
	}
}