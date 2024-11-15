package superkeyword_Abstraction;

public class Abstraction2 {
    public static void main(String[] args) {
        Wagnor wg = new Wagnor();
        wg.drive();
        wg.wheel();
        wg.eat();
//        Engine e = new Engine() ;
//         e.wheel();
    }
}
class Wagnor extends Engine{
   public String wheel(){
        System.out.println("Wheel is running");
        return null;
    }
   public  String steering(){
        System.out.println("steering of wagnor");
        return null;
    }
    public void drive(){
         steering();
          wheel();
    }
}
 abstract class Engine{
    abstract String wheel();
    abstract String steering();
    void eat(){
        System.out.println("i am eating");
    }
}
//if anything is incomplete then we are noit ab;e to create the object
//no object created in abstract class and method /interface