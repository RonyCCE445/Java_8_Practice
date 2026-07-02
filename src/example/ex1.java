package example;
import java.util.*;
public class ex1 {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(22);
        list.add(0);
        list.add(45);

        Collections.sort(list, (a,b) -> b-a ); //(b-a) for Descending, if we want we cam do (a-b) for ascending
        System.out.println(list);


    }
    }

