import java.util.Scanner;

public class checkequalproduct {
	//Write a method hasEqualProduct with 3 parameters of type int.
	//The method should return boolean and it needs to return true if the product of the
		//	first and second parameter is equal to the third parameter. Otherwise, return false.  
	public static boolean Checkproductval(int a,int b,int c)
	{
		if(a*b==c)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int n3=scan.nextInt();
		
		System.out.println(Checkproductval(n1,n2,n3));
		
	}}
