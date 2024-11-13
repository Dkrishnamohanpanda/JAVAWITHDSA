package superkeyword_Abstraction;



public class Super_key{
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }

}
class Car extends Vehicle{
    private int max_speed = 280;

    @Override
    void display() {
        System.out.println("Child");
    }
    Car(){
        super(10);
        System.out.println("Dc ---->Child");
        System.out.println(this.max_speed);
        this.display();
        System.out.println(super.max_speed);
        super.display();

    }

}
 class Vehicle {
    public int max_speed = 180;
    Vehicle(){
        System.out.println("Dc ----->parent");
    }
    Vehicle(int max_speed){
        System.out.println("Pc ----->parent");
    }

    void display(){
        System.out.println("parent");
    }
}
