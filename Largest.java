import java.util.*;
class Largest
{
public static void main(String args[])
	{
	int x,y,z;
	Scanner ob=new Scanner(System.in);
	System.out.print("x=");
	x=ob.nextInt();
	System.out.print("y=");
	y=ob.nextInt();
	System.out.print("z=");
	z=ob.nextInt();
	if(x>y&&x>z)
	System.out.println("x = "+x+" is largest");
	else if(y>z)
	System.out.println("y = "+y+" is largest");
	else
	System.out.println("z = "+z+" is largest");
	}
}
	