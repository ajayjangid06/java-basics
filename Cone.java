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
class Cone
{
public static void main(String args[])
{
System.out.print("Area of base and curved surfaceof a cone:-");
System.out.println("");


Area area;
Base b = new Base();
area=b;
System.out.println("Area of base of a cone: "+area.compute(10,0));
Curved c=new Curved();
area=c;
System.out.println("Area of curved surface of a cone: "+area.compute(10,20));
}
}
