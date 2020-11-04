public class WhileLoop{
public static void main(String args[]){
int sum=0,fact=1,rem,n=145;
while(n>0){
rem=n%10;
fact=1;
while(rem>0){
fact=fact*rem;
rem--;
}
sum=sum+fact;
n=n/10;
}
System.out.println("sum="+sum);
}
}