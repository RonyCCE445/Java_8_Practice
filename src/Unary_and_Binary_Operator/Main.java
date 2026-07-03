package Unary_and_Binary_Operator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;


public class Main {
    public static void main(String[] args) {

// Unary Operator
    Function <Integer, Integer> function1 = x->x*x;
    UnaryOperator <Integer> unaryOperator = x-> x*x ; // If the output and input types are same, we can use Unary Operator.

        System.out.println(unaryOperator.apply(5));

    Function <String, String> function3 = str -> str.toLowerCase();
    UnaryOperator <String> unaryOperator1 = str -> str.toLowerCase();

        System.out.println(unaryOperator1.apply("RONY"));

//Binary Operator:

    BiFunction <String, String, String> biFunction = (str1,str2) -> str1 + str2;
    BinaryOperator<String> binaryOperator = (str1,str2) -> str1 + str2;

        System.out.println(binaryOperator.apply("Hello"," World"));

 }
}