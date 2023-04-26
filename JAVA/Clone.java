class Clone{
	public static void main(String[] args){
		int[] arr={1,2,3};
		for(int i:arr){
			System.out.println(i);
		}
	
	int carr[]=arr.clone();
	for(int i:carr){
		System.out.println(i);
	}
	
	System.out.println(arr==carr);
}
}
