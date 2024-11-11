package TaskATB9x.Nov8;

public class Methodoverriding1 {
    public static void main(String[] args) {
        Hyna h = new Hyna();
        h.bark();

    }
}

class Dog{
    void bark(){
        System.out.println("Dog is barking");
    }
}
class Hyna extends Dog{
    @Override
    void bark(){
        System.out.println("Hyna is barking");
    }

}