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
class Results extends Test implements Sports
{
	float total;
	public void putCricket()
	{
		System.out.println("SPORTS CRICKET = "+sportCricket);
	}
	void display()
	{
		total = part1 + part2 + sportCricket;
		putNumber();
		putMarks();
		putCricket();
		System.out.println("TOTAL SCORE = "+total);
	}
}
class MultipleInterface
{
	public static void main(String args[])
	{
		Results s1 = new Results();
		s1.getNumber(1942013);
		s1.getMarks(37.7f,38.8f);
		s1.display();
	}
}









