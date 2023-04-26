/* class PalindromString{
	public static void main(String[] args){
		String str="NON" ,rev="";
		int Stre=str.length();
		
		for(int i=Stre-1;i>=0;--i){
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev)){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}
	 */	
import java.util.Scanner;	 
		 
class Main {
  public static void main(String[] args) {
	 System.out.println("Enter the string: ");
	 Scanner s=new Scanner(System.in);
	 String str=s.nextLine();

    String reverseStr = "";
    
    int strLength = str.length();

    for (int i = (strLength - 1); i >=0; --i) {
      reverseStr = reverseStr + str.charAt(i);
    }

    if (str.equals(reverseStr)) {
      System.out.println(str + " is a Palindrome String.");
    }
    else {
      System.out.println(str + " is not a Palindrome String.");
    }
  }
}