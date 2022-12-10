import java.util.Scanner;

//Write a method named hasNotTeen with 3 parameters of type int.

	//We’ll say that a number is  “teen” if it is in the range 13..19 inclusive,
	//otherwise it is not teen. Given 3 int values, return true if none of them are teen, 
	//		otherwise return false..
public class Checkteens {
	public static boolean hasNotTeen(int a,int b,int c)
	{
	    if(a>=13&&a<=19)
		{
			return false;
		}
	    else if(b>=13&&b<=19)
	    {
	    	return false;
	    }
	    else if(c>13&&c<=19)
	    {
	    	return false;
	    }
	    else
	    {
	    	return true;
	    }
	}
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int n3=scan.nextInt();
		
		boolean checkteen=hasNotTeen(n1,n2,n3);
		System.out.println(checkteen);
	}

}
