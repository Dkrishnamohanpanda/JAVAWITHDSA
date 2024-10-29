package TaskATB9x;

import java.util.Locale;
import java.util.Scanner;

public class Task22Oct2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your string");
        String input = s.nextLine().toLowerCase( );
        int vowel = 0;
        int consonant = 0;

        for(int i = 0;i<input.length();i++){
            char ch = input.charAt(i);
            if(ch =='a' || ch =='e' || ch =='i' || ch == 'o' || ch =='u'){
                vowel ++;
            }else if (ch >='a' && ch <='z'){
              consonant ++;
            }

        }
        System.out.println("No of vowels" + vowel);
        System.out.println("No of consonant " + consonant);
    }
}
