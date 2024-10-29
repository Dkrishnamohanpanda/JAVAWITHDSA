package Oct25_24_Strings;

public class Equals {
    public static void main(String[] args) {
        // == -> It check reference location
        // equalsto -> it will check value


        String name = "Hello";//scp
        String name2 = "Hello";//scp
        String name3 = "Hello";//scp
        String name4 = "Hello";// 1 string but reference has been changed

        String name5 = new String("Hello");//OA
        String name6 = new String("Hello");//OA
        String name7 = new String("Hello");//OA
        String name8 = new String("hello");//OA

        System.out.println(name2.equals(name5));//true
        System.out.println(name5.equals(name7));//true
        System.out.println(name8.equals(name5));//false
        System.out.println(name8.equalsIgnoreCase(name5));//true


    }
}
