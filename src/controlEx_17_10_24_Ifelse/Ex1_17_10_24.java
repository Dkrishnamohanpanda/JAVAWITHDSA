package controlEx_17_10_24_Ifelse;

import java.util.Scanner;

public class Ex1_17_10_24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        if(age>18){
            System.out.println("Elligible for voting");
        }else{
            System.out.println("Not eligible for voting");
        }
    }
}
