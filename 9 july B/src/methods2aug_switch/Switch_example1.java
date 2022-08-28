package methods2aug_switch;

public class Switch_example1 
{
public static void main(String[] args) {
	{ int num1 =30;
	  int num2 =20;
	switch ("add")
	{
	case "add" :
	System.out.println("...addition of 2 numbers...");
	System.out.println(num1+num2);
	break;
	case "sub":
	System.out.println("...substraction of 2 numbers...");
	System.out.println(num1-num2);    break;
	case " mult":
	System.out.println("..multiplication of 2 numbers..");
	System.out.println(num1*num2);     break;
	case "div":
	System.out.println("..division of 2 numbers..");
    System.out.println(num1/num2);   break;
	default :System.out.println("invalid input");
	}
	}
}
}