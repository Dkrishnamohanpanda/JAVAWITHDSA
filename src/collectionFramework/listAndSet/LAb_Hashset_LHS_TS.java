package collectionFramework.listAndSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LAb_Hashset_LHS_TS {
    public static void main(String[] args) {
        Set hs = new HashSet();

        hs.add("Apple");
        hs.add("WaterMelon");
        hs.add("WaterMelon");
        hs.add("null");
        hs.add("null");
        System.out.println(hs);

        Set lhs = new LinkedHashSet();
//The order will be maintain in LinkedHasSet
        lhs.add("Apple");
        lhs.add("WaterMelon");
        lhs.add("WaterMelon");
        lhs.add("null");

        System.out.println( lhs);
        System.out.println( lhs.isEmpty());
        System.out.println( lhs.contains("Apple"));
        System.out.println( lhs.size());

        Set ts = new TreeSet();
//        Set<String> ts = new TreeSet();
//        Automatically sort
        ts.add("Dapple");
        ts.add("Aapple");

        ts.add("WaterMelon");
        ts.add("WaterMelon");
        ts.add("Kiwi");
//        ts.add(null); we can not add null into treeset
//        it will throw null pointer exception
//        ts.add(123); we can not add integer (DIfferent datatype) sorting is not possible
        System.out.println(ts);



    }
}
