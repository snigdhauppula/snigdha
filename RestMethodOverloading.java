class Restuarant{
void menu(){
System.out.println("1.idly 2.dosa 3.poori 4.wada");
}
void takeOrder(String order){
System.out.println("Order given id "+order);
}
void takeOrder(String order1,String order2){
System.out.println("Order given is "+order1+" and "+order2);
}
void takeOrder(String order1,String order2,String order3){
System.out.println("Order given is "+order1+" and "+order2+" and "+order3);
}
}
class RestMethodOverloading{
public static void main(String args[]){
Restuarant rest=new Restuarant();
rest.menu();
rest.takeOrder("dosa");
rest.takeOrder("dosa","poori");
rest.takeOrder("dosa","idly","poori");
}
}

