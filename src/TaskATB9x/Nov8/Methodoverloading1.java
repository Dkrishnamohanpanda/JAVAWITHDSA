package TaskATB9x.Nov8;

public class Methodoverloading1 {
    public static void main(String[] args) {
        Mathoperation mp = new Mathoperation();
        System.out.println(mp.add(3.4f,6.7f,8.9f));
        System.out.println(mp.add(5,8));

    }
}
class Mathoperation{

    int add(int a , int b){
        return a+b;
    }
    float add(float a , float b,float c){
        return a+b+c;
    }
}