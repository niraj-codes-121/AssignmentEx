package Practice.MethodInJava;

public class ParameterAndReturnType {
    public static void main(String[] args) {
      int sum = add(3, 4);
     int multi= multiply(4, 5);
        System.out.println("the sum is:"+sum);
        System.out.println("the sum is:"+multi);
        String Fname ="niraj";
        String Lname="thagunna";
        System.out.println("fullname is"+Fname+""+Lname);
        double SI = getSimpleInterest(2,4,3);
        System.out.println("Simple Interest is:"+ SI);
    }
    public static int add(int num1, int num2){
        return num1+num2;


    }
    public static int multiply(int num1, int num2){
        return num1*num2;
    }

    public static String getFullName(String Fname, String Lname){
        return ("full name is:"+ Fname+""+Lname);
    }

    public static double getSimpleInterest(double p, double t, double r){
        return (p*t*r)/100;
    }

}
