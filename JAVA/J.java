 class J implements Cloneable{
	int id;
	String name;
	
	J(int m,String n){
		this.id=m;
		this.name=n;
	}
	
    public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
	
	
	public static void main(String[] args){
		try{
			J j=new J(101,"Swathi");
			J s=(J)j.clone();
			
			System.out.println(s.id+" "+s.name);
		}
		catch(CloneNotSupportedException c){}
	}
}