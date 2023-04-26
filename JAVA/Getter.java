public class Getter
{  
private int roll;  
private String name;  
public int getRoll()    //accessor method  
{  
return roll;  
}  
public void setRoll(int roll) //mutator method  
{  
this.roll = roll;  
}  
public String getName()   
{  
return name;  
}  
public void setName(String name)   
{  
this.name = name;  
}  
public void display()  
{  
System.out.println("Roll no.: "+roll);  
System.out.println("Student name: "+name);  
}  
}  

class Main{
	public static void main(String[] args)
	{
		Getter g=new Getter();
		g.setRoll(10);
		System.out.println(g.getRoll());
	}
}