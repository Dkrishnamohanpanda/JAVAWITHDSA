package Encapsulation.Thief;

import Encapsulation.Police.Cop;

public class Criminal {
    public static void main(String[] args) {
        Cop cp = new Cop(10);
        System.out.println(cp.gun);
        System.out.println(cp.canIShoot());
        System.out.println( cp.i_card);
//        System.out.println( cp.name);
//        System.out.println(cp.car);
    }
}
//public class,method ,keyword can accessible by different  class present on same package and different package
