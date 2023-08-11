package Practice.ArrayExample;

public class ArraySumNAverage {
    public static void main(String[] args) {


        int[] numbers = {2, 4, 3};
        int sum = 0;
        double avg;

        for (int number : numbers) {
            sum = sum+number;
        }

        //get total no of element
        int arrayLength = numbers.length;
        avg=((double) sum/(double)arrayLength);
        System.out.println("sum of numbers is:" + avg);


        System.out.println("sum of numbers is:" + sum);
    }
}
