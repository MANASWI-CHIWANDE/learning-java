/*
name : CHIWANDE MANASWI SACHIN
Q2 b WAJP to explain overloading methods. Upload Screen Shot with output.

 */
import java.util.*;
class ex{
    public static int foo(){
        return 234;
    }
    public static int foo(int x){
        return x;
    }
    public static int foo(int x , int y ){
        return x+y;
    }
}
public class MethodOverloading{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(ex.foo());
        System.out.println(ex.foo(a));
        System.out.println(ex.foo(a,b));
    }
}
