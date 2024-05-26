
abstract class Animal{

    Animal(){
        System.out.println("Animal constrctr created");
    }
    abstract void walk();
    public void eat(){
        System.out.println("Animal eats");
    }
}
class Horse extends Animal{

    Horse(){
        System.out.println("created horse constructor");
    }
    public void walk(){
        System.out.println("Horse have 4 legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Chicken having 2 legs");
    }
}
public class abs {
    public static void main(String[] args) {
        Horse h1=new Horse(); //base class constrct will initiate and thus called constrctr chaining
        h1.walk();
        h1.eat();
        Chicken c1=new Chicken();

        }
    }