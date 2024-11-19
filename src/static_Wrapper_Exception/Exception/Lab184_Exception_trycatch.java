package static_Wrapper_Exception.Exception;

public class Lab184_Exception_trycatch {
    public static void main(String[] args) {
        try {
            String ip = args[0];// ArrayindexOutOfBoundException
            int a = Integer.parseInt(ip);//NumberFormatException
            int b = 100/a;//ArithmeticException
            System.out.println(b);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        finally {
            System.out.println("End of thye programme");
        }
    }
}

