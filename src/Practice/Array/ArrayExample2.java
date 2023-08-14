package Practice.Array;
//names with grades
public class ArrayExample2 {
    public static void main(String[] args) {
        String [] names = {"ram", "shyam","Hari", "deepak"};
        int [] grades = {50, 60, 70, 39};
        for (int i=0; i< names.length; i++){
            System.out.println(names[i]+"grade is:"+grades[i]);
        }
    }
}
