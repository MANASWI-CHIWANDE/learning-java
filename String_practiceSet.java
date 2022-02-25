
import java.util.Locale;
import java.util.Scanner;
public class String_practiceSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String s = sc.nextLine();
//        //Write a Java program to convert a string to lowercase.
//        System.out.println(s.toLowerCase(Locale.ROOT));
//
//        //Write a Java program to replace spaces with underscores.
//        String s1 = sc.nextLine();
//        System.out.println(s1.replace(" ","_"));

        //Write a program to format the following letter using escape sequence characters.
        //Letter = “Dear Harry, This Java Course is nice. Thanks”
        String s2 = "Dear Harry,\n\tThis Java Course is nice.\nThanks!";
        System.out.println(s2);

        //Write a Java program to fill in a letter template which looks like below:
        //// letter = “Dear <|name|>, Thanks a lot”
        //
        //// Replace <|name|> with a string (some name)
        String s3 = "Dear <|name|>, Thanks a lot";
        System.out.println(s3.replace("<|name|>" , "Manaswi"));

        //Write a Java program to detect double and triple spaces in a string.
        String s4 = "This string contains double and  triple   spaces";
        System.out.println(s4.indexOf("  "));
        System.out.println(s4.indexOf("   "));
    }
}
