package collectionFramework.map;

import java.util.ArrayList;
import java.util.  HashMap;
import java.util.List;

public class Lab_Map_p4 {
    public static void main(String[] args) {
        HashMap<String,Object> students1 = new  HashMap();
        students1.put("name","Krishna");
        students1.put("Sec","B");
        students1.put("RollNo",549858756);
        System.out.println(students1);

        HashMap<String,Object> students2 = new  HashMap();
        students2.put("name","Krishna");
        students2.put("Sec","B");
        students2.put("RollNo",549858756);
        System.out.println(students2);

        List students = new ArrayList();
        students.add(students1);
        students.add(students2);
        System.out.println(students);


    }
}
