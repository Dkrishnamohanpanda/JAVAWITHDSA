package collectionFramework.listAndSet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab_AL_iterate {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add("orange");
        l.add(45);
        l.add("banana");
        l.add("coconut");

        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
        for (Object c:l){
            System.out.println(c);

        }
        Iterator iterator = l.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }




    }

