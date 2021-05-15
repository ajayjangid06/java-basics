import java.util.*;
class Student
{
	int rollNumber;
	void getNumber(int n)
	{
		rollNumber = n;
	}
	void putNumber()
	{
		System.out.println("ROLL NUMBER : "+rollNumber);
	}
}
class Test extends Student
{
	float part1,part2;
	void getMarks(float m1,float m2)
	{
		part1 = m1;
		part2 = m2;
	}
	void putMarks()
	{
		System.out.println("MARKS OBTAINED");
		System.out.println("PART 1 = "+part1);
		System.out.println("PART 2 = "+part2);
	}
}
interface Sports
{
	float sportCricket = 6.07f;
	void putCricket();
}
class MultipleInterface1
{
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		System.out.print("Name : abc \nENTER YOUR ROLL NUMBER : ");
		int n = ob.nextInt();
		System.out.print("ENTER MARKS IN PART 1 : ");
		float m1 = ob.nextFloat();
		System.out.print("ENTER MARKS IN PART 2 : ");
		float m2 = ob.nextFloat();
		System.out.print("ENETR MARKS IN SPORTS : ");
		float sportCricket = ob.nextFloat();
		System.out.println("\n\n");
		System.out.println("ROLL NUMBER : "+n);
		System.out.println("MARKS OBTAINED");
		System.out.println("PART 1 = "+m1);
		System.out.println("PART 2 = "+m2);
		float total = m1+m2+sportCricket;
		System.out.println("TOTAL MARKS : "+total);
	}
}









