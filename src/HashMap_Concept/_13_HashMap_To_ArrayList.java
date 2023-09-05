package HashMap_Concept;

import java.util.*;

public class _13_HashMap_To_ArrayList {
    public static void main(String[] args) {

        HashMap<String,Integer> CompMap = new HashMap<String,Integer>();
        CompMap.put("Google",10000);
        CompMap.put("Walmart",20000);
        CompMap.put("Tesla",30000);
        CompMap.put("MicroSoft",5000);
        CompMap.put("Amazon",45000);

        System.out.println("Size of Comp Map is "+ CompMap.size());

//        Old Method
//        Iterator Itm=CompMap.entrySet().iterator();
//        while(Itm.hasNext()){
//            Map.Entry pairs = (Map.Entry)Itm.next();
//            System.out.println("The Keys Are "+pairs.getKey()+" And values are "+pairs.getValue());
//        }


//     New Method  Lambda Function to print the K And v in Java 1.8
        CompMap.forEach((k,v)-> System.out.println("The k is "+ k + "And V is "+v));
        System.out.println("----Converting HashMap into ArrayList----");
        System.out.println("----Converting HashMap Key into ArrayList keys----");

//        Converting HashMap keys into ArrayList:
        List<String> CompnameList = new ArrayList<String>(CompMap.keySet());

        System.out.println(CompnameList);
//        Foreach Loop
        System.out.println("Total Companie value ="+CompnameList.size());

        for(String t : CompnameList){
            System.out.println(t);
        }
        System.out.println("----Converting Hashmap value into arraYList val----");
//        Converting HashMap Value into ArrayList:
        List<Integer> EmpValueList = new ArrayList<Integer>(CompMap.values());
        System.out.println(EmpValueList);
        System.out.println("Total Employee value ="+EmpValueList.size());
        for(Integer Ev: EmpValueList){
            System.out.println(Ev);
        }


    }
}
