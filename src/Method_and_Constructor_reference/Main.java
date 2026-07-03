// ############## NOTE ###############
/* Method references allows us to refer to a method without invoking it, making our code cleaner
* and more readable. They can be used in place of lambda expression when lambda expression
* only calls an existing method
*
* ######################################*/



package Method_and_Constructor_reference;


import java.util.Arrays;
import java.util.*;

public class Main {
    public static void print(String s){
        System.out.println(s);

    }
    public void sayHello(String hello){
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        List <String> students = Arrays.asList("Alice","Bob","Chalie");
       // students.forEach(x-> System.out.println(x));  This can be refered as:

        // (Introduction of the :: method reference)
        students.forEach(Main::print);

        // now as we can see, the method sayHello() is not static, so what we can do is, we can make an object as shown bello:

        Main main = new Main(); // Main is the class name that contains the method sayHello()

        students.forEach(main::sayHello);


    }
}
