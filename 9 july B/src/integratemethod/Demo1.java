package integratemethod;

public class Demo1
{ // example of method without/zero parameter
public static void main(String[] args) {
	//static method call from same class
	m1();
  //static method call from different class
    Demo2.m2();
  // non static method call from same class
Demo1 s7=new Demo1();
	//1. create object of same class
        s7.m3();
//	non static method call from different class
   Demo2 s8=new Demo2();
	//create object of diff class
	s8.m4();
}      public static void m1()
	{
		System.out.println("running static method m1from same class");
	}
	public void m3()
	{
		System.out.println("running non static method m3 from diff class");
	}
	
	
}	
	

