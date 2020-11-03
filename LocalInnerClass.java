class Value
{
private int a=20;
void value(){
System.out.println("Value is:"+a);
class Inner{
void show(){
int b=20;
System.out.println("sum of a,b is"+(a+b));
}
}
Inner in=new Inner();
in.show();
}
}
class LocalInnerClass{
public static void main(String args[]){
Value outer=new Value();
outer.value();
}
}
