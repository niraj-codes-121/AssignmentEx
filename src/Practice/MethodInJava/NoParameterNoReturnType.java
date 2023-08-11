package Practice.MethodInJava;
//no parameter in printaddress() method
//no returntype because of void
public class NoParameterNoReturnType {
    public static void main(String[] args) {
        printaddress();
        printComputerInfo();

    }
    public static void printaddress(){
        System.out.println("my address is usa");
    }
    public static void printComputerInfo(){
        System.out.println("comuter name: Msi");
        System.out.println("price: 50000");
    }
}
