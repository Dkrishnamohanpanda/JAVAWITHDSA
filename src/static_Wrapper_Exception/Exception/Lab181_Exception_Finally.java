package static_Wrapper_Exception.Exception;

import java.util.Scanner;

public class Lab181_Exception_Finally {
    public static void main(String[] args) {
        Scanner sc = null;
        sc = new Scanner(System.in);
        int v = sc.nextInt();
        try {
            int a1 = 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("i will be executed");
            sc.close();
        }


    }
}
