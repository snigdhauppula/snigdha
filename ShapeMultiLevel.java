class Shape{
void display(){
System.out.println("inside display");
}
}
class Rectangle extends Shape{
void area(){
System.out.println("inside area");
}
void perimeter(){
System.out.println("inside perimeter");
}
}
class Cube extends Rectangle{
void volume()
{
System.out.println("inside volume");
}
void edges(){
System.out.println("inside edge");
}
void faces(){
System.out.println("inside faces");
}
}
class ShapeMultiLevel{
public static void main(String args[]){
Cube cu=new Cube();
cu.display();
cu.area();
cu.perimeter();
cu.edges();
cu.volume();
cu.faces();
}
}