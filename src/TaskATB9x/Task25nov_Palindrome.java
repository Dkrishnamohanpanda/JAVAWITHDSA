package TaskATB9x;

import java.util.Scanner;

public class Task25nov_Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your string");
        String original  =s.next();
        String normalized =original.replaceAll("","").toLowerCase();

        String reversed ="";
        for(int i= normalized.length() -1;i>=0;i--){
            reversed = reversed +normalized.charAt(i);
        }
        if(reversed.equals(normalized)){
            System.out.println("String original " +original +" is palindrome");
        }else {
            System.out.println("String original" +original +" is not palindrome");
        }

    }
}
