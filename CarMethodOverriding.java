abstract class Car{
abstract void cost();
abstract void milage();
void start(){
System.out.println("Starts with a key");
}
}
class Audi extends Car{
void cost(){
System.out.println("Audi cost is 50 lakhs");
}
void milage(){
System.out.println("Audi milage is 10km");
}
}
class Bmw extends Car{
void cost(){
System.out.println("Bmw cost is 40 lakhs");
}
void milage(){
System.out.println("Bmw milage is 15km");
}
}
class CarMethodOverriding{
public static void main(String args[]){
Car x=new Audi();
x.start();
x.cost();
x.milage();
x=new Bmw();
x.start();
x.cost();
x.milage();
}
}

