package collectionFramework;

import java.util.ArrayList;

public class Lab2_Collectionframework {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add("1");
        l.add("2");
        l.add("3");
        l.add("3");
        System.out.println(l.size());
        System.out.println(l.contains("1"));
        System.out.println(l.contains(1));
        System.out.println(l.isEmpty());
        System.out.println(l.indexOf("3"));
        System.out.println(l.lastIndexOf("3"));

    }
}
