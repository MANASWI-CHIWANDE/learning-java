
import java.util.Scanner;
public class SERIES_PETERSON {
    //peterson number series -the sum of factorials of each digit of the number is equal to the number itself.
    public static int factorial(int x){
        if(x== 0)   return 1;
        return x*factorial(x-1);
    }
    public static void peterson(int n){
        int length = String.valueOf(n).length();
        int a , temp = n;
        double sum = 0;
        while(temp >0){
            a = temp%10;
            sum += factorial(a);
            temp= temp/10;
        }
        if(sum == n) System.out.print(n +"\t");
    }
    public static void main(String[] args) {
        System.out.println("Author : Manaswi chiwande \t\tdate : 11-02-2022");
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER : ");
        int n = sc.nextInt();
        System.out.printf("PETERSON NUMBER SERIES UPTO %d IS : \n" , n);
        for(int i = 1; i<=n; i++){
            peterson(i);
        }
    }
}

