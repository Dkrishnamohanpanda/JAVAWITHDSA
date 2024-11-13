package Oops_polymerphism.overriding;

public class Lab151 {
    public static void main(String[] args) {
        Mohan m = new Mohan();
        m.home(); //3

        Father f = new Father();
        f.home();//2
//    DYNAMIC DISPATCH
        Father f1 = new Mohan();
        f1.home();  //3
    }
}
class Father{
    void home(){
        System.out.println("2bhk");
    }

}
class Mohan extends Father{
    void home(){
        System.out.println("3 bhk");
    }
}
