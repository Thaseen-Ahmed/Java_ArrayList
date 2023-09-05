package Vector_Concept;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class _20_Vector_Demo {
    public static void main(String[] args) {
        Vector<Integer> myVector = new Vector<Integer>();
        myVector.add(2);
        myVector.add(4);
        myVector.add(6);
        myVector.add(8);
        myVector.add(10);
        myVector.add(12);
        myVector.add(14);
        myVector.add(16);
        myVector.add(18);

        System.out.println(myVector);

        System.out.println(myVector.get(2));

        myVector.remove(5);
        System.out.println(myVector);

        Vector<Integer> yourVector = new Vector<Integer>();
        yourVector.add(9);
        yourVector.add(11);
        yourVector.add(13);
        yourVector.addAll(myVector);
        System.out.println(yourVector);

//        Iterating
        System.out.println("--Iteating using for loop---");

//        for(Integer e:myVector){
//            System.out.println(e);
//        }

        for (int p=0;p<myVector.size();p++){
            System.out.println(myVector.get(p));
        }
//Iterate using iterator
        System.out.println("---Iterating using Iterator---");
        Iterator<Integer> itr = myVector.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());

        }
//        Sort
        System.out.println("--Print Using Collections sort ----");
        Collections.sort(myVector);
        System.out.println(myVector);


    }
}
