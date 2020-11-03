class University
{
void announcement()
{
System.out.println("exam starts from dec");
}
class Department{
void examPapers()
{
System.out.println("exam paper are being prepared");
}
}
}
class NestedClass{
public static void main(String args[]){
University jntu=new University();
jntu.announcement();
University.Department cse=new University().new Department();
cse.examPapers();
}
}
