

import java.util.Scanner;

public class Sum3num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("SUM OF 3 NUMBERS");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int sum = s1+s2+s3;
        System.out.print("SUM OF THREE NUMBERS : ");
        System.out.print(sum);
    }
}
