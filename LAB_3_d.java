
import java.util.Scanner;
//WAJP to read any 10 Names of Student do following Operations in Menu:
//To Upper String
//To Lower String
//To Calculate Length of String
//To Display in reverse pattern
public class LAB_3_d {
    public static void main(String[] args) {
        System.out.println("Author : Manaswi chiwande \t\tdate : 09-02-2022");
        Scanner sc = new Scanner(System.in);
        String []arr = new String[10];
        //TAKING INPUT FOR STUDENTS NAMES
        for(int i = 0 ; i<10 ; i++){
            String s = sc.next();
            arr[i] = s;
        }
        //DISPLAYING NAMES OF 10 STUDENTS IN SEQUENCE
        System.out.println("NAMES OF 10 STUDENTS ARE : ");
        for(int i = 0 ; i<10 ; i++){
            System.out.print(arr[i]);
            System.out.print("\t");
        }
        System.out.println();
        System.out.println("ENTER NUMBER OF STUDENT's NAME WHOSE NAME TO BE MODIFIED : ");
        byte a = sc.nextByte();
        System.out.println("To upper the string ENTER \'1\'\nTo lower the string ENTER \'2\'\n" +
                "To calculate length 0f string ENTER \'3\'\nTo Display in reverse pattern ENTER \'4\'\n" +
                "to quit ENTER\'5\'");
        byte b = sc.nextByte();
        //CREATING MENU USING SWITCH STATEMENTS
        switch (b) {
            case 1 -> System.out.println(arr[a - 1].toUpperCase());
            case 2 -> System.out.println(arr[a - 1].toLowerCase());
            case 3 -> System.out.println(arr[a - 1].length());
            case 4 -> {
                String reverse = "";
                for (int i = arr[a - 1].length() - 1; i >= 0; i--) {
                    reverse = reverse + arr[a-1].charAt(i);
                }
                System.out.println(reverse);
            }
            case 5 -> System.exit(0);
            default -> System.out.println("ENTER CORRECT OPTION NUMBER");
        }
    }
}
