package collectionFramework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Lab_rev_ArrayList {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(54);
        l.add(34);
        l.add(64);
        l.add(84);
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);

        Collections.sort(l,Collections.reverseOrder());
        System.out.println(l);


    }
}
