

public class PS_7 {
    //1. Write a Java method to print the multiplication table of a number n.
    static void multiplication(int n ){
        for (int i =1;i<11;i++){
            System.out.printf("%d x %d = %d",n,i,n*i);
            System.out.println();
        }
    }
    //2. Write a recursive function to calculate the sum of first n natural numbers.
    static int calSum(int n ){
        int sum = 0;
        if(n ==0){
            return  0;
        }
        return (n + calSum(n-1));
    }
    //10. Repeat problem 2 using an iterative approach.
    static int calSum_iterative(int n ){
        int sum =0;
        for (int i = 1 ; i<= n ; i++){
            sum += i;
        }
        return  sum;
    }
    //3. Write a program using functions to print the following pattern:
    //      *
    //     **
    //    ***
    //   ****
    static void pat_iterative1(int n){
        for(int i = 0; i<=n ;i++){
            for(int j = n-1 ; j >=i ; j--){
                System.out.print(" ");
            }
            for(int k = 0 ; k <i ; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //5. above problem using recursion
    static void pat_rec1(int n ){
        if(n>0){
            pat_rec1(n-1);

        }
    }
    //4. Write a function to print the following pattern:
    //    ****
    //    ***
    //    **
    //    *
    static void pat_iterative(int n){
        for(int i = n; i>=1 ;i--){
            for(int j = 0 ; j< i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //6. above problem using recursion
    static void pat_rec(int n ){
        if(n>0){
            pat_rec(n-1);
            for(int i = 0 ; i < n ;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //7. Write a function to print the nth term of the Fibonacci series using recursion.
    static int fib(int n){
        if(n==0){
            return 0;
        }
        if(n==1 || n==2){
            return 1;
        }
        return (fib(n-1) + fib(n-2));
    }
    //8. Write a function to find the average of a set of numbers passed as arguments.
    static int average(int ...arr){
        int sum = 0;
        for(int ele:arr){
            sum += ele;
        }
        int avg = sum/arr.length;
        return avg;
    }
    //9. Write a function to convert Celsius temperature into Fahrenheit.
    static float temp_Control(float celsius){
        float fahrenheit;
        fahrenheit = (celsius * 9 / 5) + 32;
        return  fahrenheit;
    }
    public static void main(String[] args) {
        //multiplication(7);
        //pat_iterative1(4);
        //pat_rec(4);
       //System.out.println(calSum(4));
        //System.out.println(calSum_iterative(4));
        //System.out.println(temp_Control(34));
        //System.out.println(average(1,2,3,4));
        //System.out.println(fib(7));
    }
}
