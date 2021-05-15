import java.util.*;
interface Area
{
	float pi=3.14f;
	float compute(float r,float l);
}
class Base implements Area
{
	public float compute(float r,float l)
	{
		return(pi*r*r);
	}
}
class Curved implements Area
{
	public float compute(float r,float l)
	{
		return(pi*r*l);
	}
}
class Cone1
{
	public static void main(String args[])
	{
		System.out.print("Area of base and curved surfaceof a cone:-");
		System.out.println("\n");
		Scanner ob=new Scanner(System.in);
		System.out.print("r=");
		float r=ob.nextFloat();
		System.out.println("l=");
		float l=ob.nextFloat();

		Area area;
		Base b = new Base();
		area=b;
		System.out.println("Area of base of a cone: "+area.compute(r,l));
		Curved c=new Curved();
		area=c;
		System.out.println("Area of curved surface of a cone: "+area.compute(r,l));
	}
}