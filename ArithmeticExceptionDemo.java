public class ArithmeticExceptionDemo{
public static void main(String args[]){
System.out.println("Arithmetic Exception:");
int a=10,b=0;
try{
int c=a/b;
}catch(ArithmeticException ae){
ae.printStackTrace();
}
}
}