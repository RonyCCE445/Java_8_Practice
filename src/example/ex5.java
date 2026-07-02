
//*******NOTE************
//Anonymous Inner Class Example
// Lambda is used in case of Single Abstract Method(SAM) and if we have Multiple Abstract Method, we can use, Anonymous Inner Class.
//*******NOTE************

package example;

public class ex5 {
    public static void main(String[] args) {
//        Employee2 employee =  new Employee2() {
//            @Override
//            public int getSalary() {
//                return 10;
//            }
//
//            @Override
//            public String getDesignation() {
//                return "Chaiwala";
//            }
//        };
//        System.out.println(employee.getSalary()+" "+employee.getDesignation());

    doSomething();

    }

    private static void doSomething(){
        int a =2;
        Employee2 employee = () ->{
            int x =10; // Local variable as this is a simple function. ** So cannot be fetched using "this" keyword**
            return 100;
        };

        Employee2 employee1 = new Employee2() {
            int x=10; //This is an instance variable. can be fetched using This keyword
            @Override
            public int getSalary() {
                System.out.println(this.x);
                return 100;
            }
        };

    }


}
