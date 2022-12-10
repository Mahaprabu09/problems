import java.util.*;
public class Checkpythogorean {
	//Write a program to accept three number and check whether they are pythagorean triplet or not.    

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers :");
	    int a=scan.nextInt();
	    int b=scan.nextInt();
	    int c=scan.nextInt();
	    checkPythogorean(a,b,c);
	    
	}
	public static void checkPythogorean(int a,int b,int c)
	{
		int p=a*a;
		int q=b*b;
		int r=c*c;
		
		if((p+q)==r)
		{
			System.out.println("the following function is pythogorean");
		}
		else
			System.out.println("the following function is not pythogorean");
	}
}