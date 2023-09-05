package Set_Concepts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _22_HashSetConcepts {
    public static void main(String[] args) {

        Set<String> hs = new HashSet<String>();
        hs.add("Alpha");
        hs.add("Testing");
        hs.add("Beta");
        hs.add("Testing");//we can't add duplicate if we add it will return once
        hs.add(null);

        System.out.println(hs);

        System.out.println(hs.contains("Testing"));

        System.out.println("===For Loop Iteration===");
//        For Loop
            for(String e: hs){
                System.out.println(e);
            }

//            Iterating
        System.out.println("---Iterating---");
        Iterator<String> its=hs.iterator();
            while(its.hasNext()){
                System.out.println(its.next());
            }
            hs.remove("Beta");
        System.out.println(hs);

        Set<Integer> first = new HashSet<Integer>();
        first.addAll(Arrays.asList(new Integer[] {1,2,4,5,6,8,9,13,56}));

        Set<Integer> second = new HashSet<Integer>();
        second.addAll(Arrays.asList(new Integer[] {0,3,7,10,12}));

        Set<Integer> thirs = new HashSet<Integer>();
        thirs.addAll(Arrays.asList(new Integer[] {0,1,3,2,7,5,7,9,13,32,0,32,445,10,12}));

//        Get the Union
        Set<Integer> union = new HashSet<Integer>(first);
        union.addAll(second);
        System.out.println(union);

        System.out.println("------");
//        Gettin the intersection
        Set<Integer> inters = new HashSet<Integer>(first);
        inters.retainAll(thirs);
        System.out.println(inters);

//        DIfferences
        System.out.println("Differnce(Removing common from two sets--");
        Set<Integer> differnc = new HashSet<Integer>(first);
        differnc.removeAll(thirs);
        System.out.println(differnc);

    }
}
