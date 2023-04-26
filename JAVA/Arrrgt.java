class Arrrgt{
	public static void main(String[] args){
		int[] a={10,20,30,40,50};
		int n=1;
		
		
		for(int i=0;i<n;i++){
			int j,last;
			last=a[a.length-1];
			
			
			for(j=a.length-1;j>0;j--){
				a[j]=a[j-1];
				
			}
			a[0]=last;
		}
		 for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}