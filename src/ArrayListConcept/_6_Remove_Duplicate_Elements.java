package ArrayListConcept;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class _6_Remove_Duplicate_Elements {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,8,18,10,14,21,10,2,3,5,7,9,1));
        System.out.println(numbers);


//        To remove Duplicate from list   - method
//        1.LinkedHashSet
        LinkedHashSet<Integer> linkset= new LinkedHashSet<Integer>(numbers);
//        the above LHS is used to remove duplicate
        System.out.println("AL after removing duplicate");
//        To remove Duplicate from list create an another AL linked with LHS
        ArrayList<Integer> numbersListwithoutDuplicate = new ArrayList<Integer>(linkset);

        System.out.println(numbersListwithoutDuplicate);
//          we can apply on any type of data like String,double,float,

//        2.JDK8 - Stream it is very very important concept and interview ques
        System.out.println("Another way :");
        System.out.println("Using Stream method this is very famous");

        ArrayList<Integer> markList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,9,288,10,14,288,10,2,7,3,5,7,9,1));
        System.out.println(markList);
       List <Integer> MarkslistUnique= markList.stream().distinct().collect(Collectors.toList());
        System.out.println(MarkslistUnique);

    }
}
