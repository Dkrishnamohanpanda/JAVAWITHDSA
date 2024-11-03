package TaskATB9x;
import java.util.Scanner;
public class Task30_ReverseLeftAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            for(int j =5;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
