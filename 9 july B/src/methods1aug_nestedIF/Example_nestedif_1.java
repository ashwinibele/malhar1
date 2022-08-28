package methods1aug_nestedIF;

public class Example_nestedif_1 
{
public static void main(String[] args) {
	int PEM =100;
	//100>=300
	if(PEM>=300)          //outer if
	{ System.out.println("eligible for mains exam");   
	int  MEM =750;
	//750>=800
	if(MEM>=800)   //inner /nested if
	{System.out.println("selected in mains exam");   }
	else 
	{ System.out.println("rejected in mains exam"); }
    }s
	else 
	{System.out.println("not eligible for mains exam"); }
	
}

}
