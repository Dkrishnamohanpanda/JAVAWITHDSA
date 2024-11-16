package static_Wrapper_Exception.Exception;

public class Exception_Handle {
    public static void main(String[] args) {
        System.out.println("start the programme");
        String s1 = null;
        try{
            s1.trim();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("End of programme");
    }
}
