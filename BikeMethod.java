class Bike{
void models(){
System.out.println("1.pulsar 2.honda 3. duke ");
}
void takeBike(String order){
System.out.println("Bike ordered is "+order);
}
String giveBike(){
return "pulsar";
}
int giveBill(){
return 3500000;
}
String payBill(int amount){
System.out.println("amount given is "+amount);
return "paid";
}
}
class BikeMethod{
public static void main(String args[]){
Bike bk=new Bike();
bk.models();
bk.takeBike("pulsar");
System.out.println("car given is "+bk.giveBike());
System.out.println("bill is "+bk.giveBill());
System.out.println("bill" +bk.payBill(3500000));
}
}
