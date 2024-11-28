package collectionFramework;
import java.util.Vector;
public class Lab_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("Krishna");
        v.add("Mohan");
        v.add("panda");
        System.out.println(v);
        v.remove("panda");
        System.out.println(v);
        System.out.println(v.contains("Mohan"));//return boolen value

    }
}
