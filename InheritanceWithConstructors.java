class Base1{
    Base1(){
        System.out.println("I'M BASE CLASS CONSTRUCTORS");
    }
    Base1(int a){
        System.out.println("I'M BASE CLASS CONSTRUCTORS with overloading of var a : " +a);
    }
}
class Derived1 extends Base1{
    Derived1(){
        System.out.println("I'M derived CLASS CONSTRUCTORS");
    }
    Derived1(int a, int b){
        super(a);
        System.out.println("I'M derived CLASS CONSTRUCTORS with overloading of var b : " +b);
    }
}
class Derived2 extends Derived1{
    Derived2(){
        System.out.println("I'M derived 2 CLASS CONSTRUCTORS");
    }
    Derived2(int a, int b, int c){
        super(a , b);
        System.out.println("I'M derived 2 CLASS CONSTRUCTORS with overloading of var c : " +c);
    }
}
public class InheritanceWithConstructors{
    public static void main(String[] args){
        //Base1 b = new Base1();
        //Derived1 d = new Derived1();
        //Derived1 d1 = new Derived1(23,34);
        //Derived2 d2 = new Derived2();
        Derived2 d3 = new Derived2(23,34,45);


    }
}