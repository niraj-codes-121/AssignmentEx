package Practice.StaticInJava;

public class Example {
    public static void main(String[] args) {
        Box.info="Hello";
        Box.info="Hi";
        System.out.println(Box.info);

    }
}
class Box{
    static String info;
}