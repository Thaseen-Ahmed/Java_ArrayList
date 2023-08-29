package ArrayListConcept;

import java.util.ArrayList;

public class ArrayList_Demo {
    public static void main(String[] args){

//        Default Class
//        Dynamic Array

//        This are static array we cannot store more the 4 value in array
//        int i[] = new int[4];
//        i[0]=100;
//        i[4]= 678;
//        System.out.println(i[0]);
//        System.out.println(i[3]);

//        Default Generics ( Dynamic Array)
            ArrayList<Object> ar = new ArrayList<Object>();
            ar.add(21);
            ar.add(100);
            ar.add(78);
            ar.add(true);
            ar.add(9);
            ar.add('t');
            ar.add(542);
            ar.add("Testing");
            ar.add(14.89);
        System.out.println(ar);
//        to get the specific index of array
        System.out.println(ar.get(6));
//        System.out.println(ar.get(9));
//          to get the size of ar
        System.out.println(ar.size());
        System.out.println("LI = "+0);
        System.out.println("HI = "+(ar.size()-1));
        ar.add(786);
        ar.add(13);
        ar.add(7981);
        System.out.println(ar.size());
        System.out.println("HI = "+(ar.size()-1));




    }
}