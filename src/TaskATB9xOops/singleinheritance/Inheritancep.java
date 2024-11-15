package TaskATB9xOops.singleinheritance;

public class Inheritancep {
    public static void main(String[] args) {
        Bhanja bh = new Bhanja();
        bh.purse();
       Mamu m = new Mamu();
       m.money = 500;
       m.name = "Krishna";
       m.purse();
    }
}
class Bhanja extends Mamu {
    void purse(){
        System.out.println("Mamu de");

    }
}


class Mamu {
    String name;
    int money;

    void purse() {
        System.out.println("More money in method overloading");
    }
}
