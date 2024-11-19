package static_Wrapper_Exception.Exception;

public class Lab187_Finally_NotExecuted {
    public static void main(String[] args) {
        try{
//            int a = 10/0;
//            in this case finally will not executed
            int a = 10/10;

            System.exit(0);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("unchecked exception");
        }
    }
}
