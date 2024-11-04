package arrays;
import java.util.Scanner;
public class ArrayUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        int size = sc.nextInt();
        int [] numbers =sc.nextInt(size);
    }
}
