package Practice.MathInJava;
//You can use this formula to generate a random
// number between any numbers.
//Math.random() * (max - min + 1) + min
public class Random {
    public static void main(String[] args) {
        int random = (int)Math.random() * (10 -1 +1)+1;
        System.out.println(random);
    }
}
