class EncapsulationB{
	public static void main(String[] args){
		EncapsulationA f=new EncapsulationA();
		f.setAcc(342442L);
		f.setName("Swathi");
		f.setEmail("swathinm13@gmail.com");
		f.setAmt(300000);
		System.out.println(f.getAcc());
		System.out.println(f.getName());
		System.out.println(f.getEmail());
		System.out.println(f.getAmt());
	}
}