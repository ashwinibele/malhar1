package July28;

public class serial1 {
public static void main(String[] args) {
	addition(10,20);
	addition(50,60);
	System.out.println("......");
	 serial1 s1 = new serial1();
       s1.sub (50,35);
       s1.sub(60,33);
       System.out.println("....."); 
 }
    // method with (2 int)parameter
  public static void addition (int num1, int num2)  
  {
  System.out.println(num1+num2);
  }
  //method 2int parameter
   public void sub (int num1,int num2)
   {
	   System.out.println(num1-num2);
   }
   
}
