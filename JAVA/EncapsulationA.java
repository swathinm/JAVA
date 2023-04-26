class EncapsulationA{
	private long acc_no;
	private String name,email;
	private float amount;
	
	public long getAcc(){
		return acc_no;
	}
	public void setAcc( long a){
		this.acc_no=a;
	}
	
	public String getName(){
		return (name);
	}
	public void setName(String n){
		this.name=n;
	
	}
	public String getEmail(){
		return (email);
	}
	public void setEmail(String e){
		this.email=e;
	
	}
	
	public float getAmt(){
		return amount;
	}
	public void setAmt(int amt){
		this.amount=amt;
	}
}