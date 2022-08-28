package typesofvariable;

public class Series3 
{
   // example of non static global variable
	
	int c=30;    // non static global variable
	
	public static void main (String[]args)
	{
		// non static global variable call from same class
	 
		Series3 s3 = new Series3();      //1. create object of same class
            System.out.println(s3.c);         //2. object name.variable name
	  
            System.out.println("......");
	//4. non static global variable call from diff class
	   
            Series4 s4 =new Series4();     //1. create object of diff class
	System.out.println(s4.d);    //2. diff class object name.variable name
	 }
     public static void m3()
     {
    	 Series3 s5 = new Series3();
    System.out.println(s5.c);
     }
       public void name()
       {
      System.out.println(c);
       }
     }
