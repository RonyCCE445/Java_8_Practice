package example;
import java.util.*;
public class ex2 {
    public static void main(String[] args) {
        Set<Integer> s = new TreeSet<>();
        s.add(2);
        s.add(3);
        s.add(22);
        s.add(0);
        s.add(45);
        System.out.println("Before Sorting: "+s);

        Set<Integer> ss= new TreeSet<>((a,b)->b-a);
        ss.add(2);
        ss.add(3);
        ss.add(22);
        ss.add(0);
        ss.add(45);
        System.out.println("After Manual Sorting in Desc: "+ss);
    }
}
