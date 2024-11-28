package collectionFramework.map;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Lab_Map_p5_Hashtable {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht1 = new Hashtable();
        ht1.put(1,"one");
        ht1.put(2,"two");
        ht1.put(3,"three");
        ht1.put(4,"four");
//        ht1.put(null,"one");
//        ht1.put(null,"null");
        System.out.println(ht1);
//        null key and null vbalue both are not allowed


        HashMap<Integer,String> ht2 = new HashMap();
        ht2.put(1,"one");
        ht2.put(2,"two");
        ht2.put(3,"three");
        ht2.put(null,"four");
        ht2.put(5,"null");
        System.out.println(ht2);
//        null key and null value allowed in hashmap but not alloweed oin hash table

        Enumeration<Integer> e = ht1.keys();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
