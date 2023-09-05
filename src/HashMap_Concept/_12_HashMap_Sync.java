package HashMap_Concept;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class _12_HashMap_Sync {
    public static void main(String[] args) {

        Map<String,String> map1 = new HashMap<String,String>();
        map1.put("1","Thaseen");
        map1.put("2","Ahmed");
        map1.put("3","Saad");
        map1.put("4","Mohammed");
//        the below is Hashmap

//        create SynchronizedMap
        Map<String,String> synMap= Collections.synchronizedMap(map1);
        System.out.println(synMap);

//        Concurrent Hashmap: It does not throw any ConcurrentModificationException

        ConcurrentHashMap<String,String> concurrmap =new ConcurrentHashMap<>();
        concurrmap.put("A","Ruby");
        concurrmap.put("B","Lisa");
        concurrmap.put("C","Glad");
        concurrmap.put("D","Nitish");

        System.out.println(concurrmap);
        System.out.println(concurrmap.get("C"));


    }
}
