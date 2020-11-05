class Vote extends Exception{
Vote(String msg){
super(msg);
}
}
public class ExceptionDemo{
public static void main(String args[])throws Exception{
int age=17;
if(age>=18)
System.out.println("Eligible for voting");
else
System.out.println("Not Eligible for voting");
}
}
