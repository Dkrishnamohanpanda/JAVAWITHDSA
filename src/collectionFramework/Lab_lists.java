package collectionFramework;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Lab_lists {
    public static void main(String[] args) {
        List mylist = new ArrayList();//searching is easy

        List mylist2 = new LinkedList();//insertion and deletion is easy

        List fruits = List.of("apple","Orange","waterMelon");
//        fruits.add("naspati");   UnsupportedOperationException
        System.out.println(fruits);
    }
}
