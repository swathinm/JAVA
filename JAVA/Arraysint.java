class Arraysint{
	public static void main(String[] args){
		//1-d array intialization
		int[] a=new int[2];
		System.out.println(a);
		System.out.println(a[0]);
		
		
		// 2-d array intialization 
		int[][] y=new int[2][3];
		System.out.println(y);
		System.out.println(y[0]);
		System.out.println(y[0][0]);
		
		
		//null point error intialization
		/*int[][] z=new int[2][];
		System.out.println(z);
		System.out.println(z[0]);
		System.out.println(z[0][0]);*/
		
		
		//passsing value
		int[] x=new int[6];
			x[0]=10;
			x[1]=20;
			x[2]=30;
			x[3]=40;
			x[4]=50;
			x[5]=60;
		System.out.println(java.util.Arrays.toString(x));
		
		
		//length vs length()
		//length Variable - length
		int[] z=new int[6];
		System.out.println(z.length);
		//	System.out.println(z.length());  error:method length
		
		//length method - length()
		String s="swathin";
		System.out.println(s.length());
		// System.out.println(s.length); error:variable length
		
		
		
		
	}
}