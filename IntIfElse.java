class Integer{
public void num(int num){
if(num>0){
System.out.println("Number is positive integer");
}
else{
System.out.println("It is a negative integer");
}
}
}
public class IntIfElse{
public static void main(String args[]){
Integer i=new Integer();
i.num(15);
}
}