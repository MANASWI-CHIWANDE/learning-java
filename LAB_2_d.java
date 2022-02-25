/*
   Author : Manaswi chiwande
   date : 31-01-2022
 */
import java.util.Scanner;
//WAJP to find smallest alphabet in 10 alphabets using do-while loop.
public class LAB_2_d {
    public static void main(String[] args) {
        System.out.println("Author : Manaswi chiwande \t\tdate : 31-01-2022");
        Scanner sc = new Scanner(System.in);
        //to input 10 alphabet
        System.out.print("INPUT 10 CHARACTER FIRST  : ");
        char[] arr = sc.next().toCharArray();
        int i = 1;
        char smallest = arr[0];
        do{
            if(smallest > arr[i])smallest= arr[i];
            i++;
        }while(i < 10);
        System.out.println("SMALLEST ALPHABET AMONG THOSE 10 ALPHABET IS : "+smallest);

    }
}
