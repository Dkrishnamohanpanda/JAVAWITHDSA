package collectionFramework.map;

import java.util.HashMap;
import java.util.Map;

public class Lab_Map_p2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap();
        map.put("id",1);
        map.put("id",2);
        map.put("id3",2);
        map.put("id4",5);
        map.put("id5",null);
        map.put("id6",null);
        map.put(null,102);
        map.put(null,107);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey(null));
        System.out.println(map.containsValue(102));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get("id3"));
    }
}
