class Car {
void vehicleType(){
System.out.println("vehicle type: Car");
}
}
class Maruthi extends Car{
void brand(){
System.out.println("Brand: Maruthi");
}
void speed(){
System.out.println("Max: 90kmph");
}
}
class Maruthi800 extends Maruthi{
void speed()
{
System.out.println("Max: 80kmph");
}
void model(){
System.out.println("Maruthi Model: 800");
}
}
class CarMultiLevel{
public static void main(String args[]){
Maruthi800 m8=new Maruthi800();
m8.vehicleType();
m8.brand();
m8.model();
m8.speed();
}
}