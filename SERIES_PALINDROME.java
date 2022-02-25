
import java.util.Scanner;
public class SERIES_PALINDROME {
    //palindrome number series
    public static void palindrome(int n){
        int r , sum = 0 ;
        int temp = n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp == sum) System.out.print(temp + "\t");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER : ");
        int n = sc.nextInt();
        System.out.printf("PALINDROME NUMBER SERIES UPTO %d IS : \n" , n);
        for(int i = 1; i<=n; i++){
            palindrome(i);
        }
    }
}
