
import java.util.Scanner;

public class StringTut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //A string is a sequence of characters.
        //Strings are objects that represent a char array. For example :
        char[] str = {'T','I','S','H','A'};
        String s = new String(str);
        String s1 = new String("Tisha");
        //When we create a string using "new", a new object is always created in the heap memory
        String s2 = "Tisha";
        /*
           string "Harry" is already present in the string pool, which is pointed by the str1.
           When we try to create the same string object using str2, JVM finds that string object
           with the value "Harry" is already present in the string pool;
           therefore, instead of creating a new object, a reference to the same object is returned.
        */
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);

        //Strings are immutable and cannot be changed.
        //java.lang.String class is used to create a String object.

        /*
        // DIFFERENCE BETWEEN NEXT & NEXTLINE ::
        //String s3 = sc.next();
        String s4 = sc.nextLine();
        //System.out.println(s3);
        System.out.println(s4);

         */



        //java function to print :
        // String name = new String("Harry");
        // String name = "Harry";
        // System.out.print("The name is: ");
        // System.out.println(name);
        int a = 6;
        float b = 5.6454f;
        //format specifier :%d for int  , %f for float , %c for char ,  %s for string
        System.out.printf("The value of a is %d and value of b is %8.2f", a, b);
        //printf same as format
        //System.out.format("The value of a is %d and value of b is %f", a, b);

    }
}
