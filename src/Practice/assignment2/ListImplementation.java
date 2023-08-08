package Practice.assignment2;

import java.util.ArrayList;
import java.util.List;

public class ListImplementation {
    public static void main(String[] args) {
        List<Integer> s=new ArrayList<>(); //declare list wrapper class
        s.add(8); //0index//autoboxing java convert to integer
        s.add(10); //1index
        s.add(11); //2 index
        System.out.println(s);


    }
}
