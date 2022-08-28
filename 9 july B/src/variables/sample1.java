package variables;

public class sample1 
{
   int a = 50;        //global variable
	
	  public void m1()
{
		  int b=20;            // local variable
		  
		System.out.println(a+b);  
		System.out.println(b*a);
		
		
 }
	 public static void main(String[]args)
	 {
		 sample1 s1=new sample1();
	        s1.m1();
	 
	 }
}
