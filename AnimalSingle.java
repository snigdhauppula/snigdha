class Animal{
void eat(){
System.out.println("eating");
}
void run(){
System.out.println("dog runs");
}
}
class Dog extends Animal{
void bark(){
System.out.println("barking");
}
void sound(){
System.out.println("woof");
}
}
class AnimalSingle{
public static void main(String args[]){
Dog d=new Dog();
d.run();
d.bark();
d.eat();
d.sound();
}
}