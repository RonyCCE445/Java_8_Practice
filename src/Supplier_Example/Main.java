// ########## NOTE ##############
/*  This Program demonstrates the functional interface "supplier".
Supplier is a Functional Interface that comes under java.util.function , that returns a value.

This functional Interface contains only one abstract method and the method is: .get();

This takes no value and returns a value;

like demonstrated in the below program.

it is taking noting that is : " () -> "
and returning an integer value 1.
hence, written as: " Supplier <Integer> supplier = () -> 1;"

########################################################
*/




package Supplier_Example;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Supplier <Integer> supplier = () -> 1;
        System.out.println(supplier.get());
    }
}
