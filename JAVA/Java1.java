 class Java1 implements Cloneable{
	int id;
	String name;
	
	Java1(int m,String n){
		this.id=m;
		this.name=n;
	}
	
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
	
	public static void main(String[] args){
		try{
			Java1 j=new Java1(101,"Swathi");
			Java1 s=(Java1)j.clone();
			
			System.out.println(s.id+" "+s.name);
		}
		catch(CloneNotSupportedException c){
			
		}
	}
}