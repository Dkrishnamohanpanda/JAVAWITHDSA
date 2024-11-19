package static_Wrapper_Exception.Exception;

public class Lab185_Exception_trycatch {
    public static void main(String[] args) {
        final double pi = 3.14;
        int a = 0;
        try{
            int x = 10/a;
        }catch(Exception e){
            System.out.println("div by zero");

        }finally {
            System.out.println("i will be executed");
        }
    }
}
