package Oops_Inheritance.multilevel;

public class Lab_multilevel {
    public static void main(String[] args) {
        Child c = new Child();
        c.home();
        c.ch();
        c.f();
        c.gf();

        Father f = new Father();
        f.home();
        f.f();
        f.gf();

        Grandfather gf = new Grandfather();
        gf.gf();
        gf.home();

    }
}
