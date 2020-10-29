class Car{
void list(){
System.out.println("1.benz 2.bmw 3.maruthi 4.suzuki");
}
void takeCar(String order){
System.out.println("Car ordered is"+order);
}
String giveCar(){
return "maruthi";
}
int giveBill(){
return 300000;
}
String payBill(int amount){
System.out.println("amount given is"+amount);
return "paid";
}
}
class CarMethod{
public static void main(String args[]){
Car c=new Car();
c.list();
c.takeCar("maruthi");
System.out.println("Car given is "+c.giveCar());
System.out.println("Bill amount is "+c.giveBill());
System.out.println("is" + c.payBill(c.giveBill()));
}
}