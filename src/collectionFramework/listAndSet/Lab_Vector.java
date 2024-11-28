package collectionFramework.listAndSet;

import java.sql.SQLOutput;
import java.util.Enumeration;
import java.util.Vector;

public class Lab_Vector {
    public static void main(String[] args) {
        Vector<String> v = new Vector();
       v.add("Dapple");
        v.add("Aapple");

        v.add("WaterMelon");
        v.add("WaterMelon");
        v.add("Kiwi");
        System.out.println(v);

        for(String s :v){
            System.out.println(s);
        }
        System.out.println("---------------------");
        Enumeration<String> enumeration = v.elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());

        }
    }
}
