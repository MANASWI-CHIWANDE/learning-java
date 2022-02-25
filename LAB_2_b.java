/*
   Author : Manaswi chiwande
   date : 31-01-2022
 */
import java.util.Scanner;
//WAJP to read an Integer Number and display sum of even positive digits.
public class LAB_2_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Author : Manaswi chiwande \t\tdate : 31-01-2022");
        System.out.print("ENTER ANY POSITIVE INTEGER : ");
        System.out.printf("sum of even positive digits in %d is : ");
        int num = sc.nextInt();
        int numa = 0;
        int sum = 0;
        while(num>0){
            numa = num%10;
            if(numa%2 == 0) sum += numa;
            num = num/10;
        }
        System.out.printf("sum of even positive digits in %d is : %d" ,num, sum);
    }
}

