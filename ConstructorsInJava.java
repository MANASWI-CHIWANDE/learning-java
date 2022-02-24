class Employee1 {
    private String name;
    private int age;

    public Employee1() {
        System.out.println("I'M DEFAULT CONSTRUCTOR");
    }

    public Employee1(String s, int n) {
        System.out.println("I'M PARAMETERIZED CONSTRUCTOR");
        name = s;
        age = n;
    }

    public Employee1(String s, int n, int a) {
        System.out.println("I'M OVERLOADED CONSTRUCTOR");
        System.out.println("my name is " + s);
        System.out.println("my age is " + n);
        System.out.println("my salary is $" + a);
    }
}
public class ConstructorsInJava {
    public static void main(String[] args) {
        Employee1 obj = new Employee1();
        Employee1 obj1 = new Employee1("man",2);
        Employee1 obj2 = new Employee1("mana",21, 54000);
    }
}
