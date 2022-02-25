import java.util.Scanner;
public class Exercise {
    public static void main(String[] args) {

/*
        //float a = 7/4 * 9/2;
        float a = 7/4.0f * 9/2.0f;
        System.out.println(a);

*/

        //Use comparison operators to find out whether a given number is greater than the user entered number or not.
        Scanner s = new Scanner(System.in);
        int z = s.nextInt();
        int x = 98;
        System.out.println(x>z);


        //Write the following expression in a java program:
        //(v^2-u^2)/2as
        int v = 5 ; int u = 3 ; float a = 1.33f ;  int s1 = 10 ;
        float f1 = (v*v - u*u)/(2*a*s1);
        System.out.println(f1);


        //Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);
        // Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}
