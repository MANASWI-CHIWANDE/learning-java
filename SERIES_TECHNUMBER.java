
import java.util.Scanner;
public class SERIES_TECHNUMBER {
    //tech number series
    public static void techNum(int n){
        int length = String.valueOf(n).length();
        int num, leftNumber , rightNumber , sumSquare;
        if (length % 2 == 0) {
            num = n;
            leftNumber = num % (int) Math.pow(10, length / 2);
            rightNumber = num / (int) Math.pow(10, length / 2);
            sumSquare = (leftNumber + rightNumber) * (leftNumber + rightNumber);
            if (sumSquare == n) System.out.print(n + "\t");
        }
    }
    public static void main(String[] args) {
        System.out.println("Author : Manaswi chiwande \t\tdate : 11-02-2022");
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER : ");
        int n = sc.nextInt();
        System.out.printf("TECH NUMBER SERIES UPTO %d IS : \n" , n);
        for(int i = 1; i<=n; i++){
            techNum(i);
        }
    }
}
