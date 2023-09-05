package HashMap_Concept;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

//import static java.util.stream.Nodes.collect;

//import static java.util.stream.Nodes.collect;

public class _11_HashMap_Initializaytion {

    public static  Map<String,Integer> marksMap;
    static{
        marksMap = new HashMap<>();
        marksMap.put("A",100);
        marksMap.put("B",300);
    }
    public static void main(String[] args) {


//To initialize Hash
//        1.Using HashMap class
        HashMap<String, String> map1 = new HashMap<>();
        Map<String,String > map2 = new HashMap<>();

//        2.Static way: static hashmap

        System.out.println(_11_HashMap_Initializaytion.marksMap.get("B"));

//3. ImmutableMap with only one single Map
       Map<String,Integer> immap=  Collections.singletonMap("Test",1000);
        System.out.println(immap.get("Test"));
//        immap.put("Abd",400);//UnsupportedOperationException  and we cant store more than one in immutableMap

//  4.  JDK _8 :  To Map method
//        Creating one 2D Array of String using Stream and Collecting in the form Map
        Map<String,String> map4 = Stream.of(new String [][] {
            {"Thaseen","B Grade"},
            {"Mudassir","A Grade"},
//            {"Adnan","E Grade"},
        }).collect(Collectors.toMap(data -> data[0], data ->data[1]));

        System.out.println(map4.get("Thaseen"));
        map4.put("Afraz","C Grade");
        System.out.println(map4.get("Afraz"));

//   5. Using SimpleEntry:
        Map<String, String> Map5 = Stream.of(
                new AbstractMap.SimpleEntry<String, String>("Thaseen", "Java"),
                new AbstractMap.SimpleEntry<String, String>("Mudassir", "DotNet")
        ).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(Map5.get("Mudassir"));
        Map5.put("Tabrez","Flutter");
        System.out.println(Map5.get("Tabrez"));

        //JDK 1.9:
//        Empty map:
//        How to create Singleton map and one single key and value entry
//        Singleton map and one single key and value entry
        Map<String,String> emptyMap=Map.of();
//        emptyMap.put("Muzammil","Python");
//        System.out.println(emptyMap.get("Muzammil"));//UnsupportedOperationException

        Map<String,String>singlotonmap = Map.of("k1","v1");
        System.out.println(singlotonmap.get("k1"));
//        singlotonmap.put("k2","V2");//This will not come only single key and value will be stored

//        Multiple value Map:
        Map<String ,String > multiMap = Map.of("k1","v1","k2","v2","k3  ","v3");
        System.out.println(multiMap.get("k3"));

//        ofEntries method: No limitation on pairs (key value)
//        Immutable Maps: we cant add any except below
       Map<String, Integer> enMap= Map.ofEntries(
                new AbstractMap.SimpleEntry<>("A",100),
                new AbstractMap.SimpleEntry<>("B",200),
                new AbstractMap.SimpleEntry<>("C",300),
                new AbstractMap.SimpleEntry<>("D",400)
        );
        System.out.println(enMap.get("D"));
//        enMap.put("G",600);//UnsupportedOperationException can't add more than below we want to add we store initailze during the AbstractMap
//
//        Map<String,String>titleMap = ImmutableMap.of("Microsoft","Microsoft India","Flipkart","Flipkart Shopping");
//        titleMap.get("Flipkart");



    }

}
