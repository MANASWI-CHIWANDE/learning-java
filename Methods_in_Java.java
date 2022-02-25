import jdk.swing.interop.SwingInterOpUtils;

public class Methods_in_Java {
    static int sum(int x , int y){
        int z = x + y ;
        return z;
    }
    static void change(int a){
        a =1000;
    }
    static void change2(int [] arr){
        arr[0]=100;
    }
    static void tellJoke(){
        System.out.println("I INVENTED A ROOM " + "BROOM");
    }
    public static void main(String[] args) {
        /*int a = 7;
        int b = 2;
        int c  = sum(a,b);
        System.out.println(c);*/
        //tellJoke();
        /* CASE 1: CHANGING THE INTEGER
        int x = 45;
        change(x);
        System.out.println("value of x after running : "+ x);*/
        /*CASE 2 : CHANGING ARRAY ELEMENT*/
        int [] marks = {12 , 23 , 34 , 45 , 56};
        change2(marks);
        System.out.println("value of array after running : "+ marks[0]);



    }
}
