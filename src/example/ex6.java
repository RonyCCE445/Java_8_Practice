// ######## NOTE #######
/* This Program belongs to the predicate functional interface example.
Used the methods and demonstrated their working

1) .test() -> abstract method
2) and() -> default method
3) or()  -> default method
4) negate() -> default method
5) isEqual() ->  Static Method

The Functional Interface *Predicate* is a boolean-valued function.
It holds conditions.

this is a built-in function under the Java.util.function
########################################
 */

package example;
import java.util.function.Predicate;
import java.util.*;
public class ex6 {
    public static void main(String[] args) {

        Predicate<Integer> salaryGreaterThanOneLac = x -> x > 100000;
        //System.out.println(salaryGreaterThanOneLac.test(10000000));



        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
       // numbers.stream().filter(x -> x > 100000);

        int sumofEven = numbers.stream().filter(n-> n%2 ==0).mapToInt(n->n).sum(); //sum of even numbers, **Using java8**

//        int sum2 =0;
//        for(int number: numbers){
//            if(number % 2 ==0){
//                sum2+= number;
//            }
//        }//     Without using java8

//        System.out.println(sum2);
       // System.out.println(sumofEven);



        Predicate<Integer> isEven = x-> x%2 ==0;
        Predicate<String> startsWithV = x->x.toLowerCase().charAt(0)=='v';

        //Testing the Default and Static Methods inside Predicate Interface
        Predicate<String> startsWithR = x->x.toLowerCase().charAt(0)=='r';
        Predicate<String> endsWithY = x-> x.toLowerCase().charAt(x.length()-1)=='y';

        //Using **AND**

        Predicate<String> and = startsWithR.and(endsWithY);
        System.out.println("Rony (Starts with R and Ends with Y): "+and.test("Rony"));
        System.out.println("Vipul (Starts with R and Ends with Y): "+and.test("Vipul"));

        //Using **OR**

        Predicate<String> or = startsWithR.or(endsWithY);

        System.out.println("Rahul (Starts with R OR Ends with Y): "+or.test("Rahul"));
        System.out.println("Bhuvy (Starts with R OR Ends with Y): "+or.test("Bhuvy"));

        //Using **negate**

        System.out.println("Negate: Starts with V : "+startsWithV.negate().test("Vipul"));



//        System.out.println(startsWithV.test("Rony"));
        System.out.println("Vipul(Starts with V): "+startsWithV.test("Vipul"));

//        for(Integer i:numbers){
//            if(isEven.test(i)){
//                System.out.print(i+",");
//            }
//        }
        Student s1 = new Student("Koustav",1);
        Student s2 = new Student ("Vipul",2);

        Predicate<Student> StudentPredicate = x-> x.getId()>1;
        System.out.println(StudentPredicate.test(s2));

        //**** isEqual()********

        Predicate<Object> predicate = Predicate.isEqual("Rony");
        System.out.println(predicate.test("sfsdfd"));
        System.out.println(predicate.test("Rony"));

    }

    public static class Student{
        String name;

        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }

        int id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }

}
