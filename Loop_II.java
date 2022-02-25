
import java.io.*;
import java.util.*;

public class Loop_II {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 0 ; i<q ; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int sum = a;
            for(int j = 0 ; j < n ; j ++){
                int k=(int)Math.pow(2,j);
                sum += b*k;
                System.out.print(sum);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
