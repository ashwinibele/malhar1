package polymorphism;

public class Demo1
{
      public void m1()                            //non-static method declaration
      {
    	  System.out.println("running method m1"); //non -static method definition 
     }
	 public static void m2()                      //static method declaration
	 {
		 System.out.println("running method m2");  //static method definition
	 }
	 public static void main(String[]args)
	 {
		 int a=10;  
		  int s= 60;
		 System.out.println(a*s);
	 }
}
  // this example for show the non static or static declaration and definition stored where in jvm(java virtual machine).
  // non static method declaration in heap area.
  // static method declaration in static pool area.
  //static  and non-static method definition in method area.
  // method execution flow (main() method) in stack  area.