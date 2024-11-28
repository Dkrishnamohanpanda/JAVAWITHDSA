package collectionFramework;
import java.util.Scanner;
import java.util.ArrayList;
public class Lab_ArrayList_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList();
        ArrayList<Integer> ages = new ArrayList();

        String continueInput = "Y";
        while(continueInput.equalsIgnoreCase("Y")){
            System.out.println("Enter your name");
            String name = sc.nextLine();
            names.add(name);

            System.out.println("enter your age");
            int age = sc.nextInt();
            ages.add(age);


            sc.nextLine();
            System.out.println("Do you want to enter new record? (Y/N): ");
            continueInput = sc.nextLine();

        }

//        Displaying
        System.out.println("Names"+ names);
        System.out.println("Ages"+ages);

        for(Object o1:names){
            System.out.println(o1);
        }
        for(Object o2:ages){
            System.out.println(o2);
        }

        sc.close();
    }
}
