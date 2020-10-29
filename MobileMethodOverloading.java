class Mobile{
void types(){
System.out.println("1.redmi 2.oneplus 3.iphone 4.vivo");
}
void takeMobile(String order){
System.out.println("item ordered is "+order);
}
void takeMobile(String order1,String order2){
System.out.println("item ordered is "+order1+" and "+order2);
}
void takeMobile(String order1,String order2,String order3){
System.out.println("item ordered is "+order1+" and "+order2+" and "+order3);
}
}
class MobileMethodOverloading{
public static void main(String args[]){
Mobile mbl=new Mobile();
mbl.types();
mbl.takeMobile("redmi");
mbl.takeMobile("oneplus","redmi");
mbl.takeMobile("oneplus","vivo","iphone");
}
}

