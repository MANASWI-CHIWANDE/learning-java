
import java.util.Scanner;
public class SERIES_FIBONACCI {
    //FIBONACCI SERIES
    public static int fibonacci(int x){
        if(x== 0)   return 0;
        if(x == 1)  return 1;
        return fibonacci(x-1)+fibonacci(x-2);
    }
    public static void main(String[] args) {
        System.out.println("Author : Manaswi chiwande \t\tdate : 11-02-2022");
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER OF TERMS FOR FIBONACCI SERIES : ");
        int n = sc.nextInt();
        System.out.println();
        //printing fibonacci series
        System.out.printf("FIBONACCI SERIES UPTO %d IS : ", n);
        for(int i = 0 ;i<n ;i++){
            System.out.print(fibonacci(i) + " , ");
        }
        System.out.println();
    }
}
