package Oops_constructor;

public class Constructors {
    public static void main(String[] args) {
        Car tesla = new Car();
        System.out.println(tesla.name);
        System.out.println(tesla.model);
        System.out.println(tesla.year);

        Car nano = new Car();
        nano.name = "Tata Nano";
        System.out.println(nano.name);
        nano.model = "Ev";
        System.out.println(nano.model);
        nano.year = 2024;
        System.out.println(nano.year);

    }
}

