/*
   Author : Manaswi chiwande
   date : 31-01-2022
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
//WAJP to make a prototype of Calculator
public class LAB_2_a {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Author : Manaswi chiwande \t\tdate : 31-01-2022");
        System.out.println("\t\t\tWELCOME TO OUR JAVA PROGRAM");
        System.out.print("1. for addition type \'+\'\n" +
                         "2. for subtraction type \'-\'\n" +
                         "3. for multiplication type \'*\'\n" +
                         "4. for division type \'/\'\n" +
                         "5. for exponentiation type \'^\'\n" +
                         "6. for Remainder type\'%\'\n" +
                         "7. for quiting type \'Q\'\n");
        System.out.println("===================================================");
        System.out.print("ENTER FIRST NUMBER : ");
        float a = sc.nextFloat();
        System.out.print("Enter operator like (+, -, *, /, %, ^) only : ");
        char op = (char)obj.read();
        System.out.print("ENTER SECOND NUMBER : ");
        float b = sc.nextFloat();

        switch (op) {
            case '+' -> System.out.printf("%f + %f = %f", a, b, a + b);
            case '-' -> System.out.printf("%f - %f = %f", a, b, a - b);
            case '*' -> System.out.printf("%f * %f = %f", a, b, a * b);
            case '/' -> System.out.printf("%f / %f = %f", a, b, a / b);
            case '^' -> System.out.printf("%f ^ %f = %f", a, b, Math.pow(a,b));
            case '%' -> System.out.print(a + " % " + " = " + a % b);
            case 'Q' -> System.exit(0);
            default -> System.out.print("Enter valid operator please ");
        }
        System.out.println();
        System.out.println("===================================================");
    }
}
