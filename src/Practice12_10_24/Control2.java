package Practice12_10_24;

import java.util.Scanner;

public class Control2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int button = s.nextInt();
        switch (button){
            case 1: System.out.println("Hello");
            break;
            case 2:System.out.println("Namaste");
            break;
            case 3 :System.out.println("Bonzur");
            break;
            default:System.out.println("Invalid Input");
        }
    }
}
