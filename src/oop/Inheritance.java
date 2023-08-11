package oop;

public class Inheritance {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Niraj";
        s1.age=21;
        s1.printInfo();

    }
}
class Person{
    String name;
    int age;

    //method
    void printInfo(){
        System.out.println("Name is:"+name);
        System.out.println("age is :"+age);
    }
}
//Student use the properties andd method
class Student extends Person{

}