package oop;

public class EncapsulationWork {
    public static void main(String[] args) {
        Bag b1=new Bag();
        b1.setId(1);
        b1.setName("Black");

        Bag b2=new Bag();
       b2.setId(2);
        b2.setName("red");

        Bag b3=new Bag();
        b3.setId(3);
        b3.setName("lalala");

        System.out.println(b1.getName());
        System.out.println(b2.getName());
        System.out.println(b3.getName());



    }
}
//add private to make encapsulation
 class Bag{
    private int id;
   private String name;

   //getter and setter to make encapsulation
    int getId(){
        return this.id;
    }
    String getName(){
        return this.name;
    }
    void setId(int id){
        this.id=id;
    }
    void setName(String name){
        this.name=name;
    }

 }