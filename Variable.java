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
class Variable{
public static void main(String args[]){
Student varun=new Student();
varun.id=1231;
varun.percentage=78.65f;
Student.clg="GURU";
System.out.println("=========Student Details========");
System.out.println("Student id="+varun.id);
System.out.println("percentage="+varun.percentage);
System.out.println("college="+Student.clg);
Employee snigdha=new Employee();
snigdha.employee_id=2121;
snigdha.salery=35000;
Employee.company_name="JNIT";
System.out.println("=========Employee Details========");
System.out.println("Employee id="+snigdha.employee_id);
System.out.println("Employee salery="+snigdha.salery);
System.out.println(Employee.company_name);
}
}



