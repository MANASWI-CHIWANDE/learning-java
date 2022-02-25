
import java.util.Scanner;

public class PS_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        //1. Create an array of 5 floats and calculate their sum.
        float[] arr = new float[5];
        float sum = 0f;
        for(int i = 0; i<5;i++){
            float a = sc.nextFloat();
            sum += a;
        }
        System.out.printf("Sum of elements of array is  : %f",sum);
        // Practice Problem 1
        /* float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of sum is " + sum);*/


        /*
        //2. Write a program to find out whether a given integer is present in an array or not.
        int [] num = {34,56,78,89,90,12,23,};
        int a = sc.nextInt();
        boolean isInArray = false;
        for (int element : num) {
            if(element == a ) isInArray=true;
        }
        if (isInArray ){
            System.out.println("Yes ! "+a+" is present in array num");
        }
        else{
            System.out.println("not present ");
        }
         */

        /*
        //3. Calculate the average marks from an array containing marks of all students in physics using a for-each loop.
        byte n = sc.nextByte();
        float[] arr = new float[n];
        float sum = 0;
        for(int i = 0; i<n;i++){
            float a = sc.nextFloat();
            sum += a;
        }
        float avg = (sum/n);
        System.out.printf("Sum of elements of array is  : %f",avg);
         */

        /*
        //4. Create a Java program to add two matrices of size 2x3.
        int [][] arr1 = {{1,2,3},{4,5,6}};
        int [][] arr2 = {{7,8,9},{7,8,9}};
        int [][] sum = {{0,0,0},{0,0,0}};

        for(int i = 0;i <2 ;i++){
            for(int j = 0 ; j< 3;j++){
                sum[i][j]= arr1[i][j]+ arr2[i][j];
            }
        }
        for (int i = 0; i <2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sum[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
         */

        /*
        //5. Write a Java program to reverse an array.
        //method 1
        int [] num = {34,56,78,89,90};
        int n = num.length;
        int [] arr = new int [5];
        for(int i = 0 ; i<n ; i++){
            arr[i] = num [n-i-1];
        }
        System.out.println("REVERSED ARRAY IS : ");
        for(int  i = 0 ;i< n; i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        //method-2
        int [] arr = {1, 21, 3, 4, 5, 34, 67};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for(int i=0; i<n; i++){
            // Swap a[i] and a[l-1-i]
            // a   b   temp
            // |4| |3| ||
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }

        for(int element: arr){
            System.out.print(element + " ");
        }
        */

        /*
        //6. Write a Java program to find the maximum element in an array.
        int []arr = { 34,56,78,89,90};
        int max = Integer.MIN_VALUE;
        for (int element : arr) {
            if(element > max) {
                max = element;
            }
        }
        System.out.println("MAXIMUM VALUE IN ARRAY IS : "+ max);
        */
        /*
        //7. Write a Java program to find the maximum element in a Java array.
        int []arr = { 34,56,78,89,90};
        int min = Integer.MAX_VALUE; // MAX_VALUE & MIN_VALUE are fixed value in java
        for (int element : arr) {
            if(element < min) {
                min = element;
            }
        }
        System.out.println("MINIMUM VALUE IN ARRAY IS : "+ min);
         */
        //8. Write a Java program to find whether an array is sorted or not.
        int [] arr = {34,56,78,89,90};
        boolean isSorted = true;
        for(int i = 0 ; i < arr.length-1 ; i++){
            if(arr[i]> arr[i+1]){
                isSorted = false ;
                break;
            }
        }
        if(isSorted){
            System.out.println("ARRAY IS SORTED");
        }
        else {
            System.out.println("ARRAY IS UNSORTED");
        }
    }

}
