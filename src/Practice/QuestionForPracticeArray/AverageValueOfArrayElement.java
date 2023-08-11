package Practice.QuestionForPracticeArray;
//Write a Java program to calculate
// the average value of array elements.
public class AverageValueOfArrayElement {
    public static void main(String[] args) {
        int [] num = {10, 20, 30,4010, 20, 30,40};
        int sum =0;
        //double avg;
        for(int i=0; i< num.length; i++){
            sum= sum+num[i];
        }
        System.out.println("the sum is:"+sum);
        double avg = (sum+ num.length)/100;
        System.out.println("The avg is:"+avg);
    }
}
