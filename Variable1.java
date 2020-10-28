class Customer{
int id;
String name;
String gender;
String marital_status;
String address;
int postal_code;
String contact_number;
String city;
String country;
}
class Variable1{
public static void main(String args[]){
Customer c=new Customer();
c.id=4312;
c.name="anju";
c.contact_number="7659937742";
c.gender="female";
c.marital_status="married";
c.address="shivanagar";
c.postal_code=506001;
c.city="warangal";
c.country="india";
System.out.println("Customer id"+c.id);
System.out.println("name"+c.name);
System.out.println("gender"+c.gender);
System.out.println("marital_status"+c.marital_status);
System.out.println("address"+c.address);
System.out.println("postal_code"+c.postal_code);
System.out.println("contact_number"+c.contact_number);
System.out.println("city"+c.city);
System.out.println("country"+c.country);
}
}