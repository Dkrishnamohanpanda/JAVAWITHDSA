package static_Wrapper_Exception.Exception;

public class Lab_Exception {
    public static void main(String[] args) {
        System.out.println("Start of programme");
        String ip = args[0];//if we don't enter any value -> ArrayindexoutofBoundException
        int a = Integer.parseInt(ip);//"Pramod" ->NumberFormat Exception
        int b =1000/a ; //Airthmatic exception /by 0
        System.out.println(b);
    }
}
