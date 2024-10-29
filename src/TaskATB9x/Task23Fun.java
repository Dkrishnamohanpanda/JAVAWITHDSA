package TaskATB9x;

import java.util.Scanner;

public class Task23Fun {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your first number :");
        int num1 =s.nextInt();
        System.out.println("Enter yopur second number :");
        int num2 =s.nextInt();

        System.out.println("Sum of two number is "+sum(num1,num2));
        System.out.println("sub of two number is "+sub(num1,num2));
        System.out.println("mul of two number is "+mul(num1,num2));
        System.out.println("div of two number is "+div(num1,num2));

    }
    static double sum(int num1,int num2){
        return num1+num2;
    }
    static double sub(int num1,int num2){
        return num1-num2;
    }
    static double mul(int num1,int num2) {
        return num1 * num2;
    }
    static double div(int num1,int num2){
        if(num2 !=0){
            return num1/num2;
        }else {
            System.out.println("you have enter invalid input");
        }
        return 0;
    }

}
