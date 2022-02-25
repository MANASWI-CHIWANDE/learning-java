
import java.util.Scanner;
public class SERIES_ARMSTRONGNUMBER {
    //ARMSTRONG number series
    public static void armstrong(int n){
        int length = String.valueOf(n).length();
        int a , temp = n;
        double sum = 0;
        while(temp >0){
            a = temp%10;
            sum += Math.pow(a,length);
            temp= temp/10;
        }
        if(sum == n) System.out.print(n +"\t");
    }
    public static void main(String[] args) {
        System.out.println("Author : Manaswi chiwande \t\tdate : 11-02-2022");
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER : ");
        int n = sc.nextInt();
        System.out.printf("ARMSTRONG NUMBER SERIES UPTO %d IS : \n" , n);
        for(int i = 1; i<=n; i++){
            armstrong(i);
        }
    }
}
