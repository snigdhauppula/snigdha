class Square
{
int a=5,b=20;
void sum()
{
System.out.println(a+b);
}
}
class Sum extends Square
{
int c=10;
 
void mul()
{
System.out.println(c*a);
}
}
class ShapeSingle{
public static void main(String args[])
{
Sum s=new Sum();
s.sum();
s.mul();
}
}