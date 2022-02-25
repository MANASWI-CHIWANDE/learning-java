

public class Varargs {
    /*
    static int foo(int a ){
        return a;
    }
    static int foo(int a , int b  ){
        return a+b;
    }
    static int foo(int a ,int c , int b  ){
        return a+b+c;
    }
    static int foo(int d,int a ,int c , int b ){
        return a+b+c+d;
    }*/
    static  int foo(int ... arr){
        //this is varargs we can give n number of arguments
        //arr behave s as an array with those 3 dots
        int sum =0 ;
        for (int a : arr){
            sum += a;
        }
        return  sum;
    }

    public static void main(String[] args) {
        System.out.println("sum of 1 is : " + foo(1));
        System.out.println("sum of 1 & 2 is : " + foo(1 ,2));
        System.out.println("sum of 1  , 2 , 3 is : " + foo(1, 2, 3));
        System.out.println("sum of 1  , 2 , 3 , 4 is : " + foo(1, 2, 3 , 4));
        System.out.println("sum of 1, 2,3 is : "+ foo(1,2,3,4,5));
    }

}
