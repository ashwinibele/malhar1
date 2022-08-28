package methods;

public class Sample1 {
//example1:static regular method call from same class
	//main method
	public static void main(String[] args)   //pre-defined method
	{
		System.out.println("hii");
		
		m1();  //method name();
		m2();
		m2();
	System.out.println("hello");
	}
	//static-regular method
	public static void m1()    //user defined
	{
		System.out.println("running static regular method:m1");
	}
	public static void m2()         //user defined
	{ System.out.println("running static regular method:m2");
	
	}
	
	}
