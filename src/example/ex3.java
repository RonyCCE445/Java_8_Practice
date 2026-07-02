package example;

import java.util.*;
public class ex3 {
    public static void main(String[] args) {
        Map<Integer, String> m = new TreeMap<>();
        m.put(2,"z");
        m.put(3,"f");
        m.put(1,"y");
        System.out.println("Before Manual Sorting: "+m);

        Map<Integer, String>mm = new TreeMap<>((a,b)-> b-a);
        mm.put(2,"z");
        mm.put(3,"f");
        mm.put(1,"y");
        System.out.println("After Manual Sorting in Des: "+mm);

    }
}
