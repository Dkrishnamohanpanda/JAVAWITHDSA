package static_Wrapper_Exception;

public class Lab2_static {
    public static void main(String[] args) {
        A a;//only ref creation doesn't call sib
        new A();
        A a1 = new A();
    }

}
class A{
    {
        System.out.println("Instant initialization block");
    }
    static {
        System.out.println("Static Intialization Block");
    }
}
