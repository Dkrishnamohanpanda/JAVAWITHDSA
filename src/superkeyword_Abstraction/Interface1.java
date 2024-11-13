package superkeyword_Abstraction;

public class Interface1 {
}

class Boy implements Father1,Mother{
    @Override
   public void f1(){
        System.out.println();
    }
    @Override
    public void f2(){
        System.out.println();
    }
    @Override
    public void f3(){
        System.out.println();
    }
    @Override
    public void f4(){
        System.out.println();
    }
}
interface Father1{
    void f1();
    void f2();
//    void f3(){
//        System.out.println("Complete method are not allowed in interface ");
//    }
    default void f10(){

    }
    static void f11(){

    }


}
interface  Mother{
    void f2();
    void f3();

    void f4();
}