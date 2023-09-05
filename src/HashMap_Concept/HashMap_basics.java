package HashMap_Concept;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.*;

public class HashMap_basics {
    public static void main(String[] args) {

//       ( No order / no indexing
//        Stores value ---- Key Value<K,V>,
//        Key cannot br duplicate )       And Creation of HashMap below
//        can store n number of values but only one null key (v.Imp)
//        Hashmap is not Thread safe ot not Synchronized but hashTable is Thread Safe

        HashMap<String,String> capitalMap = new HashMap<String,String>();
//        <Key,Value>
        capitalMap.put("India", "Delhi");
        capitalMap.put("USA", "Washington");
        capitalMap.put("UK", "London");
        capitalMap.put("Japan", "Tokyo");
//        the key and value should not have duplicate if have dup it will take latest value
        capitalMap.put("UK", "London15");
        capitalMap.put(null,"Berlin");
        capitalMap.put(null,"LA");
        //        can store n number of null values but only one null key (v.Imp)
        capitalMap.put("Russia",null);
        capitalMap.put("France",null);
//        to remove
        capitalMap.remove("France");

//     To get the values from them
//        System.out.println(capitalMap.get("USA"));
        System.out.println(capitalMap.get("Japan"));
        //        the key and value should not have duplicate if have dup it will take latest
        System.out.println(capitalMap.get("USA"));

        System.out.println(capitalMap.get("Germany")); //It will return null
        System.out.println(capitalMap.get(null)); // this will return latest value
        System.out.println(capitalMap.get("France"));

//        Iterator:   over the keys:   to get the all key value from Hashmap
       Iterator<String> it1= capitalMap.keySet().iterator();
       while(it1.hasNext()){
          String key = it1.next(); //store in key of string
//           System.out.println("The keys are "+ key);
          String value = capitalMap.get(key); //get the value by get method of parameter key
           System.out.println("The Key is " + key + " And value is "+ value);
       }
        System.out.println("--------to print both key and value using EntrySet------");
//       Iterator : over the set (pair) : by using entrySet
        Iterator<Entry<String,String>> it2= capitalMap.entrySet().iterator();

//       while(it2.hasNext()){
//           Entry<String,String>entry = it1.next();
//           System.out.println("The Key is "+ entry.getKey() + " the values are " + entry.getValue());
//       }

        System.out.println("-----Iterate or print using forEach loop -----");
//       3.Iterate Hasmap using java 8 for each and lambda
        capitalMap.forEach((k,v)-> System.out.println("The key = "+k+" and value = "+k));

    }
}
