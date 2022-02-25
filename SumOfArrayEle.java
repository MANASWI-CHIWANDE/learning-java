/*
name : CHIWANDE MANASWI SACHIN
Q2 a WAJP to read any 10 positive number using array and display sum and average of 10 numbers. Upload Screen Shot with output
 */
import java.util.*;
public class SumOfArrayEle {
    public static void main(String[] args) {
        int sum = 0;
        float avg;
        Scanner sc = new Scanner(System.in);
        int []arr = new int[10];
        for(int i = 0 ; i< 10 ;i++){
            int a = sc.nextInt();
            arr[i] = a;
        }
        for(int i = 0 ; i< 10 ;i++){
            sum += arr[i];
        }
        avg = sum/10f;
        System.out.println("SUM OF ALL ARRAY ELEMNT : " + sum);
        System.out.println("AVERAGE : " +avg );
    }
}