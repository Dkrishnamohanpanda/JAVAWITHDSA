package typeCasting;

public class Implicit {
    public static void main(String[] args) {
        byte b = 123;
        byte c = 121;
        int d = b + c;
        System.out.println("Implicit typecasting(widening) " + d);
    }
}
