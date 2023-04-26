import java.util.Arrays;  
class Array{
	public static void main(String[] args){
		//using int
		int[] a=new int[2];
		a[0]=1;
		a[1]=2;
		int[] c=new int[]{0,1,2};
		//using byte
		byte b=20;
		int[] x=new int[b];
		//using short
		short s=30;
		int[] y=new int[s];
		//using char
		int[] z=new int['a'];
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		System.out.println(z);
	}
}