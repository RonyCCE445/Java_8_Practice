/* ########### NOTE #############

This program demonstrates the example of the Functional Interfacer Consumer. that, as the name suggests Consumes the data given.
This type of functional Interface is needed and used while using database and feeding data to the database.

This Functional Interface has one abstract method that is:  .accept();

and another default method:

.andThen() : this method returns the first function, where the method is applied and then the function inside the method.
The example is demonstrated in the program.

####################################
 */



package Consumer_Example;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Consumer<String> consumer = s-> System.out.println(s);

        consumer.accept("Rony"); // accepts a value . Mainly used to store a value or accept a value in a database.

      //Another Example:

        Consumer <List<Integer>> listconsumer = li->{

            for(Integer i : li){
                System.out.println(i+100);
            }
        };

        //listconsumer.accept(Arrays.asList(1,2,3,4));


        // andThen()

        Consumer<List<Integer>> listConsumer2 = li -> {
            for(Integer i : li){
                System.out.println(i);
            }
        };

        listConsumer2.andThen(listconsumer).accept(Arrays.asList(1,2,3,4));


    }
}
