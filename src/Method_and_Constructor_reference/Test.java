package Method_and_Constructor_reference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Chalie");
     // List <Student> students =   names.stream().map(x ->new Student(x)).collect(Collectors.toList());
        List <Student> students =   names.stream().map(Student::new).collect(Collectors.toList()); // both ways we can write, here ".map(Student::new)." this part is the constructor reference.

    }

}
