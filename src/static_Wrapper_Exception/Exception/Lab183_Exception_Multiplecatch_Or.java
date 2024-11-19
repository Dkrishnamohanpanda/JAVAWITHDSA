package static_Wrapper_Exception.Exception;

public class Lab183_Exception_Multiplecatch_Or {
    public static void main(String[] args) {
        String ip = args[0];
        int a = Integer.parseInt(ip);
        try {
            int b = 100/a;
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException | ArithmeticException  e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Executed");
        }

    }
}
