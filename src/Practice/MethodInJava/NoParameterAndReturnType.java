package Practice.MethodInJava;
//no parameter but return type because no void and string is there
public class NoParameterAndReturnType {
    public static void main(String[] args) {
        String name= getName();
        System.out.println(name);

    }
    public static String getName(){
        return "niraj";
    }
}
