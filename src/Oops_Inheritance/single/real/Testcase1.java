package Oops_Inheritance.single.real;

public class Testcase1 extends Common_Basetest {
    Testcase1(){
        System.out.println("Dc ----> Child");
    }

    void testcase1(){
       openFile();
       closeFile();
       readFile();
    }
}
