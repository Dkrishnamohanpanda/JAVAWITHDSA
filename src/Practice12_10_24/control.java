package Practice12_10_24;

import java.util.Scanner;

public class control {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int no1 = s.nextInt();
        int no2 = s.nextInt();
        if (no1 == no2){
            System.out.println("no1 is equals to no2");
        } else if (no1>no2) {
            System.out.println("no1 is greter than no2");
        }else {
            System.out.println("no1 is smaller than no2");
        }
    }
}
