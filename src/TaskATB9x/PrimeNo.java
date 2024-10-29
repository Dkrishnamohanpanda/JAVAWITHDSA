package TaskATB9x;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no  you want to check");
        int num = s.nextInt();
        boolean isPrime = true;
        if(num <=1){
        isPrime  = false;

        }else {
            for(int i =2;i <=Math.sqrt(num);i++){
                if(num %i == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("No is Prime" + isPrime);
            }else {
                System.out.println("No is not prime " + isPrime);
            }

        }
    }
}
