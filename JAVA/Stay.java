class Stay  implements Cloneable{
	int i;
	String n;
	
	Stay(int o){
		this.i=o;
	}
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
	}
	public static void main(String[] args){
		try{
			Stay s1=new Stay(101);
			Stay s2=(Stay)s1.clone();
			System.out.println(s1.i);
			System.out.println(s2.i);
		}
		catch(CloneNotSupportedException c){}
	}
}