package sample1;

public class Nonstaticmethodssameclass01 {
  //3.non static method call from same class
	public static void main(String[] args) {
		//class name object name =new class name();	
	//1.create object of same/current class
	//objectname.methodname():	
	//2.method call
		Nonstaticmethodssameclass01 s4=new Nonstaticmethodssameclass01();
		s4.m3();
		s4.m4();
	    s4.m4();
	} 
	//non-static regular method
	     public void m3()
	{ 
	 System.out.println("nonstatic regular method m3");
	}
 //non static regular method 
	     public void m4()
	{
	System.out.println("nonstatic regular method m4");
	}
	
}