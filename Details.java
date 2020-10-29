import java.util.Scanner;
class Student{
int id;
float percentage;
static String clg;
}
class Employee{
int employee_id;
int salery;
static String company_name;
}
class Details{
public static void main(String args[]){
Student varun=new Student();
Scanner sc=new Scanner(System.in);
System.out.println("enter  student details");
varun.id=sc.nextInt();
varun.percentage=sc.nextFloat();
Student.clg=sc.next();
System.out.println("=========Student Details========");
System.out.println("Student id="+varun.id);
System.out.println("percentage="+varun.percentage);
System.out.println("college="+Student.clg);
Employee snigdha=new Employee();
System.out.println("enter employee details");
snigdha.employee_id=sc.nextInt();
snigdha.salery=sc.nextInt();
Employee.company_name=sc.next();
System.out.println("=========Employee Details========");
System.out.println("Employee id="+snigdha.employee_id);
System.out.println("Employee salery="+snigdha.salery);
System.out.println(Employee.company_name);
}
}



