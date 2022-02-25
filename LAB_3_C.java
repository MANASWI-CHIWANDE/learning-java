
import java.util.Scanner;

public class LAB_3_C {
    static int factorial(int a ){
        if(a == 0) return 1;
        else return a*factorial(a-1);
    }
    public static void main(String[] args) {
        System.out.println("Author : Manaswi chiwande \t\tdate : 09-02-2022");
        Scanner sc = new Scanner(System.in);
        //WAJP to find factorial of N number using recursion technique.
        System.out.print("ENTER NUMBER TO FIND FACTORIAL : ");
        int n = sc.nextInt();
        System.out.printf("FACTORIAL OF %d is %d ",n,factorial(n));
    }
}
