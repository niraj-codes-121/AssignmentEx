package Practice.ArrayExample;

import java.util.Arrays;
import java.util.Collections;

public class SortNumberInDesendingOrder {
    public static void main(String[] args) {
        Integer[] array={2,8,9,7,1,0};
        System.out.println("original array:"+ Arrays.toString(array));
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("sorted array:"+Arrays.toString(array));

    }
}
