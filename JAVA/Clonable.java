class Java implements clonable{
	int id;
	String name;
	public static void main(String[] args){
		Java j=new Java();
		j.id=10;
		j.name="Swathi";
		System.out.println(j.id);
		System.out.println(j.name);
		
		try{
			Java j1=(Java)j.clone();
			
			System.out.println(j1.id);
			System.out.println(j1.name);
		}
		catch(Exception e){
			System.out.println("no");
		}
	}
	
}
	
	
	