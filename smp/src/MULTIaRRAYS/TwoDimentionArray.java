package MULTIaRRAYS;

public class TwoDimentionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]={{2,9,6},{4,7,3},{5,8,1}};    //3*3 Array
//            0		1		2
/*
 * *
 * 
 * 2 9  00 	01   A[0][0]=2 A[0][1]=9 
 * 4 7	10	11	 A[1][0]=4	A[11[1]=7	
 * 5 8	20	21	 A[2][0]=5	A[2][1]=8
 */


//2 2    	00	01 
//			10	11

//System.out.println(a[0][0]);
//System.out.println(a[1][0]);

for(int row=0;row<3;row++)   //3*3
{//0 1 2
	for(int column=0;column<3;column++)
	{
		///0 1 2
		System.out.print(row+" "+column+"="+a[row][column]+" ");  //00 01 10 11 20 21
	
	}
System.out.println();
}
	}

}
