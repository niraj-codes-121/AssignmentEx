package Practice.LinkListWork;

import java.util.Collections;
import java.util.LinkedList;

public class Example {
    public static void main(String[] args) {
        LinkedList<String> names= new LinkedList<>();
        names.add("niraj");
        names.add("ram");
        names.add("sabina");
        names.add("Hello");
        names.add("love");
        //methods
      //  names.addFirst("Ami");
        //names.size();
       // names.removeFirst();
        names.getLast();


        Collections.sort(names);
        //names.getFirst();


        for(String name: names)
        {
            System.out.println(name);
        }
    }
}
