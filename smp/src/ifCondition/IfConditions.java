package ifCondition;


class ifconditionTypes
{
	int a=20,b=40,c=41;
//if(True)
//if else(True or false)
//else if(Multiple conditions)
//nested if(Multiple internal conditions)
void DisplayBigNumberUsingIf()
{
	
if(b>a) //F
{//T
	System.out.println("b is big");
	System.out.println("hi");

}

}
void DisplayBigNumberUsingIfElse()
{//Comparing expected with actuals
	if(a>b) //T if //F else  //Expected  = actual
	{//T
		System.out.println("a is big");  //Pass
		
		
	}
	else
	{//F
		
		System.out.println("B is big");  //Fail
		
	}


}


void DisplyBigNumberUsingElseIF()
{//Compare three numbers
	if(a>b&a>c)//F
	{
		System.out.println("a i big");
		
	}
	else if(b>a&b>c)//F
	{
		
		System.out.println("b is big");
		
		
	}
	else if(c>a&c>b)//F
	{
		
		System.out.println("c is big");
		
	}
	
	else
	{
		
		System.out.println("a=b=c");
		
	}



}
}

public class IfConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stubI
		ifconditionTypes it=new ifconditionTypes();
		//it.DisplayBigNumberUsingIf();
		//it.DisplayBigNumberUsingIfElse();
		it.DisplyBigNumberUsingElseIF();
	}

}
