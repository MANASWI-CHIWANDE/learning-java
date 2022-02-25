/*
   Author : Manaswi chiwande
   date : 31-01-2022
 */
import  java.util.Scanner;

//WAJP to display and find sum of Fibonacci series of Nth Term using while loop.
public class LAB_2_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Author : Manaswi chiwande \t\tdate : 31-01-2022");
        System.out.println();
        System.out.print("Enter number for which we have to find sum of fibonacci series : ");
        int n = sc.nextInt();
        int prevno = 0;
        int nextno = 1;
        int fib = 0;
        int sum = 0;
        int i = 1;
        while(i <= n ){
            fib  = prevno + nextno;
            prevno = nextno ;
            nextno = fib;
            sum += fib;
            i++;
        }
        System.out.printf("%dth Term of Fibonacci series is : %d\n",n,fib);
        System.out.printf("sum of Fibonacci series upto %dth Term is : %d",n,sum);
        System.out.println();
    }
}
