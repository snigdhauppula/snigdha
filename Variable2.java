class Person{
String name;
String father_name;
String gender;
String address;
String languages;
String phone_number;
String hobbies;
String city;
String country;
}
class Variable2{
public static void main(String args[]){
Person p=new Person();
p.name="snigdha";
p.father_name="satish";
p.phone_number="8328567527";
p.gender="female";
p.address="charbowli";
p.languages="telugu,english";
p.hobbies="listening to music";
p.city="warangal";
p.country="india";
System.out.println("name"+p.name);
System.out.println("father_name"+p.father_name);
System.out.println("phone_number"+p.phone_number);
System.out.println("gender"+p.gender);
System.out.println("address"+p.address);
System.out.println("languages"+p.languages);
System.out.println("hobbies"+p.hobbies);
System.out.println("city"+p.city);
System.out.println("country"+p.country);
}
}