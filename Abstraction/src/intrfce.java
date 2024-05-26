interface Animals{
    int eyes=2;
     void walk();

}
interface Herb{
    void eats();
}
class Hen implements Animals,Herb{
    String name;
    static String breed; // cannot acces through object it can accs through class name Hen
    int age;
    Hen(String n, int a){
        this.name=n;
        this.age=a;
    }
    public void printinfo(){
        System.out.println("Name of hen is "+ this.name);
        System.out.println("Age of hen is"+this.age);
        System.out.println("Breed is "+breed);
    }
   public void walk(){
       System.out.println("Hen walks");
    }
    public void eats(){
        System.out.println("Hen eats plants");
    }
    public static void changeBreed(){
        breed="All";
    }
}
public class intrfce {
    public static void main(String[] args){

        Hen h1=new Hen("Hen 1",3);
        Hen h2 = new Hen("Hen 2",5);
        h1.eats();
        h1.walk();
        Hen.changeBreed();

        h2.printinfo();

    }
}
