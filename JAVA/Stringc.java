import java.util.*;
class Stringd{
	public static void main(String[] args){
		String firstName="tony";
		String lastName="tonys";
		String fullName=firstName+lastName;
		System.out.println(fullName);
		System.out.println(firstName.equals(lastName));
		System.out.println(fullName.length());
		
		for(int i=0;i<fullName.length();i++){
			System.out.println(fullName.charAt(i));
		}
		//compare operator
		if(firstName.compareTo(lastName)==0){
			System.out.println("Strings are equal" );
		}else{
			System.out.println("Strings are not equal" );
		}
		//equals operator
		if(firstName==lastName){
			System.out.println("Strings are equal" );
		}else{
			System.out.println("Strings are not equal" );
		}
		//substring
		String name=lastName.substring(0,2);
		System.out.println(name);
		
	}
}