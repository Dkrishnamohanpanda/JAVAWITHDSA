package TaskATB9x;

import java.util.Scanner;

public class Task22Oct1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse");
        int num = sc.nextInt();
        int reverse = 0;
        while(num != 0){
            int digit = num%10;
            reverse = reverse *10 +digit;
            num = num/10;

        }
        System.out.println(reverse);
    }
}
