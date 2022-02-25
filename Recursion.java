

public class Recursion {
    static  int fac(int n){
        int fact = 1;
        if(n == 0 || n==1){
            return 1;
        }
        else{
            return n * fac(n-1);
        }
    }
    static int factorial_iterative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            int product = 1;
            for (int i=1;i<=n;i++){ // 1 to n
                product *= i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        System.out.println("factorial of 5 is : " + fac(5));
        System.out.println("factorial of 5 is : " + factorial_iterative(5));
    }
}
