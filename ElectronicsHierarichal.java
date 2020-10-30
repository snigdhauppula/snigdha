class Electronics{
void types(){
System.out.println("1.mobile 2.laptop 3.tv");
}
}
class Mobiles extends Electronics{
void models(){
System.out.println("redmi,vivo");
}
}
class Redmi extends Electronics{
void ram()
{
System.out.println("4GB,6GB,8GB");
}
}
class ElectronicsHierarichal{
public static void main(String args[]){
Mobiles mbl=new Mobiles();
Redmi r=new Redmi();
mbl.types();
mbl.models();
r.types();
r.ram();
}
}