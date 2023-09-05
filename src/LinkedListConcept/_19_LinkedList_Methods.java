package LinkedListConcept;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class _19_LinkedList_Methods {
    public static void main(String[] args) {
//        LinkedList is a default Class in Java
//        It can be used as List,Stack,Queue
//        It allows the null Entry
//        It is Dynamic Collection
//        Hence Insertion and Deletion Can be easily Implemented
//        It can contain Duplicate Element
//        It is not Synchronized and not Thread Safe
//        In LL, Manipulation is fast because we dont need any shifting.

//        LinkedList Constructors:
//        1.LinkedList();
//        2.LinkedList(Collection c)

        LinkedList<String> names = new LinkedList<String>();
        System.out.println(names.size());

        names.add("Thaseen");//0
        names.add("Ahmed");//1
        names.add("Smith");//2
        names.add("Roshan");//3
        System.out.println(names.size());
        System.out.println(names);
        System.out.println(names.get(3));
        System.out.println(names.get(1));
//        System.out.println(names.get(5));

        System.out.println("---Iterating the LinkedList----");
//        How to iterate the LL
        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
//        Inserting Element at specifeid Index
        names.add(4,"Glad");
        System.out.println(names);

        names.add(2,"Adnan");
        System.out.println(names);

        LinkedList<String> users = new LinkedList<String>();
        users.add("Mudassir");
        users.add("Afraz");
        users.add("Yameen");
        System.out.println("---Adding Two LinkedList into one---");
        names.addAll(users);
        System.out.println(names);
        System.out.println("---Adding ele in first and Last index---");
        names.addFirst("Lina"); //Adding ele in first index
        System.out.println(names);
        names.addLast("Monika");//Adding ele at last indx
        System.out.println(names);
        System.out.println("---Removing values from list---");
        names.remove(3);
        System.out.println(names);
        names.removeFirst();
        names.removeLast();
        System.out.println(names);

        System.out.println("--- Removing all the value coming from user---");
        names.removeAll(users);
        System.out.println(names);
        System.out.println("--Reomving all data from list--");
        names.clear();
        System.out.println(names);


        LinkedList<String> lang = new LinkedList<String>();
        lang.add("JAVA");
        lang.add("PYTHON");
        lang.add("RUBY");
        lang.add("JAVASCRIPT");
        System.out.println(lang.size());
        System.out.println("--reertsing the values in List");
        Iterator<String> itl = lang.descendingIterator();
        while(itl.hasNext()){
            System.out.println(itl.next());
        }
        System.out.println("---Iterating using for loop--");
        for(String e : lang){
            System.out.println(e);
        }

        System.out.println("--To print in sorted Order---");
//        Sort:
        Collections.sort(lang);
        System.out.println(lang);


    }
}
