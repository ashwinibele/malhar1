package constructor;

public class Sample11 
{
  // example of default constructor
   public void m1()
   {
     System.out.println("running method m1");
   }
     public static void main(String[]args)
     {
         Sample11 s11 = new Sample11();  //default constructor call from same class
            s11.m1();
   
            System.out.println("......");

        Sample12 s12 = new Sample12();      //default constructor call from diff class

      s12.m2();

}
}