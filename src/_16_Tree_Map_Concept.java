import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class _16_Tree_Map_Concept {
    public static void main(String[] args) {

        TreeMap<Integer,String> Tmap = new TreeMap<>();
        Tmap.put(51000,"Thaseen");
        Tmap.put(23000,"Ahmed");
        Tmap.put(30000,"Adnan");
        Tmap.put(14000,"Afraz");
        Tmap.put(1100,"Mudassir");

        System.out.println(Tmap);

//        Tmap.forEach((k,v) -> System.out.println("Key = "+ k+" And Value ="+v));
//        System.out.println(Tmap.lastKey());
//        System.out.println(Tmap.firstKey());
       Set<Integer> KeyslessThan30K=  Tmap.headMap(30000).keySet();
//        System.out.println(KeyslessThan30K);
        Set<Integer> keygreatthan3k=Tmap.tailMap(30000).keySet();
//        System.out.println(keygreatthan3k);


        TreeMap<String,Integer> Usermap = new TreeMap<>();
        Usermap.put("James", 200);
        Usermap.put("Bond", 100);
        Usermap.put("smith", 400);
        Usermap.put("Glad", 800);
        Usermap.put("Lisa", 160);
        Usermap.put("Aaroon", 160);
        Usermap.put("Roy", 50);
        Usermap.put("Paul", 900);
        Usermap.put("John", 1200);
        Usermap.forEach((k,v) -> System.out.println("Key = "+ k+" And Value ="+v));

        TreeMap<Integer,String> remap = new TreeMap<>(Comparator.reverseOrder());
        remap.put(51000,"Thaseen");
        remap.put(23000,"Ahmed");
        remap.put(30000,"Adnan");
        remap.put(14000,"Afraz");
        remap.put(1100,"Mudassir");

        System.out.println(remap);

    }
}
