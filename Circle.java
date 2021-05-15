import static java.lang.Math.*;
import java.util.*;
public class Circle
{
	public void cir(double r)
		{
		double area=PI*r*r;
		System.out.println("The Area of circle= "+area);
		}
	public static void main (String args[])
		{
		Scanner ob=new Scanner(System.in);
		System.out.print("r = ");
		double r=ob.nextDouble();
		Circle obj=new Circle();
		obj.cir(r);
		}
}