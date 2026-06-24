package Inheritance;

public class Person {
    String name;
    String age;
    Person(String name,String age){
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString(){
        return "name "+name+",age "+age;
    }
}
class Student extends Person{
    final int studentId;
    double GPA;
    Student(String name, String age, int studentId, double GPA){
        super(name,age);
        this.studentId=studentId;
        this.GPA=GPA;
    }
    @Override
    public String toString(){
        return "studentid "+studentId + "GPA is "+GPA;
    }
}
class GradStudent extends Student{
    String thesis;
    GradStudent(String name, String age, int studentId ,double GPA,String thesis){
         super(name,age,studentId,GPA);
         this.thesis=thesis;
    }
    @Override
    public String toString(){
        return super.toString()+"thesis "+ thesis;
    }
}
class UniversitySystem{
    public static void main(String[] args) {
        GradStudent grad =new GradStudent("Apeksha","21",101,9.1,"AI");
        System.out.println(grad);
        Person p = grad;      // upcasting
        Student s = grad;     // upcasting ecause a GradStudent IS-A STUDENT AND Person
    }
}
