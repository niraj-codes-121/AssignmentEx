package Practice.ArrayExample;

import java.util.Arrays;

public class SortNumericArrayInAscendingOrder {
    public static void main(String[] args) {
        int[] array ={1,3,2,5,6,7};
        System.out.println("Original array:"+ Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted array:"+Arrays.toString(array));
    }
}
