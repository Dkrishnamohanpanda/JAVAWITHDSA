package static_Wrapper_Exception.Exception;

public class Lab180_Exception {
    public static void main(String[] args) {
        int a = 0;
        int c = 0;
        try {
            c = 10 /a ;
        }
         catch (Exception e) {
            System.out.println(e.getMessage());
        }
        catch (Throwable e) {
            System.out.println(e.getMessage());
        } //java.lang.Airthmetic

        System.out.println(c);
    }
}
