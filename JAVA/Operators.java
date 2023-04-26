/*class Operators{
	public static void main(String[] args){
		int x=10;
		int y=++x;
		System.out.println(y);
	}
	
}// o/p : 11

class Operators{
	public static void main(String[] args){
		int x=10;
		int y=++10;
		System.out.println(y);
	}
}// output : error*/

/*class Operators{
	public static void main(String[] args){
		int x=10;
		int y=++ (++x);
		System.out.println(y);
	}
}// output : error:Unexpected Type*/

/*class Operators{
	public static void main(String[] args)
	{
	final int x=10;
		x++;
		System.out.println(x);
	}
}*/

/*class Operators{
	public static void main(String[] args)
	{
		char ch='b';
		ch++;
		System.out.println(ch);
	}
}*/


 /*class Operators{
	 public static void main(String[] args){
		 /*byte a=10;
		 byte b=20;
		 byte c=(byte)(a+b);
		 
		 
		 //System.out.println('a'+'b');
		 
		 //System.out.println('a'+0.89);
		 
		 //System.out.println("a"+"b");
		 
		 //System.out.println(10/0.0);
		 System.out.println(10<Float.NaN);
		 System.out.println(10<=Float.NaN);
		 System.out.println(10>Float.NaN);
		 System.out.println(10>=Float.NaN);
		 System.out.println(10==Float.NaN);
		 System.out.println(10!=Float.NaN);
		 System.out.println(Float.NaN!=Float.NaN);
		 
		 
	 }
 }*/
 
 //String Concatenation
 
/* class Operators{
	 public static void main(String[] args)
	 {
		String a="durga";
		int b=10,c=20,d=30;
		System.out.println(a+b+c+d);
		System.out.println(b+c+a+d);
	 }
 }*/
 
 //RELATIONAL OPERATOR
 
 /*class Operators{
	 public static void main(String[] args){
		// System.out.println("swathi123"<"swathi");
		// System.out.println(10<20);
		System.out.println(10<=20<=30);
	 }
 }
 */		 
		 
		 
 
 
 
 
 // Equality Operator
/*class Operators{
	 public static void main(String[] args)
	 {
		 /*Thread t=new Thread();
		 Object o=new Object();
		 String s=new String("swathi");
		 System.out.println(t==o);
		 System.out.println(o==s);
		 System.out.println(s==t);
		 String s1=new String("durga");
		 String s2=new String("durga");
		 System.out.println(s1==s2);
		 System.out.println(s1.equals(s2));
		 System.out.println(null==null);
		 
	 }
}
*/

// Instanceof Operator
/*class Operators{
	public static void main(String[] args)
	{
		Thread t=new Thread();
		System.out.println(t instanceof String);
		System.out.println(t instanceof Object);
		System.out.println(null instanceof Object);
		System.out.println(null instanceof Thread);
		System.out.println(null instanceof Runnable);
	}
}*/

// Bitwise Operators

/*class Operators{
	public static void main(String[] args)
	{
		System.out.println(true&false);
		System.out.println(true|false);
		System.out.println(true^false);
		System.out.println(4^5);
		System.out.println(4|5);
		System.out.println(4&5);
		System.out.println(~5);
	}
}
*/

// Short circuit Operator

class Operators{
	public static void main(String[] args)
	{
		int x=10,y=15;
		//if(++x<10 & ++y>15)  //o/p : 11...17
		// if(++x<10 && ++y>15) //o/p : 11...16
		//if(++x<10 | ++y>15)  //o/p : 12...16
		if(++x<10 || ++y>15)   //o/p : 12...16 
		{
			x++;
		}
		else
		{
			y++;
		}
		System.out.println(x+"..."+y);
	}
}

//TYPE CASTING 

// EXPLICIT TYPE CASTING

/* class Operators{
	public static void main(String[] args)
	{
		int x=130;
		//byte b=x;
		byte b=(byte)x;
		
		System.out.println(b);
	}
}

 */


// Evaluating of operators

/* class Operators{
	public static void main(String[] args)
	{
		System.out.println(m1(1)+m1(2)*m1(3)/m1(4)+m1(5)*m1(6));
	}
	public static int m1(int i)
	{
		System.out.println(i);
		return i;
	}
}
		
 */








