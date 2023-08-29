package ArrayListConcept;

import java.util.ArrayList;
import java.util.*;

public class VirtualCapacityofARRAY {
    public static void main(String[] args) {
//        Virtual Capacity of array = 10
        ArrayList<Object> ar = new ArrayList<Object>(15);
        System.out.println(ar.size()); //PC = 0;
        ar.add(5671);
        System.out.println(ar.size()); //PC = 1;
        ar.add(231);
        ar.add("Thaseen");
        ar.add(12);
        System.out.println(ar.size());







    }
}
