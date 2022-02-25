import java.util.Scanner;
public class Java_Stdin_and_Stdout {
    public static void main(String[] args) {
/*
        int i = scan.nextInt();
        float d = scan.nextFloat();
        String s = scan.nextLine();

        // If you use the nextLine() method immediately following the
        // nextInt() method, recall that nextInt() reads integer tokens;
        // because of this, the last newline character for that line of
        // integer input is still queued in the input buffer and the next
        // nextLine() will be reading the remainder of the integer line (which is empty).
*/
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double d = sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
