package Ex_Function;

import java.util.Scanner;

public class ExFun2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter your name");
        String name = s.next();
        String greetings =greet(name);
        System.out.println(greetings);

    }
    static String greet(String name){
        String messege = "Hello "+name;
        return messege;
    }
}
