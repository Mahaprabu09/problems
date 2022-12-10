
public class constructor {
	String name;
	int age;
	int yob;
	constructor(int a,int b)
	{
		int num=a;
		int num1=b;
		System.out.println("a value is :"+num);
		System.out.println("b value is :"+num1);
	}
	public static void main(String[]args)
	{
		constructor c=new constructor(34,54);
		c.name="Maha";
		c.yob=2001;
		System.out.println(c.name+"\n"+c.yob);
	}

}
