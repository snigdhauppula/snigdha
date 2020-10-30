interface College
{
void students();
void teachers();
}
interface School
{
void students();
void teachers();
}
class ClassRoom implements School,College
{ 
public void students()
{
System.out.println("students are 300");
}
public void teachers()
{
System.out.println("teachers are 100");
}
}
class EduInterface
{
public static void main(String args[]){
ClassRoom cr=new ClassRoom();
cr.students();
cr.teachers();
}
}