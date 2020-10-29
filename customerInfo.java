import java.util.Scanner;
class Customer{
int id;
String name;
String gender;
String marital_status;
String address;
int postal_code;
String city;
String country;
}
class customerInfo{
public static void main(String args[]){
Customer c=new Customer();
Scanner sc=new Scanner(System.in);
System.out.println("enter customer details");
c.id=sc.nextInt();
c.name=sc.next();
c.gender=sc.next();
c.marital_status=sc.next();
c.address=sc.next();
c.postal_code=sc.nextInt();
c.city=sc.next();
c.country=sc.next();
System.out.println("Customer id"+c.id);
System.out.println("name"+c.name);
System.out.println("gender"+c.gender);
System.out.println("marital_status"+c.marital_status);
System.out.println("address"+c.address);
System.out.println("postal_code"+c.postal_code);
System.out.println("city"+c.city);
System.out.println("country"+c.country);
}
}