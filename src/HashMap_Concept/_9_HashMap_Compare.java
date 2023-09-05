package HashMap_Concept;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;

public class _9_HashMap_Compare {
    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"A");
        hm.put(2,"B");
        hm.put(3,"C");

        HashMap<Integer,String> hm2 = new HashMap<Integer,String>();
        hm2.put(3,"C");
        hm2.put(1,"A");
        hm2.put(2,"B");

        HashMap<Integer,String> hm3 = new HashMap<Integer,String>();
        hm3.put(1,"A");
        hm3.put(2,"B");
        hm3.put(3,"C");
        hm3.put(3,"D");


//        1.On the basis of Key-Value: USe equal method
        System.out.println("---First Methid---");
        System.out.println(hm.equals(hm2));//true
        System.out.println(hm.equals(hm3));//false

//        2.Compare hashmaps for the Same Keys:keySet
        System.out.println("----Second method---");

        System.out.println(hm.keySet().equals(hm2.keySet()));//true
        System.out.println(hm.keySet().equals(hm3.keySet()));//true because it ignores duplicate and sees common between both

//        3.Finding out the extra key

        System.out.println("---Third Method---");

        HashMap<Integer,String> hm4 = new HashMap<Integer,String>();
        hm4.put(1,"A");
        hm4.put(2,"B");
        hm4.put(3,"C");
        hm4.put(4,"D");
        hm4.put(2,"B");
        hm4.put(6,"F");

//        Combine the keys from the both maps; Using HashSet
        HashSet<Integer> Combinekey = new HashSet<Integer>(hm.keySet());
//        Add the keySet from map4
        Combinekey.addAll(hm4.keySet());
        Combinekey.removeAll(hm.keySet());
        System.out.println(Combinekey);

//        4: Compare maps by Values
        HashMap<Integer, String> map5 = new HashMap<Integer, String>();
        map5.put(1, "A");
        map5.put(2, "B");
        map5.put(3, "C");
        HashMap<Integer, String> map6= new HashMap<Integer, String>();
        map6.put(4, "A");
        map6.put(5, "B"); map6.put(6, "C");
        HashMap<Integer, String> map7 = new HashMap<Integer, String>();
        map7.put(1, "A");
        map7.put(2, "B");
        map7.put(3, "C");
        map7.put(4, "C");
//1. duplicates are not allowed: using ArrayList
        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));//true
         System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map7.values())));//false
//2. duplicates are allowed: using HashSet
        System.out.println(new HashSet<>(map5.values()).equals (new HashSet<>(map6.values())));//true
         System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map7.values())));//true

    }
}
