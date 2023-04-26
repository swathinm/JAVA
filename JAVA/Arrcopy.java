class Arrcopy{
	public static void main(String[] args){
		int[] arr={1,2,3,4,5};
		int[] arr2=new int[5];
	
	 for(int i=0;i<arr.length;i++){
		arr2[i]=arr[i];
	}
	
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]);
	}
	System.out.println();
	
	for (int i=0;i<arr2.length;i++){
		System.out.print(arr2[i]);
	}
	
	
		/* System.arraycopy(arr,1,arr2,0,5);
		System.out.println((arr2)); */ 
	}
}