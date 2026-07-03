// ########## NOTE ##############
/* if (predicate.test(supplier.get())){
        consumer.accept(function.apply(supplier.get()));

 ***** Description ******

// Obtain a value from the Supplier. (Which is 100)
// Use the Predicate to verify the condition. (which is true)
// The function will be applied to the supplier.get()'s value.
// and the Consumer will return the final output.

########################################################
*/
package Functional_Interface_Example_Combined;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Predicate< Integer > predicate = x-> x%2 ==0;
        Function<Integer, Integer > function  =  x-> x*x;
        Consumer <Integer> consumer = x-> System.out.println(x);
        Supplier <Integer> supplier = ()-> 100;


         if (predicate.test(supplier.get())){
             consumer.accept(function.apply(supplier.get()));

        }
    }
}
