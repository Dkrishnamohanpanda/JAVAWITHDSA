package Oops_Inheritance.single.Example1;

public class Si {
    public static void main(String[] args) {
//        son will get all atribute of father
//        Single inheritance
        Son d1 = new Son();
        d1.bhk2();
        d1.money = 75;
        d1.bhk3();

        Father f1 = new Father();
//        f1.bhk3(); father did not inherit
    }
}
