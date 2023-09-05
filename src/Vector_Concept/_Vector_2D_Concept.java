package Vector_Concept;

import java.util.Vector;

public class _Vector_2D_Concept {
    public static void main(String[] args) {
        Vector<String> langVector = new Vector<String >();
        langVector.add("JAVA");
        langVector.add("PYTHON");
        langVector.add("C#");
        langVector.add("RUby");
        langVector.add("JAVASCRIPT");

        Vector osVector = new Vector();
        osVector.add(langVector);

        for(int i=0;i<langVector.size();i++){
           String str = (String)((Vector)osVector.get(0)).get(i);
            System.out.println(str);
        }
    }
}
