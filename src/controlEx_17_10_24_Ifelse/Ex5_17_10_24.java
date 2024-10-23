package controlEx_17_10_24_Ifelse;

import java.util.Scanner;

public class Ex5_17_10_24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" Enter your no ,I will tell you even or odd");
        int num = s.nextInt();
        if (num %2 == 0){
            System.out.println("This is a even number");
        }else {
            System.out.println("This is a odd number ");
        }
    }
}
