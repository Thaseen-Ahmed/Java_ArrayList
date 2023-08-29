package ArrayListConcept;
import java.util.*;
public class GenericsArrayList {
    public static void main(String[] args) {

//        ArrayList ar1 = new ArrayList(); //we can add anything if generics is or declares
//        ar1.add("tyask");
//        ar1.add(65);
//        ar1.add(98.21);
//        ar1.add(false);

        ArrayList<Integer> marklist = new ArrayList<Integer>();
        marklist.add(675);

//        marklist.add(13.45); //we can't store any other than Integer in generics which is declares in AL
        marklist.add(5);

        ArrayList<Double> arD = new ArrayList<Double>();
        arD.add(2.23);
        arD.add(15.3);
//        arD.add(23); // can't store any other than double

        ArrayList<String> SName = new ArrayList<String>();
        SName.add("fahan");
        SName.add("thaseen");
//        SName.add(468); // can't store any other than String
        System.out.println(SName);

    }
}
