package Oops_polymerphism.overriding;

public class Lab150 {
    public static void main(String[] args) {
        Hound h1 = new Hound();
        h1.bark();
    }
}
class Dog{
    void bark(){
        System.out.println("Dog is barking");
    }

}

class Hound extends Dog{

    @Override

    void bark(){
        System.out.println("Hound will bark");
    }
}
