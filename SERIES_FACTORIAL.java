
import java.util.Scanner;
public class SERIES_FACTORIAL {
    //FACTORIAL SERIES
    public static int factorial(int x){
        if(x== 0)   return 1;
        return x*factorial(x-1);
    }
    public static void main(String[] args) {
        System.out.println("Author : Manaswi chiwande \t\tdate : 11-02-2022");
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NUMBER OF TERMS FOR FACTORIAL SERIES : ");
        int n = sc.nextInt();
        System.out.println();
        //printing fibonacci series
        for(int i = 0 ;i<n ;i++){
            System.out.printf("FACTORIAL OF %d IS : %d \n",i, factorial(i) );
        }
        System.out.println();
    }
}
