package Practice.Array;
//avg and sum
public class ArrayExample3 {
    public static void main(String[] args) {
        int [] prices = {10, 20, 30,40};
        int total=0;
        for(int i=0; i< prices.length; i++){
            total=total+prices[i];
        }
        System.out.println("total is:"+total);
        double avg = total/ prices.length;
        System.out.println("avg is:"+avg);
    }
}
