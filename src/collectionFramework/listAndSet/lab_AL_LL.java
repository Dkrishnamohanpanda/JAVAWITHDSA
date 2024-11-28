package collectionFramework.listAndSet;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class lab_AL_LL {
    public static void main(String[] args) {
        List my_list1 = new ArrayList();
        my_list1.add("Node 1");
        my_list1.add("Node 2");
        my_list1.add("Node 3");
        my_list1.add("Node 4");
        System.out.println(my_list1);
//the only difference is how t6hey have stopred
//        Arraylist stored contigously and linked list stored randomly

        List my_list2 = new LinkedList();
        my_list2.add("Node 1");
        my_list2.add("Node 2");
        my_list2.add("Node 3");
        my_list2.add("Node 4");
        System.out.println(my_list2);

    }
}
