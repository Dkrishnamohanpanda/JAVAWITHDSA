package controlEx_17_10_24;

import java.util.Scanner;

public class Ex6_17_10_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1");
        int num1 = sc.nextInt();
        System.out.println("Enter number2");
        int num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("num1 > num2");
        } else if (num1 < num2) {
            System.out.println("num2 >num1");
        }else {
            System.out.println(" num1 equals  num2");
        }
    }
}
