package HashMap_Concept;


import java.util.Map;
import java.util.HashMap;

public class _10_Internal_working_Hashmap {
    public static void main(String[] args) {

//        HashMap Doesn't Maintain Order and if node of LinkedList is 8  it will convertred into balanced Binary Tree

        Map<String,Integer> marks = new HashMap<String, Integer>();
        marks.put("Nav",100);
        marks.put("Thaseen",200);
        marks.put("Tom",300);
        marks.put("Lisa",400);
        marks.put("Peter",600);
//        marks.put(null,500);
        marks.put(null,700);
        marks.put("Nav",900);

//        Hashing: hashCode ---> hashing


        System.out.println(marks.get("Lisa"));
        System.out.println(marks.get("Nav"));
        System.out.println(marks.get("Thaseen"));
        System.out.println(marks.get(null));

//        Hashcode of null is Always Zero
        }
    }

