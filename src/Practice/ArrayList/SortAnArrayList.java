package Practice.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortAnArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars= new ArrayList<String>();
        cars.add("ktm");
        cars.add("toyota");
        cars.add("bmw");
        cars.add("mazda");
        Collections.sort(cars);
        for(String i: cars){
            System.out.println(i) ;
        }
    }
}
