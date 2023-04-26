class Staitic{
	 //int count=0;
	 static int count=0;
	
	Staitic(){
		count++;
		System.out.println(count);
	}
		public static void main(String[] args){
			Staitic s1=new Staitic();
			Staitic s2=new Staitic();
			Staitic s3=new Staitic();
		}
}