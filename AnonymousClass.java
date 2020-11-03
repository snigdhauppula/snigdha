
abstract class Car{
abstract void cost();
abstract void milage();
}
class AnonymousClass{
public static void main(String args[]){
Car x=new Car(){
void milage(){
System.out.println("milage of a car 15km");
}
void cost(){
System.out.println("cost of a car 40 lakhs");
}
};
x.cost();
x.milage();
}
}

