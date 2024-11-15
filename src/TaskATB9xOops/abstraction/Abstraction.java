package TaskATB9xOops.abstraction;

public class Abstraction {
    public static void main(String[] args) {
        Tata t = new Tata();
        t.tatahyva();
    }

}
class Tata extends Truck{
    void tube(){
        System.out.println("it will be hidden");
    }
    void kilometer(){
        System.out.println("Tube needs to be change" );
    }
    void tatahyva(){
        tube();
        kilometer();
    }

}
abstract class Truck{
    abstract void tube();
    abstract void kilometer();
    static void renchi(){

    }
    void light(){
        System.out.println("light is on");
    }


}