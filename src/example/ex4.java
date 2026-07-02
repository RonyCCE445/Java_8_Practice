package example;
import java.util.*;

public class ex4 {
    public static void main(String[] args) {
        Student s1 =new Student(2, "Rony");
        Student s2 = new Student( 3, "Vipul");
        Student s3 = new Student(4, "Naveen");

        List<Student> li = new ArrayList<Student>();
        li.add(s1);
        li.add(s2);
        li.add(s3);

        Collections.sort(li,(a,b)-> b.id-a.id);
        System.out.println(li);


    }









    static class Student{
        public  Integer id;
        public String name;


        public Student(Integer id, String name){

            this.id=id;
            this.name= name;
        }

        public String toString(){
            return this.id + " "+this.name;

        }


    }
}
