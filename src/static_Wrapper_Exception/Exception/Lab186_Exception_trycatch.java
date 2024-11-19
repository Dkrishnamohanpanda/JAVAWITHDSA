package static_Wrapper_Exception.Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab186_Exception_trycatch {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("unchecked Exception");
        }
        try{
            FileReader f = new FileReader(new File("c://abc.txt"));
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("checked Exception");
        }

    }
}
