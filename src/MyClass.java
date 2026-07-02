//@FunctionalInterface
interface Parent {
    //public void sayHello();

    default void sayBye(){
        System.out.println("Say Bye");
    }

}

class Child implements Parent{
    @Override
    public void sayBye() {
        System.out.println("Child Says Hello");
    }
}

public class MyClass{
    public static void main(String[] args) {
        Child c = new Child();
        c.sayBye();
    }

}
