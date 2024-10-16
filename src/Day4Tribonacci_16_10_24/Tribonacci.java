package Day4Tribonacci_16_10_24;

import java.util.Scanner;

public class Tribonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number of terms");
        int n = s.nextInt();
        if(n<1){
            System.out.println("enter a positive number");
            return;
        }
        int a = 0,b=1,c=1;
        System.out.print(a + " "+b + " "+c+" ");
         for(int i =3;i<n;i++){
             int next = a+b+c;
             System.out.print(next + " ");
             a=b;
             b=c;
             c=next;
         }

    }
}
