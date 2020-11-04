public class ReverseWhile{
public static void main(String args[]){
int sum=0,n=123,rem;
while(n>0){
rem=n%10;
sum=sum*10+rem;
n=n/10;
}
System.out.println(sum);
}
}