package TaskATB9x.Nov8;

public class Hirarchial {
    public static void main(String[] args) {
        Father f = new Father();
        f.gold();

        Mohan m = new Mohan();
        m.gold();

        Shasank s = new Shasank();
        s.gold();

    }
}
class Father{
    void gold(){
        System.out.println("50 kg gold");
    }
}
class Shasank extends Father{
    void gold(){
        System.out.println("20 kg gold");
    }
}

class Mohan extends Father{
    void gold(){
        System.out.println("2 kg gold");
    }
}