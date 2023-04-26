/* class Method{
	int id ;
	String name;
	float salary;
	void Swathi(int i,String n,float f){
		id=i;
		name=n;
		salary=f;
		
		System.out.println(id+"   "+name+salary);
	}
}
class Avoid{
	public static void main(String[] args)
	{
		Method m=new Method();/////////////////////
		m.Swathi(1,"Swathi",20000);
	}
} */
/* class Method{  
 void fact(int  n)
 {  
  int act=1;  
  for(int i=1;i<=n;i++){  
   act=act*i;  
  }  
 System.out.println("factorial is "+act);  
}  
public static void main(String args[]){  
 new Method().fact(6);//calling method with anonymous object  
}  
}   */
public class Method {  
public static void main(String[] args) {  
            //outer loop  
            for(int i=1;i<=3;i++){    
                    //inner loop  
                    for(int j=1;j<=3;j++){    
                        if(i==3&&j==2){    
                            //using continue statement inside inner loop  
                            continue;    
                        }    
                        System.out.println(i+" "+j);    
                    }    
            }    
}  
}  