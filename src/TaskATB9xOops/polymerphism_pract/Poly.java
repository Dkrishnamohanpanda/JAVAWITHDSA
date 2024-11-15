package TaskATB9xOops.polymerphism_pract;

public class Poly {
    String name;
    int age;
    Poly(){
        System.out.println("Dc ---> poly");
    }
    Poly(String name ){
        this.name = name;
    }
    void display(){
        System.out.println("Sabu bp aji dekhibi");
    }
    void display(String name,int age){
        System.out.println("Sabu bp aji dekhibi,Tate gehibi ");
    }


}
class Moly extends Poly{
    @Override
    void display(String name, int age) {
        super.display();
        System.out.println(super.age);
        System.out.println("Moly mgh ploy thu sana");
    }
}
