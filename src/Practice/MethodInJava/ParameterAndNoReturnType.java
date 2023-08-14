package Practice.MethodInJava;
//with parameter but not return type
public class ParameterAndNoReturnType {
    public static void main(String[] args) {
        add(5,5);
        getAge(1992);

    }
    public static void add(int n1, int n2){
        int sum =n1+n2;
        System.out.println("The sum is:"+sum);
    }
    public static void getAge(int birthAge){
        int age = 2022-birthAge;
        System.out.println("the age is:"+age);

    }
}
