import java.util.Scanner;

public class Condition_ex1 {
    public static void main(String[] args) {
        //Given an integer, n, perform the following conditional actions:
        //
        //If  n is odd, print Weird
        //If n  is even and in the inclusive range of  2 to 5, print Not Weird
        //If n is even and in the inclusive range of 6 to 20 , print Weird
        //If  n is even and greater than , print Not Weird


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%2==1){
            System.out.println("Weird");
        }
        if(n%2==0 && 2<=n && n<=5){
            System.out.println("Not Weird");
        }
        if(n%2==0 && 6<=n && n<=20){
            System.out.println("Weird");
        }
        if (n%2==0 && n>20){
            System.out.println("Not Weird");
        }

    }
}
