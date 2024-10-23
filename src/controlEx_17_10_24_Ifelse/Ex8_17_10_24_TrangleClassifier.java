package controlEx_17_10_24_Ifelse;

import java.util.Scanner;

public class Ex8_17_10_24_TrangleClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side 1 ");
        double side1 = sc.nextDouble();
        System.out.println("Enter side 2 ");
        double side2 = sc.nextDouble();
        System.out.println("Enter side 3 ");
        double side3 = sc.nextDouble();

        if(side1<=0 || side2 <=0 || side3<= 0){
            System.out.println("Invalid input ");
        }
        else if (side1 == side2 && side2 == side3 && side1 == side3 ){
            System.out.println("The Triangle is is equilateral");
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            System.out.println("The triangle is isoscale");

        }else {
            System.out.println("The triangle is scalen");
        }

    }
}
