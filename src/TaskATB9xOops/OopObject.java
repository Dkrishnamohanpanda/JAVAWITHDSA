package TaskATB9xOops;

public class OopObject {
    void run(){
        System.out.println("i am running");
    }
    public static void main(String[] args) {
        System.out.println("1");
       OopObject dog = new OopObject();
        dog.run();
        dog.bark();
        Birds crow = new Birds();
        crow.fly();
    }
    public void bark(){
        System.out.println("vo vo vo");
    }

}
class Birds{
    void fly(){
        System.out.println("I am flying");
    }
}
