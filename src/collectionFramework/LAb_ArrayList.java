package collectionFramework;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LAb_ArrayList {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add("Bread");
        l.add("Butter");
        l.add("milk");
        l.add("cofee");
        l.add("orange");
        l.add("Ghee");
        l.add(123);
        System.out.println(l);
        System.out.println(l.size());
        System.out.println(l.contains("milk"));
        System.out.println(l.isEmpty());

        System.out.println("------default for loop");
        for(int i =1;i<l.size();i++){
            System.out.println(l.get(i));
        }

//        System.out.println("----for each loop");
//        for(Object o:l){
//            System.out.println(o);
        System.out.println("--------for each loop");
        for(Object c : l){
            System.out.println(c);
        }//for each loop only avaiable to list not for set ANd Map

//        Iterator iterator = l.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
        Iterator iterator = l.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

//      Iterator iterator1 = l.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
        Iterator iterator2 = l.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
