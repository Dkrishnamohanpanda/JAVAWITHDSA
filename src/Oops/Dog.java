package Oops;

public class Dog {
    String color;
    int age;
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Dog d3 = new Dog();
        Dog d4 = new Dog();
        Dog d5 = new Dog();
        d5.sleep();
        d4.bark();
    }
    void sleep(){
        System.out.println("sleeping");
    }
    void bark(){
        System.out.println("vo vo vo");
    }
}
