package Strings;
class ContainsExp
{
	String A="Good Morning",B="Good";
	public void VerifyWordExistornot()
	{
		if(A.contains(B)) //if("Good Morning".contains("Good"))
		{
			
			
			System.out.println(A+" contains "+B);
		}
		else
		{
			System.out.println(A+" not contains "+B);
			
		}
		
	}
}
public class Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContainsExp c=new ContainsExp();
		c.VerifyWordExistornot();
	}

}
