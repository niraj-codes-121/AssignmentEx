package Practice.StaticInJava;

public class StudentWork {
    public static void main(String[] args) {
        Student s1= new Student();
        Student.school = "Ddiamond";
        s1.name="niraj";
        s1.address="nepal";
        System.out.println(s1.school);
        System.out.println(Student.school);
    }
}
class Student{
    String name;
    String address;
    static String school;



}

