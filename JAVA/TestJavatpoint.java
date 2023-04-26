//Creating the custom wrapper class  
class Javatpoint{  
private int i;  
Javatpoint(){}  
Javatpoint(int i){  
this.i=i;  
}  
public int getValue(){  
return i;  
}  
public void setValue(int i){  
this.i=i;  
}  
 
}  
//Testing the custom wrapper class  
public class TestJavatpoint{  
public static void main(String[] args){  
Javatpoint j=new Javatpoint(10);
String s=j.toString();  
System.out.println(s);  
}}  