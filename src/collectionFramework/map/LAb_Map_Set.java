package collectionFramework.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LAb_Map_Set {
    public static void main(String[] args) {
        Map<String,Object> student1 = new HashMap();
        student1.put("name","Krishna");
        student1.put("Rollno","34");
        student1.put("Mark",78);
        System.out.println(student1);


        Set book = new HashSet();
        book.add("Rich dad poor dad");
        book.add("Sapiens");
        book.add("Eat that frog");
        book.add("The intelligent investor ");
        System.out.println(book);





    }
}
