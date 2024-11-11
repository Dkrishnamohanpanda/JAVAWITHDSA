package Oops_constructor;

public class Car {
    String name ;
    int year;
    String model;

//    deafault constructor -> No Argument
    Car(){
        name = "unknown name";
        model = "xyz";
        year = 0;
        System.out.println("Default constructor will executed");
    }
}
