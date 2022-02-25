
import java.util.Scanner;

public class Substring_Comparison {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String [] arr = new String[s.length()-2];

        for(int i = 0 ; i <s.length()-k+1 ; i++){
            arr[i] = s.substring(i,k+i);
        }
        for(int i = 0; i<arr.length-1 ; i++){
            for (int j = i+1 ; j<arr.length ; j++){
                if(arr[i].compareToIgnoreCase(arr[j]) > 0){
                    String temp = "";
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                }
            }
        }
            //Arrays.sort(arr); using sort method
        smallest = arr[0];
        largest = arr[arr.length-1];
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        System.out.println(getSmallestAndLargest(s, k));
    }
}
