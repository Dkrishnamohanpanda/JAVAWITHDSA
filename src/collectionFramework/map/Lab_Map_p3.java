package collectionFramework.map;

import java.util.HashMap;
import java.util.Map;

public class Lab_Map_p3 {
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

        for(Map.Entry<String,Integer> item:map.entrySet()){
            System.out.println(item.getKey()+"----->"+item.getValue());
        }
    }
}
