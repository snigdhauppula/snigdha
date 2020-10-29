class Bike{
void models(){
System.out.println("1.pulsar 2.ktm 3.duke 4.bmw");
}
void takeBike(String order){
System.out.println("item ordered is "+order);
}
void takeBike(String order1,String order2){
System.out.println("item ordered  is "+order1+" and "+order2);
}
void takeBike(String order1,String order2,String order3){
System.out.println("item ordered  is "+order1+" and "+order2+" and "+order3);
}
}
class BikeMethodOverloading{
public static void main(String args[]){
Bike b=new Bike();
b.models();
b.takeBike("pulsar");
b.takeBike("pulsar","ktm");
b.takeBike("pulsar","ktm","duke");
}
}

