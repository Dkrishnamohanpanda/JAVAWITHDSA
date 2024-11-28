package collectionFramework.listAndSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LAb_Set {
    public static void main(String[] args) {
        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();
        hs.add("Krishna");
        hs.add("Krishna");
        hs.add("krishna");
        hs.add("krishna");
        System.out.println(hs);

    }
}
