package Day4Tribonacci_16_10_24;

import java.util.Scanner;

public class TriboUsingFun {
    public static int tribonacci(int n){
        if(n == 0) return 0;
        if(n==1 || n==2) return 1;
        int a= 0,b=1,c=1;
        int next =0;
        for (int i =3;i<=n;i++){
            next = a+b+c;
            a=b;
            b=c;
            c=next;
        }return next;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no of terms");
        int n = s.nextInt();
        System.out.println("Tribonacci sequence");
        for(int i =0;i<n;i++){
            System.out.print(tribonacci(i)+ " ");
        }

    }
}
