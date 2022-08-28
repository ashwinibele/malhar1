package typesofvariable;
public class series1 
{
        //static global variable
    static int a =10;                 //static global variable
    static int c = 30;
   public static void main(String[]args)
    {
      // static global variable call from same class
         System.out.println(a);            //variable name
         System.out.println(c-a);
         System.out.println("......");
       // static global variable call from diff class
       System.out.println(Series2.b);           //class name.variable name
       System.out.println(Series2.d);
       
    }
    public static void m1()
    {
    	System.out.println(a);
    }
    public void m2()
    {
    	System.out.println(a);
    }
}