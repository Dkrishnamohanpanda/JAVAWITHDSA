package Ex_Function;

public class ExFunScope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = " krishna";
        {

            int c = 23;
            int d = 45;
            System.out.println(c);
            System.out.println(a);
            a=100;
            name = "mohan";
        }

        System.out.println(a);
//        System.out.println(d);
        System.out.println(name);
    }

}
