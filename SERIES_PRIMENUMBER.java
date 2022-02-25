
import java.util.Scanner;
public class SERIES_PRIMENUMBER {
    //prime number series
    public static void prime(int n ){
        int flag = 0 ;
        if(n==2) System.out.print(n+"\t");
        else{
            for(int i = 2 ; i< n;i++){
                if(n%i == 0) flag = 1;
            }
            if(flag == 0) System.out.print(n + "\t");
        }
    }
    public static void main(String[] args) {
        System.out.println("Author : Manaswi chiwande \t\tdate : 11-02-2022");
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER OF TERMS FOR PRIME NUMBER SERIES : ");
        int n = sc.nextInt();
        System.out.println();
        System.out.printf("PRIME NUMBER SERIES UPTO %d TERMS IS : \n" , n);
        for(int i = 2 ;i<n ;i++){
            prime(i);
        }
        System.out.println();
    }
}
