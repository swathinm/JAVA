class Maxarray{
	public static void main(String[] args){
		int[] a={10,20,30,40,50};
		int m=a[0];
		int n=a[0];
		for(int i=0;i<a.length;i++){
			if(m>a[i]){
				m=a[i];
			}
			if(n<a[i]){
				n=a[i];
			}
		}
		System.out.println(m);
		System.out.println(n);
	}
}