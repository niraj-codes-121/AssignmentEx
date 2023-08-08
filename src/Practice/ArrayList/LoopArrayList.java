package Practice.ArrayList;

import java.util.ArrayList;

public class LoopArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("olvvo");
        cars.add("abcd");
        cars.add("Toyota");
        for(int i=0; i< cars.size(); i++){
            System.out.println(cars.get(i));
        }
    }
}
