package TaskATB9xOops.interfac;

public class Lab_pract {
}
interface  I{
    String name = "sheela";
    int age = 8;
    static String name1 = "krishna";

    void sing();
    default void dance(){

    }

    interface  Jee{
        void cry();


}
class Aja implements  I,Jee{
   public void sing(){
        System.out.println("Singing");
    }
    public void cry(){
        System.out.println("crying");
   }
}
}