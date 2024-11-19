package static_Wrapper_Exception.Exception;
import java.io.FileReader;
import java.io.FileNotFoundException;
import  java.io.File;
class LabPracticeException{
    public static void main(String[] args) {
        try{
            int a = 10/0;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("unchecked exception");
        }

        try{
            FileReader f = new FileReader((new File("c://abc.txt")));
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("checked exception");
        }
    }

}