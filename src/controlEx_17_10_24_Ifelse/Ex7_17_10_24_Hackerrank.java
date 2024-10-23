package controlEx_17_10_24_Ifelse;

import java.util.Scanner;

public class Ex7_17_10_24_Hackerrank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int num = sc.nextInt();
        if(num >=90 && num <=100){
            System.out.println("grade A");
        } else if (num >=80 && num<90) {
            System.out.println("grade B ");
        } else if (num >=70 && num <80) {
            System.out.println("grade C");
        } else if (num >=60 && num <70) {
            System.out.println("grade D");
        }else if (num <=0 && num > 70) {
            System.out.println("Are you LOl");
            
        }
        else{
            System.out.println("Fail");
        }
    }
}
