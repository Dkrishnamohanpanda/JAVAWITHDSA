package Oops_Inheritance.single.real;

public class Testcase2 extends Common_Basetest {
    Testcase2(){
        System.out.println("Dc ----> Child");
    }

    void testcase2(){
        openFile();
        closeFile();
        readFile();
        System.out.println("Executing testcase2");

    }
}

