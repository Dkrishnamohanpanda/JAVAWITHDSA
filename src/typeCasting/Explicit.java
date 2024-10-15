package typeCasting;

public class Explicit {
    public static void main(String[] args) {
        long a = 100000;
        long b = 500000;
        int  c = (int)(a + b);
        System.out.println(c); //explicit narrowing

    }
}
