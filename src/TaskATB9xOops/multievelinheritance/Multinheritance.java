package TaskATB9xOops.multievelinheritance;

public class Multinheritance {
    public static void main(String[] args) {
        Pintu pk = new Pintu();
        pk.wife();
        pk.maikina();
        pk.maipa();


    }



}
class Pintu extends Jama{
    void wife(){
        System.out.println("pintu wife banita bhauni");
    }
    }


class Jama extends Dukha{
    void maikina(){
        System.out.println("Banita jama maikina");
    }
}
class Dukha{
    void maipa(){
        System.out.println("Jayanti ");
    }
}