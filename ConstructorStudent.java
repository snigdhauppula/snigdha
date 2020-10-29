class Student{
int stdid;
String stdname;
float height;
float percentage;
String address;
String college_name;
String department;
Student(int stdid,String stdname,float percentage,float height,String address,String college_name,String department){
this.stdid=stdid;
this.stdname=stdname;
this.percentage=percentage;
this.height=height;
this.address=address;
this.college_name=college_name;
this.department=department;
}
void display(){
System.out.println("Student id="+stdid);
System.out.println("Student name="+stdname);
System.out.println("student percentage="+percentage);
System.out.println("Student height="+height);
System.out.println("Student address="+address);
System.out.println("college_name="+college_name);
System.out.println("department="+department);
}
}
public class ConstructorStudent{
public static void main(String args[]){
Student s=new Student(540,"varun",93,5.6f,"wgl","GURU","CSE");
s.display();
}
}