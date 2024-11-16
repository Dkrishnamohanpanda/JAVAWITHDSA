package Oops_polymerphism.overloading;

public class    Lab149 {
    public static void main(String[] args) {
        Mathoperation mp = new Mathoperation();
        mp.add();
        mp.add(8,9);
        mp.add(3.4F,6.7F,8.9F);

    }
}
// Method overloading : with in same class, same method name but different parameter
class Mathoperation{
    int add(int a,int b){
        return a+b;
    }
    void add( ){
        System.out.println("not add");
    }
   float add(float a,float b,float c){
        return a+b;
    }
}
