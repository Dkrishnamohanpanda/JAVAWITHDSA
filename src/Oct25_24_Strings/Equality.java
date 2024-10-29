package Oct25_24_Strings;

public class Equality {
    public static void main(String[] args) {
        String name = "Hello";//scp
        String name2 = "Hello";//scp
        String name3 = "Hello";//scp
        String name4 = "Hello";//1 string but reference has been changed

        String name5 = new String("Hello");//OA
        String name6 = new String("Hello");//OA
        String name7 = new String("Hello");//OA


        System.out.println(name2 == name6);
        System.out.println(name == name3);
        System.out.println(name5 == name7);


    }
}
