package ArrayListConcept;

import java.util.ArrayList;
import java.util.*;

public class ArrayList_Iteration {
    public static void main(String[] args) {

        ArrayList<String> Studentlist = new ArrayList<String>();
        Studentlist.add("Tom"); // 0
        Studentlist.add("Thaseen");//1
        Studentlist.add("Afraz");//2
        Studentlist.add("Mudassir");//3
        Studentlist.add("Smith");//4

//        typical for loop
        System.out.println("For LOOp");

        for(int i=0;i<Studentlist.size();i++){
            System.out.println(Studentlist.get(i));
        }

        System.out.println("///This is for Each loop");
        //For each loop
        for(String s : Studentlist){
            System.out.println(s);
        }

//        Lambda Function(Streams With Lambda)
        System.out.println("Streams With Lambda");

        Studentlist.stream().forEach(ele-> System.out.println(ele));

//        Iterator
        System.out.println("Iteration method");
        Iterator<String> it= Studentlist.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

//        List with other Collections and another way

        ArrayList<Integer> number = new ArrayList<Integer>(Arrays.asList(23,567,897,2,35,0,9823));
        System.out.println(number);

        ArrayList<String > names = new ArrayList<String>(Arrays.asList("Html","Css","Python","Java","Machime Learning"));
        System.out.println(names);
        System.out.println(names.size());


    }
}
