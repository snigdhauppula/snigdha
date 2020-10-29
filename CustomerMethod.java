class Restuarant{
void menu(){
System.out.println("1.idly 2.dosa 3. wada 4. poori");
}
void takeOrder(String order){
System.out.println("order given is "+order);
}
String serveFood(){
return "Dosa";
}
int giveBill(){
return 556;
}
String payBill(int amount){
System.out.println("amount given is "+amount);
return "paid";
}
}
class CustomerMethod{
public static void main(String args[]){
Restuarant r=new Restuarant();
r.menu();
r.takeOrder("dosa");
System.out.println("food served is "+r.serveFood());
System.out.println("bill is "+r.giveBill());
System.out.println("bill" +r.payBill(556));
}
}
