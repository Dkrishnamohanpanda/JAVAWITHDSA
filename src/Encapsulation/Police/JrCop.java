package Encapsulation.Police;

public class JrCop {
    public static void main(String[] args) {
        Cop crp = new Cop(23);
        System.out.println(crp.gun);
//      System.out.println(crp.name);
         System.out.println(crp.car);
//        protected methods are only use by the class present in same package
// protected methods are not accessible by the class present outside the package
//  private methods,object are only use by the same class
    }
}
