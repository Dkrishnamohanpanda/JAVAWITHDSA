package TaskATB9xOops.hierarchicalinheritance;

public class Bina {
    public static void main(String[] args) {
        Kalia k = new Kalia();
        k.glamour();
        k.home();

        Balia b = new Balia();
        b.maestro();
        b.home();

        Niru n = new Niru();
        n.home();
    }
}
class Kalia extends Niru{
    void glamour(){
        System.out.println("ya ra khali glamour ta re");
    }
}
class Balia extends Niru{
    void maestro(){
        System.out.println("Balia ra khali maestro");
    }
}
class Niru{
    void home(){
        System.out.println("Aeta mo swamy ghara");
    }
}
