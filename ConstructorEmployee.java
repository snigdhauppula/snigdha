class Employee{
int empid;
String empname;
int salary;
String address;
String company_name;
String company_location;
Employee(int empid,String empname,int salary,String address,String company_name,String company_location){
this.empid=empid;
this.empname=empname;
this.salary=salary;
this.address=address;
this.company_name=company_name;
this.company_location=company_location;
}
void display(){
System.out.println("Employee id="+empid);
System.out.println("Employee name="+empname);
System.out.println("Employee salary="+salary);
System.out.println("Employee address="+address);
System.out.println("company_name="+company_name);
System.out.println("company_location="+company_location);
}
}
class ConstructorEmployee{
public static void main(String args[]){
Employee e=new Employee(551,"snigdha",45000,"wgl","JNIT","hyd");
e.display();
}
}