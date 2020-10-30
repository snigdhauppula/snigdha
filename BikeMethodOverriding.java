abstract class Bike{
abstract void run();
abstrat void speed();
void changeGear(){
System.out.println("gear changed");
}
}
class Honda extends Bike{
void run(){
System.out.println("Honda is running safely");
}
void speed(){
System.out.println("Honda speed is 60");
}
}
class Pulsar extends Bike{
void cost(){
System.out.println("Pulsar is running safely");
}
void speed(){
System.out.println("pulsar speed is 80");
}
}
class BikeMethodOverriding{
public static void main(String args[]){
Bike x=new Honda();
x.changeGear();
x.run();
x.speed();
x=new pulsar();
x.changedGear();
x.run();
x.speed();
}
}

