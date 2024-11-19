package static_Wrapper_Exception.Exception;

public class Lab182_Exception_Multiplecatch {
    public static void main(String[] args) {
        try {
            String ip = args[0];// ArrayindexOutOfBoundException
            int a = Integer.parseInt(ip);//NumberFormatException
            int b = 100/a;//ArithmeticException
            System.out.println(b);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());

        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());

        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        }
        finally {
            System.out.println("End");
        }
    }
}
