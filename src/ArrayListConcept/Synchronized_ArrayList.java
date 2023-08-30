package ArrayListConcept;

import java.util.ArrayList;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Synchronized_ArrayList {
    public static void main(String[] args) {
//        1 : Collections.synchronizedList() method we used
        List<String> namesList=Collections.synchronizedList(new ArrayList<String>());
        namesList.add("Java");
        namesList.add("Python");
        namesList.add("Ruby");

//     to add, remove - we don't need explicit synchronization

//    To fetch/traverse the value from the list -- we have to use explicit synchronization

        synchronized (namesList){
           Iterator<String> it = namesList.iterator();
           while(it.hasNext()){
               System.out.println(it.next());
           }

        }

//        2 : copyOnWriteArrayList ---it is a class
        CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
            empList.add("Tom");
            empList.add("Steve");
            empList.add("Jerry");
            empList.add("Captain");

//            We don't need explicit synchroninzation for any operation : add/remove/traverse

        Iterator<String> it = empList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
