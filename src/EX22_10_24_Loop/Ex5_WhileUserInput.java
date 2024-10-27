package EX22_10_24_Loop;

public class Ex5_WhileUserInput {
    public static void main(String[] args) {
        //user input
        //i -> by using argument
        //ii -> by scanner class

        String age = args[0];
        int age1 = Integer.parseInt(age); // String -> Int
        System.out.println(age1);
        while(age1 > 0){
            System.out.println(age1);
            age1 --;
        }
    }
}
