package Control2Ex_18_10_24_Switch;

import java.util.Scanner;

public class Ex2_18_10_24_Case_Sensitivity {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your Browser :");
            String browser = sc.next();
            browser = browser.toLowerCase();

            switch (browser){
                case "chrome":
                    System.out.println("Starting the chrome ");
                    System.out.println("................. ");
                    break;

                case "firefox":
                    System.out.println("Starting the firefox ");
                    System.out.println("................. ");
                    break;
                case "edge":
                    System.out.println("Starting the edge ");
                    System.out.println("................. ");
                    break;
                default:
                    System.out.println("opera is not supported selenium webdriver now");
                    System.out.println("i am no idea wich browser you using");
                    break;
            }
        }
    }

