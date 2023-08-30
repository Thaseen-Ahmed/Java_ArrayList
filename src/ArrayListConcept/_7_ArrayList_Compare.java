package ArrayListConcept;

import java.util.ArrayList;
import java.util.*;


public class _7_ArrayList_Compare {
    public static void main(String[] args) {

//     1.   Sort and then equal
        ArrayList<String> l1= new ArrayList<String>(Arrays.asList("A","B","C","D","F"));

        ArrayList<String> l2= new ArrayList<String>(Arrays.asList("A","B","C","D","E"));

        ArrayList<String> l3= new ArrayList<String>(Arrays.asList("B","A","C","D","F"));

        Collections.sort(l1);
        Collections.sort(l2);
        System.out.println(l1.equals(l2));//false
        System.out.println(l1.equals(l3));
        Collections.sort(l3);
        System.out.println(l1.equals(l3));//true

//        2.Compare two list -- find out the additional elements:
        ArrayList<String> l4= new ArrayList<String>(Arrays.asList("A","B","C","D","F"));

        ArrayList<String> l5= new ArrayList<String>(Arrays.asList("A","B","C","D","E"));

//        l4.removeAll(l5);
//        System.out.println(l4);

//       3. Finding out the missing element
        l5.removeAll(l4);
        System.out.println(l5);

//        4.Find out the common Elements
        ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("JAVA","Python","C#","Ruby","JS"));

        ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("JAVA","Python","C#","Ruby","PHP"));

        lang1.retainAll(lang2);
        System.out.println(lang1);







    }
}
