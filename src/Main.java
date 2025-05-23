import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Stack stack = new StackLinkedList();
        try {
            stack.pop();
        } catch (Exception e) {
            System.out.println(e);;
        }


        /*
        ArrayList <String> stringList = new ArrayList();
        stringList.add("String");
        stringList.add("ali");
        System.out.println(stringList);
        HashMap<String,Double> grades = new HashMap();
        grades.put("ali",10.0);
        grades.put("pelin",75.4);
        grades.put("koray", 4.5);
        System.out.println(grades);
        grades.put("ali",100.0);
        System.out.println(grades);
        */



   }
}