class Array6{
	static void min(int arr[]){
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++){
				if(min>arr[i])
				min=arr[i];
		
			if(max<arr[i])
				max=arr[i];
		}
		System.out.println(min);
		System.out.println(max);
	}
	public static void main(String[] args){
		int[] arr={10,20,30};
		min(arr);
		}
}
			