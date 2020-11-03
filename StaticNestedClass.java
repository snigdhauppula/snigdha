class University
{
 static class Department{
void announcement()
{
System.out.println("cse results declared");
}
static void result(){
System.out.println("results kept in website");
}
}
}
class StaticNestedClass{
public static void main(String args[]){
University.Department cse=new University.Department();
University.Department.result();
cse.announcement();
}
}
