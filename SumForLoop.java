public class SumForLoop{
public static void main(String args[]){
int n=123,sum=0,rem;
for(n=123;n>0;n=n/10){
rem=n%10;
sum=sum+rem;
}
System.out.println("sum="+sum);
}
}