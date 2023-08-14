package Practice.ArrayRevisionForMe;

import java.util.ArrayList;
import java.util.Collections;

public class AddItemToArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("sabina");
        names.add("niraj");
        names.add("kris");
        names.add("hddha");
      //  names.get(1);
       // System.out.println(names.get(0));

       // names.remove("sabina");
        Collections.sort(names,Collections.reverseOrder());

        for(String name:names)
            System.out.println(name);
    }
}
