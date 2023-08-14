package Practice.oop;

public class Polymorphism {
    public static void main(String[] args) {
        Mic m1= new Mic();
        m1.printInfo();
        Boya b1=new Boya();
        b1.printInfo();

        Rode r1=new Rode();

        r1.printInfo();

    }
}
class Mic{
    void printInfo(){
        System.out.println("this is default mic:");

    }

    }
    class Boya{
    void printInfo(){
        System.out.println("this is boya mic:");
    }
}
class Rode extends Mic{

    }


