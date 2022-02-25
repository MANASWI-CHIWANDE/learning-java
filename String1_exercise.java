//Given two strings of lowercase English letters,  and , perform the following operations:
//
//Sum the lengths of s1 and s2 .
//Determine if s1 is lexicographically larger than s2 (i.e.: does  come before  in the dictionary?).
//Capitalize the first letter in s1 and  s2 and print them on a single line, separated by a space.


import java.util.Scanner;
public class String1_exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(s1.length() + s2.length());
        System.out.println(s1.compareTo(s2)>0?"Yes":"No");
        System.out.println(s1.substring(0,1).toUpperCase() + s1.substring(1,s1.length()) + " " +
                           s2.substring(0,1).toUpperCase() + s2.substring(1,s2.length()));
    }
}
