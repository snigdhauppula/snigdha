interface Building{
void height();
}
interface Appartment{
void height();
}
class Room implements Building,Appartment{
public void height()
{
System.out.println("800meters");
}
}
class RoomInterface{
public static void main(String args[]){
Room r=new Room();
r.height();
}
}