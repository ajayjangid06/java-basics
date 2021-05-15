package package0;
public class ClassA
{
	public void displayA()
	{
		System.out.println("Class A");
	}
}
public class ClassB
{
	protected int m = 10;
	public void displayB()
	{
		System.out.println("Class B");
		System.out.println("m = "+m);
	}
}

import package0.ClassA;
import package0.ClassB;
class Package1
{
	public static void main(String args[])
	{
	
		ClassA x = new ClassA();
		ClassB y = new ClassB();
		x.display();
		y.dislayB();
	}
	
}