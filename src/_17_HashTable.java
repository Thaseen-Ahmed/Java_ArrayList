import java.util.Hashtable;

public class _17_HashTable {
    public static void main(String[] args) {
        Hashtable<String,Integer> ht = new Hashtable<>();
        ht.put("Nav",100);
        ht.put("Thaseen",200);
        ht.put("Tom",300);
        ht.put("Lisa",400);
        ht.put("Peter",600);
        ht.put("Nav",900);
//        ht.put(null,500);
//        ht.put(null,700);
        System.out.println(ht.get("Lisa"));
        System.out.println(ht.get("Peter"));
        System.out.println(ht.get("Thaseen"));


    }
}
