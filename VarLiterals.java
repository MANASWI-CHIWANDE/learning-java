
import java.util.Scanner ;
public class VarLiterals {
    public static void main(String[] args) {
        // declaring a new object from class Scanner
        Scanner s = new Scanner(System.in);
        System.out.println("taking user input ");
        System.out.print("enter first number : ");
        int a = s.nextInt();
        System.out.println(a);
        float b =s.nextFloat();
        System.out.println(b);
        String c = s.next();
        System.out.println(c);
        String c1 = s.nextLine();
        System.out.println(c1);




        // to check validation of user-entered data
//        boolean b1 = s.hasNextInt();
//        System.out.println(b1);
    }
}
