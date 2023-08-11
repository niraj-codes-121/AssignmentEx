package Practice.Recursion;

public class Main {
    public static void main(String[] args) {
        int total = sum(3);
        System.out.println("Total is "+total);
    }
    public static int sum(int num) {
        if (num > 0) {
            return num + sum(num - 1);
        } else {
            return 0;
        }
    }
}