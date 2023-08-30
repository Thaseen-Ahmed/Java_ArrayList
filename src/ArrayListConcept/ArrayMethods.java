package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayMethods {
    public static void main(String[] args) {
        ArrayList<Integer> l1= new ArrayList<>();
        ArrayList<Integer> l2= new ArrayList<>(6);
        ArrayList<String> s3 = new ArrayList<>();
        l2.add(15);
        l2.add(12);
        l2.add(11);
        l2.add(18);
        l1.add(6);
        l1.add(7);
        l1.add(4);
        l1.add(6);
        l1.add(0,5);
        l1.add(0,2);

//        the below method will add two list
//        l1.addAll(l2);
//        the below will add after the respective index
//        l1.addAll(0,l2);

        // the below will clear the list
//        l1.clear();
//        the below will show true or false if element is present in list

//        System.out.println(l1.contains(12));
//        System.out.println(l1.contains(78));
//        System.out.println(l1.indexOf(15));
//        System.out.println(l1.indexOf(11));
//        System.out.println(l1.indexOf(116));
//        System.out.println(l1.indexOf(6));
//        l1.set(1,78);
//        System.out.println(l1.isEmpty());
//        System.out.println(l1.lastIndexOf(6));


//
//        for (int i=0;i<=l1.size();i++){
//            System.out.print(l1.get(i));
//            System.out.print(", ");
//        }
//

        s3.add("Thaseen");
        s3.add("Ahmed");
        s3.add("Adnan");
        s3.add("Muzammil");
        s3.add("Afraz");
        s3.add("Mudassir");

        System.out.println("-----String Arraylist------");

        System.out.println(s3.contains("Mudassir"));
        System.out.println(s3.contains("Captain"));
        s3.add(3,"Sami");
        s3.set(1,"Roshan");
        System.out.println(s3.indexOf("Adnan"));
        System.out.println(s3.isEmpty());
//        s3.clear();
//        System.out.println(s3.isEmpty());

//        Cloning the Arryalist
        ArrayList<String> clonelist = (ArrayList<String>)s3.clone();
        System.out.println(clonelist);
        System.out.println(s3.contains("Ahmed"));//false because we reset the index into Roshan
        System.out.println(s3.contains("Roshan"));
        System.out.println(s3.contains("python"));
        System.out.println(s3.indexOf("Afraz")>0);

//        for(int i=0;i<=s3.size();i++){
//            System.out.print(s3.get(i));
//            System.out.print(", ");
//        }

        ArrayList<String > lis1 = new ArrayList<String>(Arrays.asList("Html","Css","Python","Java","Machime Learning","Python"));
        System.out.println(lis1);
        int i= lis1.lastIndexOf("Python");
        System.out.println(i);
//        removing ele from ar
        lis1.remove(3); //removing from index
        System.out.println(lis1);
        lis1.remove("Css"); // removing by decalring ele value
        System.out.println(lis1);

        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,34,43,56,23,45,7,34,10,8,6,9,101));
        System.out.println(numbers);
//        numbers.removeIf(num-> num%2==0); // to remove even num
//        System.out.println(numbers);

        numbers.removeIf(num-> num%2!=0); // to remove odd num
        System.out.println(numbers);

        ArrayList<String > lis2 = new ArrayList<String>(Arrays.asList("Html","Css","Python","Java","Machime Learning","Python"));
//        To bring the names or values we want to extract
        lis2.retainAll(Collections.singleton("Python"));
        System.out.println(lis2);

        ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,34,43,56,23,45,7,34,10,8,6,9,101,11,23,67,90,34));

//        Creating  a Sub List
        ArrayList<Integer> subList = new ArrayList<Integer>(numbers1.subList(7,15));
        System.out.println(subList);

//        Creating a Array Object From ArrayList
        ArrayList<String > newlis = new ArrayList<String>(Arrays.asList("Html","Css","Java","C#","C++","Python"));
        Object arr[] = newlis.toArray();
        System.out.println(Arrays.toString(arr));

        for(Object o: arr){
            System.out.println((String)o);
        }




    }
}
