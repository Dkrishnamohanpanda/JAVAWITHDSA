package TaskATB9x.Nov8;

public class Multilevel {
    public static void main(String[] args) {
        Urus ur = new Urus();
        ur.start();
        ur.swtch();

        Lam l1= new Lam();
        l1.start();
        l1.swtch();


    }

}
class Vehicle{
    void start(){
        System.out.println("Just started");
    }
}

class Lam extends Vehicle{
    void start(){
        System.out.println(" started  15 min ago");
    }
    void swtch(){
        System.out.println("Switches color");
    }
}
class Urus extends Lam{
    void start(){
        System.out.println("Vroom.........");

    }
}
