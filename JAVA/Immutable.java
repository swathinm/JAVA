final class main1{
	private int id;
	private final String name="NM";
	public main1(String empname){
		this.name=empname;
		
	}
	public String getNames(){
		return name;
	}
	public static void main(String[] args){
		main1 e=new main1("Swathi");
		e.main1("Hi");
		String s1=e.getNames();
		System.out.println(s1);
	}
}