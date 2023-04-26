class Recursssion3{
	static int n1=0,n2=1,n3=0;
	static void m(int c){
		if(c>0){
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			m(c-1);
			
		}
	}
	
		
		public static void main(String[] args){
			int c=17;
			System.out.print(n1+" "+n2);
			m(c-2);
			
			
		}
}