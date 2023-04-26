// Copying array

class Arr3{
	public static void main(String[] args){
		char[] arr={'a','b','c','d','e','f','g','h'};
		char c='a';
		
		char[] brr=new char[7];
		
		System.arraycopy(arr,1,brr,0,5);
		String s=String.valueOf(brr);
		Character a=c;
	
		System.out.println(s);
		System.out.println(a);
	}
}