// Passing method by an array

class Array4{
	//creating a method which receives an array as a parameter  
	static void min(int arr[]){
		int b=arr[2];
		for(int i=1;i<arr.length;i++)
			if(b>arr[i])
		b=arr[i];
		
		System.out.println(b);
	}
	public static void main(String[] args){
		int a[]={3,4,2};
		min(a);
	}
}