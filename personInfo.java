import java.util.Scanner;
class Person{
String name;
String father_name;
String gender;
String address;
String languages;
String hobbies;
String city;
String country;
}
class personInfo{
public static void main(String args[]){
Person p=new Person();
Scanner sc=new Scanner(System.in);
System.out.println("enter person details");
p.name=sc.next();
p.father_name=sc.next();
p.gender=sc.next();
p.address=sc.next();
p.languages=sc.next();
p.hobbies=sc.next();
p.city=sc.next();
p.country=sc.next();
System.out.println("=========person Details========");
System.out.println("name"+p.name);
System.out.println("father_name"+p.father_name);
System.out.println("gender"+p.gender);
System.out.println("address"+p.address);
System.out.println("languages"+p.languages);
System.out.println("hobbies"+p.hobbies);
System.out.println("city"+p.city);
System.out.println("country"+p.country);
}
}