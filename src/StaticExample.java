interface A{
    static void sayHello(){
        System.out.println("Hello! ");
    }
}

public class StaticExample implements A{
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        A.sayHello();
    }
}
