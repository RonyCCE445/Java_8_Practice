// ########### NOTE ############
/* This Program contains example of the "Function" functional interface
here the abstract method is : .apply();

ans the other methods are:

1) andThen(): Default method : returns the first function, stores the value and then performs the second function(inside the andThen Function) and returns the value by using .apply();
2) .compose() : Default method : opposite of andThen();
3) .identity() : Static method : returns whatever is fed to the function. More on Streams example.

#####################################
 */

package Function_Example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
public class Main {
    public static void main(String[] args) {
        Function<String, Integer> getLength = x->x.length();
        Function <String,String> function = s-> s.substring(0,3);
        Function<List<Student>,List<Student>> studentswithRonAsPrefix = li->{
            List<Student> result = new ArrayList<>();
            for(Student s: li){
               if(function.apply(s.getName()).equalsIgnoreCase("vip")){
                    result.add(s);
                }
            }
                return result;
        };
        Student s1 =  new Student(2, "Vipul");
        Student s2 =   new Student(3, "Viplab");
        Student s3 =   new Student(2, "Rony");

        List<Student> students = Arrays.asList(s1,s2,s3);
        List<Student> filteredstudents = studentswithRonAsPrefix.apply(students);

        System.out.println(filteredstudents);


     //   System.out.println(getLength.apply("Koustav Chakraborty"));



        //Function Chaining:

        // andThen : Default Method

        Function <String, String> function1 = s-> s.toUpperCase();
        Function <String, String> function2 = s-> s.substring(0,3);

        Function<String, String> stringStringFunction = function1.andThen(function2);

        System.out.println(stringStringFunction.apply("Rony")); // One Method of storing

        System.out.println(function1.andThen(function2).apply("Rony")); // another method that returns the same thing




        // Another Example

        Function <Integer, Integer> func1 = x-> 2*x;
        Function <Integer, Integer> func2 = x-> x*x*x;

        System.out.println(func1.andThen(func2).apply(3)); //216
        System.out.println(func2.andThen(func1).apply(3)); //54

        //Compose : Default Method

        System.out.println(func1.compose(func2).apply(3)); //54
        System.out.println(func2.compose(func1).apply(3)); //216



        // Identity : Static Method

        Function <String, String> identityFunction = Function.identity();

        System.out.println(identityFunction.apply("Rony"));

    }
    private static class Student{
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }
    }


}
