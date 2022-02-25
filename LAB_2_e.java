/*
   Author : Manaswi chiwande
   date : 31-01-2022
 */
import java.util.Scanner;

public class LAB_2_e {
    public static void main(String[] args) {
        System.out.println("Author : Manaswi chiwande \t\tdate : 31-01-2022");
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A 10 DIGIT NUMBER : ");
        int num = sc.nextInt();
        System.out.println("REQUIRED PATTERN IS : ");
        for(int i = 0 ; i <10 ; i++){
            System.out.println(num);
            num = num/10;
        }
    }
}
