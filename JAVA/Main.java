import java.util.*;
public class Main{
	int i;
	int n;
	int e;
	Main(int m,int f,int g){
		this.i=m;
		this.n=f;
		this.e=g;
	}
	
	public String toString(){
		return i+" "+n+" "+e;
	}
	
	public static void main(String[] args){
		Main obj=new Main(100,200,300);
		Main obj1=new Main(100,200,300);
		
		System.out.println(obj);
	}
}