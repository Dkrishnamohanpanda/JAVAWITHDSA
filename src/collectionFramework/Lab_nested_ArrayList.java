package collectionFramework;
import java.util.List;
import java.util.ArrayList;

public class Lab_nested_ArrayList {
    public static void main(String[] args) {
        List fruits1 = new ArrayList();
        fruits1.add("Apple");
        fruits1.add("Orange");
        fruits1.add("grapes");
        System.out.println( fruits1);

        List fruits2 = new ArrayList();
        fruits2.add("Dragon");
        fruits2.add("cherry");
        fruits1.add("SugarCane");
        System.out.println(fruits2);

        List allFruits = new ArrayList();
        allFruits.add(fruits1);
        allFruits.add(fruits2);
        System.out.println(allFruits);
    }
}
