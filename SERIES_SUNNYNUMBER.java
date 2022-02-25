
import java.util.Scanner;

public class SERIES_SUNNYNUMBER {
    //sunny number series -  if the number next to the given number is a perfect square
    static boolean findPerfectSquare(double n)
    {
        double square_root = Math.sqrt(n);
        return((square_root - Math.floor(square_root)) == 0);
    }
    static void isSunnyNumber(int n)
    {
        if (findPerfectSquare(n + 1)) System.out.print(n +"\t");
    }
    public static void main(String[] args) {
        System.out.println("Author : Manaswi chiwande \t\tdate : 11-02-2022");
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER : ");
        int n = sc.nextInt();
        System.out.printf("SUNNY NUMBER SERIES UPTO %d IS : \n" , n);
        for(int i = 1; i<=n; i++){
            isSunnyNumber(i);
        }
    }
}
