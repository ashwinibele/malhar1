package methods1augelseIF;

public class Demo1_elseif {
public static void main(String[] args) {
	int marks=20;
	//20>=65
	if (marks>=65)
	{ 
		System.out.println("distinction");
	}
             //20>=60 
	    else if (marks>=60 & marks<=64)
                 //60-64
	    {	   System.out.println("1st class");  }

//20>=50
	    else if (marks>=50 & marks<=59)
 //50-59
  {   System.out.println("2nd class");  }
 //20>=35
  else if (marks>=35 & marks<=49)
  // 35-49
  {System.out.println("pass"); }
//20<35 
  else if (marks<35)
  {System.out.println("fail");
  }
}
}