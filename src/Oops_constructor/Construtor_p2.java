package Oops_constructor;

import java.util.Scanner;

public class Construtor_p2 {
    public static void main(String[] args) {
        Car2 t1 = new Car2("toyota",2024);
        System.out.println(t1.model);
        System.out.println(t1.year);
        t1.display();



        Car2 t2 = new Car2("nano",2022);
        System.out.println(t2.model);
        System.out.println(t2.year);
        t2.display();


//     Taking user  input
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the model name ");
        String model_input = sc.next();
        System.out.println("Enter the year");
        int name_input = sc.nextInt();

        Car2 t3 = new Car2(model_input,name_input);
        System.out.println(t3.model);
        System.out.println(t3.year);
        t3.display();

    }
}

class Car2{
    String model;
    int year;
//    Parameterized constructor:Take the value and assigned it
    Car2(String model_name,int year_created){
        System.out.println("parameterized constructor");
        this.model = model_name;
        this.year = year_created;

    }
    void display(){
        System.out.println("Car2 details ->"+this.model+"--- "+this.year);
    }
}
