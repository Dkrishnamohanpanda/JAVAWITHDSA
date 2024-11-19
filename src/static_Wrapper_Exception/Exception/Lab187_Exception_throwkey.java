package static_Wrapper_Exception.Exception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
public class Lab187_Exception_throwkey {
//    throws checkewd
    public static void main(String[] args) throws Exception{

            FileInputStream f1 = new FileInputStream("c://a.log");
        System.out.println("checked exception");


    }
}
