package BiPredicate_BiFunction_BiConsumer;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Main {
    public static void main(String[] args) {

        //BiPredicate : Predicate that takes two values to test.

        BiPredicate<Integer, Integer> biPredicate = (x , y) -> x % 2 == 0 && y % 2 ==0;
        System.out.println(biPredicate.test(2,4));

        //Another Example

        BiPredicate <String, Integer> biPredicate1 = (str,x) -> str.length() == x;

        System.out.println(biPredicate1.test("Rony",4));


        // BiFunction

        BiFunction <String, String , Integer> biFunction = (x,y)-> x.length()+y.length();

        System.out.println(biFunction.apply("Hello", "World"));

        //BiConsumer

        BiConsumer<Integer, Integer> biConsumer = (x,y) -> {
            System.out.println(x+y);
        };

        biConsumer.accept(1,2);
    }
}
